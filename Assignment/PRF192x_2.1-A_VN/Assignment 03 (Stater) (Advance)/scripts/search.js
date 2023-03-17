"use strict";

if (currentUser) {
  const inputQuery = document.getElementById("input-query");
  const navPageNum = document.getElementById("nav-page-num");
  const btnSubmit = document.getElementById("btn-submit");
  const btnPrev = document.getElementById("btn-prev");
  const pageNum = document.getElementById("page-num");
  const btnNext = document.getElementById("btn-next");
  const newsContainer = document.getElementById("news-container");
  let totalResults = 0;
  let keyWords = "";
  navPageNum.style.display = "none";
  // TODO: bắt sự kiện submit
  btnSubmit.addEventListener("click", function () {
    pageNum.textContent = "1";
    newsContainer.innerHTML = "";

    //kiểm tra người dùng có nhập từ khóa không
    if (inputQuery.value.trim().length === 0) {
      navPageNum.style.display = "none";
      alert("Nhập từ khóa để tìm kiếm");
    } else {
      //gán thông tin người dùng nhập vào cho keyWords
      keyWords = inputQuery.value;
      //gọi hàm hiển thị thông tin khi người dùng nhập từ khóa
      getDataNewsByKeyWord(keyWords, 1);
    }
  });
  // TODO: Lấy dữ liệu từ API

  /**
   *
   * @param {*} country lấy thông tin theo "country"
   * @param {*} page hiển thị thông tin theo số trang trên "API"
   */
  async function getDataNewsByKeyWord(keyWords, page) {
    try {
      const res = await fetch(
        `https://newsapi.org/v2/everything?q=${keyWords}&sortBy=popularity&pageSize=${currentUser.pageSize}&page=${page}&apiKey=8bd17430503540c9b607d9534bfce62c`
      );
      const data = await res.json();
      console.log(data);
      //kiểm tra lỗi kết nối >100 lần / ngày
      if (data.status === "error" && data.code === "rateLimited") {
        navPageNum.style.display ="none"
        throw new Error(data.message);
      }
      //kiểm tra lỗi khi chạy 1 tập tin không thông qua server => chạy trên server sẽ không có lỗi
      if (data.status === "error" && data.code === "corsNotAllowed") {
        throw new Error(data.message);
      }
      //kiểm tra nếu không có bài viết nào thì thông báo lỗi
      if (data.totalResults == 0) {
        //ẩn các nút "Next" và "Pre"
        navPageNum.style.display = "none";
        //xuất lỗi
        throw new Error(
          "Không có bài báo nào phù hợp, hãy nhập lại từ khóa mới"
        );
      }
      //khi không có lỗi hiển thị các nút "Next" và "Pre"
      navPageNum.style.display = "block";

      //gọi hàm "displayNewsList" để hiển thị "News"
      displayNewsList(data);
    } catch (error) {
      alert("Error: " + error.message);
    }
  }


  /**
   *
   * @param {*} data được lấy từ fetch API
   * hàm hiển thị "List News" trên ứng dụng
   */
  function displayNewsList(data) {
    //lấy giá trị cho biến "totalResult"
    totalResults = data.totalResults;
    checkBtnPre();
    checkBtnNext();
    let html = "";
    //tạo code "HTML" để hiển thị tin tức
    data.articles.forEach(function (item) {
      html += `
          <div class="card flex-row flex-wrap">
                      <div class="card mb-3" >
                          <div class="row no-gutters">
                              <div class="col-md-4">
                                  <img src=${
                                    item.urlToImage
                                      ? item.urlToImage
                                      : "../image/noimage.png"
                                  }
                                      class="card-img"
                                      alt=${item.title}>
                              </div>
                              <div class="col-md-8">
                                  <div class="card-body">
                                      <h5 class="card-title">${item.title}</h5>
                                      <p class="card-text">${
                                        item.description
                                      }</p>
                                      <a href=${
                                        item.url
                                      } target="_blank" class="btn btn-primary">View</a>
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
          `;
      newsContainer.innerHTML = html;
    });
  }
  // TODO: hàm kiểm tra ẩn hiện nút "Pre"
  /**
   * ẩn hiện nút "Pre"
   */
  function checkBtnPre() {
    if (pageNum.textContent == 1) {
      btnPrev.style.display = "none";
    } else {
      btnPrev.style.display = "block";
    }
  }
  // TODO: hàm kiểm tra ẩn hiện nút "Next"
  /**
   * ẩn hiện nút "Next"
   */
  function checkBtnNext() {
    //nếu "pageNum" đến tin tức cuối cùng -> làm tròn số trang lên (tổng số trang ở "API" trả về/ số tin tức hiển thị trên 1 trang )
    if (pageNum.textContent == Math.ceil(totalResults / currentUser.pageSize)) {
      btnNext.style.display = "none";
    } else {
      btnNext.style.display = "block";
    }
  }
  // TODO: bắt sự kiện "click" và nút "Previous"
  btnPrev.addEventListener("click", function () {
    //giảm xuống 1 trang
    getDataNewsByKeyWord(keyWords, --pageNum.textContent);
  });
  // TODO: bắt sự kiện "click" và nút "Next"

  btnNext.addEventListener("click", function () {
    //tăng lên 1 trang
    getDataNewsByKeyWord(keyWords, ++pageNum.textContent);
  });
} else {
  alert("Vui lòng đăng nhập /  đăng ký để truy vập vào ứng dụng");
  window.location.href = "../index.html";
}
