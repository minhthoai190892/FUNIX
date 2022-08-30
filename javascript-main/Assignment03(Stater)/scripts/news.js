"use strict";

if (currentUser) {
  const newsContainer = document.getElementById("news-container");
  const btnPrev = document.getElementById("btn-prev");
  const pageNum = document.getElementById("page-num");
  const btnNext = document.getElementById("btn-next");
  //Tính số "News" tối đa trả về từ API
  let totalResult = 0;
  // TODO: Lấy dữ liệu từ API
// country: Mã code của đất nước mà bạn muốn lấy tin tức.
// category: Danh mục của tin tức.
// pageSize: Số lượng bài viết trả về khi gọi API.
// page: Thứ tự của lần trả về dữ liệu. Ví dụ có tất cả 10 bài viết, lần thứ nhất (page = 1) sẽ trả về 5 bài từ 1 --> 5 thì lần thứ 2 (page = 2) sẽ trả về 5 bài tiếp theo từ 6 --> 10.
// apiKey: Khóa để xác thực, đây là tham số bắt buộc để bạn có thể sử dụng được API.
  /**
   * 
   * @param {*} country lấy thông tin theo "country"
   * @param {*} page hiển thị thông tin theo số trang trên "API"
   */
  async function getDataNews(country,page) {
    //country,page

    try {
      const res = await fetch(
        // `https://newsapi.org/v2/top-headlines?country=${country}&page=${page}&apiKey=8bd17430503540c9b607d9534bfce62c`
          `https://newsapi.org/v2/top-headlines?country=${country}&category=${currentUser.category}&pageSize=${currentUser.pageSize}&page=${page}&apiKey=8bd17430503540c9b607d9534bfce62c`
      );
      const data = await res.json();
      console.log(data);
      //kiểm tra lỗi kết nối >100 lần / ngày
      if (data.status === "error" && data.code === "rateLimited") {
        throw new Error(data.message);
      }
      //kiểm tra lỗi khi chạy 1 tập tin không thông qua server => chạy trên server sẽ không có lỗi
      if (data.status === "error" && data.code === "corsNotAllowed") {
        throw new Error(data.message);
      }
      //gọi hàm "displayNewsList" để hiển thị "News"
      displayNewsList(data);
    } catch (error) {
      alert("Error: " + error.message);
    }
  }
  getDataNews('us',1);

  /**
   *
   * @param {*} data được lấy từ fetch API
   * hàm hiển thị "List News" trên ứng dụng
   */
  function displayNewsList(data) {
    //lấy giá trị cho biến "totalResult"
    totalResult = data.totalResults;
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
    if (pageNum.textContent == Math.ceil(totalResult / currentUser.pageSize)) {
      btnNext.style.display="none"
    }else{
      btnNext.style.display="block"

    }
  }
  // TODO: bắt sự kiện "click" và nút "Previous"
btnPrev.addEventListener('click', function () {
  //giảm xuống 1 trang
  getDataNews('us',--pageNum.textContent)
});
  // TODO: bắt sự kiện "click" và nút "Next"

btnNext.addEventListener('click', function () {
  //tăng lên 1 trang
  getDataNews('us',++pageNum.textContent)
});
} else {
  alert("Vui lòng đăng nhập /  đăng ký để truy vập vào ứng dụng");
  window.location.href = "../index.html";
}
