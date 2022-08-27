function func1() {
  $("#img1").fadeToggle();
}

function func2() {
  // id chỉ cho phép 1 element đầu tiên
  $("#p1").css("background-color", "grey");
  // $("#p2").css('font-weight','bold');
  // $(".p1").css('font-weight','bold');
  // class cho phép nhiều class cùng thay đổi
  $(".p2").css("background-color", "green");
  // thay đổi một lúc nhiều id
  $("#div1,#div2_3").css("background-color", "aqua");
  $("#div1,ul").css("background-color", "purple");
  $("#div1,li").css("color", "white");
  //
  $("p:first").fadeToggle();
  //ẩn li lẽ
  // $('li:even').fadeToggle();
  //ẩn li chẵn
  $("li:odd").fadeToggle();
}

// Test 3

//javascript
// function func3(){

//     document.getElementById('img3').style.width='500px';
// }
//Jquery
$("document").ready(function () {
  // double dbl
  $("#btn3").click(func3_3);

  function func3_3() {
    $("#img3").css("width", "500px");
    $("#img3").css("height", "500px");
  }

  // sự kiện chuột
  // $("#img3").mouseenter(function () {
  //     $('#img3').css('width','500px');
  //     $('#img3').css('height','500px');
  // });
  // $("#img3").mouseleave(function () {
  //     $('#img3').css('width','100px');
  //     $('#img3').css('height','100px');
  // });

  // gọp sự kiện
  $("#img3").hover(func3_1, func3_2);
  function func3_1() {
    $("#img3").css("width", "500px");
    $("#img3").css("height", "500px");
  }
  function func3_2() {
    $("#img3").css("width", "100px");
    $("#img3").css("height", "100px");
  }
  // Test 3
  // Test 4
  $("#btn4-1").click(function () {
    $("#img4").hide(2000);
  });
  $("#btn4-2").click(function () {
    $("#img4").show(2000);
  });
  $("#btn4-3").click(function () {
    $("#img4").fadeToggle(3000);
  });

  $("#btn4-4").click(function () {
    $("#img4").fadeIn(2000);
  });
  $("#btn4-5").click(function () {
    $("#img4").fadeOut(2000);
  });
  $("#btn4-6").click(function () {
    $("#img4").fadeToggle(3000);
  });

  $("#btn4-7").click(function () {
    $("#img4").slideUp(2000);
  });
  $("#btn4-8").click(function () {
    $("#img4").slideDown(2000);
  });
  $("#btn4-9").click(function () {
    $("#img4").slideToggle(3000);
  });
  $("#btn4-10").click(function () {
    $("#img4").stop();
  });
  // Test 4
  // Test 5 Animate
  // phải có poisition

  // $("#btn5-1").click(function () {
  //   $("#img5").animate(
  //     { left: "150px", opacity: "1", width: "250px", height: "250px" },
  //     2000,function () {
  //       alert('123')
  //     } //'slow'
  //   );

  // });
  // $('#btn5-1').click(function(){
  //   $("#img5").slideUp(2000,function () {
  //     $("#img5").slideDown(2000);//2s
  //   })
  // })
  $("#btn5-1").click(function () {
    $("#img5").slideUp(2000).slideDown(2000).fadeOut(2000).fadeIn(2000);
  });
  // Test 5  Animate
  // Test 6

  // $('.div6-1').click(function(){
  //   var x = $('.p6-1').html();
  //   $('#span6-1').text(x);
  // })
$('.div6-1').click(function () {
  alert($('.p6-1').html());
})
  // Test 6
});
