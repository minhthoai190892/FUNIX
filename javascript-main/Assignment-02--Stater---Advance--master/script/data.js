"use strict";
const fileInput = document.getElementById("input-file");
const importBtn = document.getElementById("import-btn");
const exportBtn = document.getElementById("export-btn");
// TODO: bắt sự kiện click vào "Export"
exportBtn.addEventListener("click", function () {
  const messExport = confirm;
  if (confirm("Bạn xác nhận chắc chắn Export")) {
    saveStaticDataToFile();
  }
});

// TODO: Hàm lưu dữ liệu xuống file
function saveStaticDataToFile() {
  //tạo dữ liệu để lưu xuống file
  const blob = new Blob([JSON.stringify(getFormStorage("petArr"), null, 2)], {
    type: "application/json",
  });

  //lưu file
  saveAs(blob, "petData.json");
}
// TODO: bắt sự kiện click vào "Import"
importBtn.addEventListener("click", function () {
  //kiểm tra người dùng có nhập file chưa?
  if (!fileInput.value) {
    alert("Vui lòng chọn File");
  } else {
    if (confirm("Bạn xác nhận chắc chắn Import")) {
      const file = fileInput.files[0];
      const reader = new FileReader();
      //sự kiện load dữ liệu từ file lên
      reader.addEventListener(
        "load",
        function () {
          //kiểm tra cấu trúc của file có hợp lệ với đạnh dạng yêu cầu không
        //   const isValidateFile = checkFile(JSON.parse(reader.result));
          const isValidateFile = JSON.parse(reader.result);
          if (isValidateFile) {
            // lưu dữ liệu xuống localStorage
            saveToStorage("petArr", JSON.parse(reader.result));
            // thông báo import thành công
            alert("Import thành công");
          }
        },
        false
      );
      //đọc file
      if (file) {
        reader.readAsText(file)
      }
      //reset file input
      fileInput.value =""
    }
  }
});
