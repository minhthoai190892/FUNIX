'use strict';

const btn = document.querySelector('.btn-country');
const countriesContainer = document.querySelector('.countries');

///////////////////////////////////////

const renderCountry = function (data, className = '') {
  const html = `<article class="country ${className}">
        <img class="country__img" src="${data.flag}" />
        <div class="country__data">
          <h3 class="country__name">${data.name}</h3>
          <h4 class="country__region">${data.region}</h4>
          <p class="country__row"><span>👫</span>${(
            data.population / 1000000
          ).toFixed(1)}</p>
          <p class="country__row"><span>🗣️</span>${data.languages[0].name}</p>
          <p class="country__row"><span>💰</span>${data.currencies[0].name}</p>
        </div>
      </article>`;
  countriesContainer.insertAdjacentHTML('beforeend', html);
  // countriesContainer.innerHTML = html
  countriesContainer.style.opacity = 1;
};

const renderError = function (msg) {
  countriesContainer.insertAdjacentText('beforeend', msg);
  countriesContainer.style.opacity = 1;
};

//tạo biến lưu trữ dữ liệu API\
// const getCountryData = function (country) {
//   const request = new XMLHttpRequest();
//   //lấy dữ liệu API vơi "GET" và "URL"
//   request.open('GET', `https://restcountries.com/v2/name/${country}`);
//   //sau khi lấy dữ liệu và tiếp tục gửi đi với "send"
//   request.send();

//   request.addEventListener('load', function () {
//     console.log(this.responseText); //chuổi "Json"
//     //chuyển dữ liệu về dạng "Object"
//     const [data] = JSON.parse(this.responseText);
//     console.log(data);
//     // hiển thị trên ứng dụng
//     const html = `<article class="country">
//     <img class="country__img" src="${data.flag}" />
//     <div class="country__data">
//       <h3 class="country__name">${data.name}</h3>
//       <h4 class="country__region">${data.region}</h4>
//       <p class="country__row"><span>👫</span>${(
//         data.population / 1000000
//       ).toFixed(1)}</p>
//       <p class="country__row"><span>🗣️</span>${data.languages[0].name}</p>
//       <p class="country__row"><span>💰</span>${data.currencies[0].name}</p>
//     </div>
//   </article>`;
//     countriesContainer.insertAdjacentHTML('beforeend', html);
//     // countriesContainer.innerHTML = html
//     countriesContainer.style.opacity = 1;
//   });
// };
// getCountryData(`USA`)
// getCountryData(`US`)
// getCountryData(`UK`)
// getCountryData(`Japan`)

// const getCountryAndNeighbour = function (country) {
//   const request = new XMLHttpRequest();
//   //lấy dữ liệu API vơi "GET" và "URL"
//   request.open('GET', `https://restcountries.com/v2/name/${country}`);
//   //sau khi lấy dữ liệu và tiếp tục gửi đi với "send"
//   request.send();

//   request.addEventListener('load', function () {
//     console.log(this.responseText); //chuổi "Json"
//     //chuyển dữ liệu về dạng "Object"
//     const [data] = JSON.parse(this.responseText);
//     console.log(data);
//     // hiển thị trên ứng dụng
//     renderCountry(data,"asdas");
//     //lấy quốc gia láng giềng
//     const [neighbour] = data.borders;
//     console.log(neighbour);
//     if (!neighbour) {
//       return;
//     }
//     // sau khi lấy được neighbour tiếp theo ta lấy dữ liệu từ API
//     const request2 = new XMLHttpRequest();
//     //lấy dữ liệu API vơi "GET" và "URL"
//     request2.open('GET', `https://restcountries.com/v2/alpha/${neighbour}`);
//     //sau khi lấy dữ liệu và tiếp tục gửi đi với "send"
//     request2.send();
//     // bắt sự kiện "load"
//     request2.addEventListener('load', function () {
//       console.log(this.responseText);
//       // chuyển dữ liệu về dạng "OBject"
//       const data2 = JSON.parse(this.responseText);
//       renderCountry(data2, 'neighbour');
//     });
//   });
// };
// getCountryAndNeighbour(`USA`);

// const request = fetch(`https://restcountries.com/v2/name/USA`);

// console.log(request);
// const getCountryData = function (country) {
//   fetch(`https://restcountries.com/v2/name/${country}`)
//   .then(function (
//     response
//   ) {
//     console.log(response);
//     return response.json() //=> trả về 1 promise
//   }).then(function (data) {
//     console.log(data);//=> dữ liệu được trả về từ API
//     //hiển thị ra ứng dụng
//     renderCountry(data[0])
//    });
// };

// getCountryData("UK")

// const getCountryData = function (country) {
//   fetch(`https://restcountries.com/v2/name/${country}`)
//     .then(
//       response => response.json() //=> trả về 1 promise
//     )
//     .then(data => {
//       renderCountry(data[0]);
//       //tạo biến chứa các quôc gia láng giềng
//       const neighbour = data[0].borders?.[0];
//       if (!neighbour) {
//         return;
//       }
//       //sau khi có dữ liệu ta nạp API tiếp theo để tìm "neighbour"
//       return fetch(`https://restcountries.com/v2/alpha/${neighbour}`)
//         .then(response => response.json())
//         .then(data => renderCountry(data, `neighbour`));
//     })
//     .catch(err => {
//      console.log(`${err} 💥💥💥💥`);
//         renderError(`Something went wrong 💥💥💥💥 ${err.message}`)
//     });
// };
// btn.addEventListener('click', function () {
//   getCountryData('VN');
// });
// getCountryData('VNasd');

// async là hàm bất đồng bộ
//await là hàm chờ sau khi sử lý kết quả xogn
const whereAmI = async function (country) {
 const res = await fetch(`https://restcountries.com/v2/name/${country}`);
 const data = await res.json()
 console.log(data);
 renderCountry(data[0])
    const row = document.createElement("p")
    row.innerHTML = data[0].name
    test.appendChild(row)

};
whereAmI("USA")


const test = document.getElementById('test');
// btn.addEventListener('click', function () {
//   const html = ` <img src="https://images.unsplash.com/photo-1662675114403-5ebfa9448070?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHx0b3BpYy1mZWVkfDJ8eGpQUjRobGtCR0F8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60" alt="">`;
//   test.innerHTML = html
// });
