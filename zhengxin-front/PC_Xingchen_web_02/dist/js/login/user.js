  function selectUser() {
      var name = $("#exampleInputName").val();
      var idCard = $("#exampleInputIdcode").val();
      $.ajax({
          type: "post",
          url: "http://localhost:9999/selectUser",
          dataType: "jsonp",
          jsonp: "callbackparam",
          jsonpCallback: "success_jsonpCallback",
          data: {
              "name": name,
              "idCard": idCard,
          },
          success: function(data) {
          	
          	if(name==""&&idCard==""){
          		window.location.href="user.html";
          	}else{
          		$("#userpage").css("display","none");
          		$("#userlist").html("");
              for (i in data) {
                  var html = "<tr>" +
                      "<td>" + data[i].username + "</td>" +
                      "<td>" + data[i].idCard + "</td>" +
                      "<td>" + "<a href='##'>" + "<div onclick='update(this)'>" + data[i].count + "</div>" + "</a>" + "</td>" +
                      "<td>" + data[i].lastTime + "</td>" +
                      "</tr>";

                  $("#userlist").append(html);
              }
          	}
              
          },
          error: function(data) {}
      });
  }

  function user_data(page) {
      $.ajax({
         type: "post",
          url: "http://localhost:9999/showAllUserReportNum",
          dataType: "jsonp",
          jsonp: "callbackparam",
          jsonpCallback: "success_jsonpCallback",
          data: {
							"page":page,
          },
          success: function(data) {
          	$("#userlist").empty();
              for (i in data) {
                  var html = "<tr>" +
                      "<td>" + data[i].username + "</td>" +
                      "<td>" + data[i].idCard + "</td>" +
                      "<td>" + "<a href='##'>" + "<div onclick='update(this)'>" + data[i].count + "</div>" + "</a>" + "</td>" +
                      "<td>" + data[i].lastTime + "</td>" +
                      "</tr>";
                  $("#userlist").append(html);
              }
          },
          error: function(data) {

          }
      });
  }

  // 获取idcard
  function update(btn) {
      var tr = btn.parentElement.parentElement.parentElement;
      var td = tr.cells[1];
      window.location.href = "report.html?" + td.innerHTML;
      // alert(td.innerHTML);
  }

  function userAction() {
      $.ajax({
          type: "post",
          url: "http://localhost:9999/userAction",
          dataType: "jsonp",
          jsonp: "userAction",
          jsonpCallback: "success_jsonpCallback",
          data: {
              "page": "1",
          },
          success: function(data) {
              $('#pageNum').text("共" + data[0].carPrice + "页");
              var text_html = [];
              if (data.length == 0) {
                  var texts = "没有用户"
                  text_html.push(texts);
                  document.getElementById("userpage").innerHTML = text_html.join('');
              } else {
                  for (var i = 0; i < data.length; i++) {
                      var comment = data[i];
                      var texts = "<tr>" +
                          "<td>" + comment.username + "</td>" +
                          "<td>" + comment.idCard + "</td>" +
                          "<td>" + "<a href='##'>" + "<div onclick='update(this)'>" + comment.count + "</div>" + "</a>" + "</td>" +
                          "<td>" + comment.lastTime + "</td>" +
                          "</tr>";
                      text_html.push(texts);
                  }
                  document.getElementById("userlist").innerHTML = text_html.join('');

              }
          },
          error: function(data) {}
      });
  }

  function jumpPage() {
      var page = $("#page").val();
      $.ajax({
          type: "post",
          url: "http://localhost:9999/userAction",
          dataType: "jsonp",
          jsonp: "jumpPage",
          jsonpCallback: "success_jsonpCallback",
          data: {
              "page": page,
          },
          success: function(data) {
              var text_html = [];
              for (var i = 0; i < data.length; i++) {
                  var comment = data[i];
                  var texts = "<tr>" +
                      "<td>" + comment.username + "</td>" +
                      "<td>" + comment.idCard + "</td>" +
                      "<td>" + "<a href='##'>" + "<div onclick='update(this)'>" + comment.count + "</div>" + "</a>" + "</td>" +
                      "<td>" + comment.lastTime + "</td>" +
                      "</tr>";
                  text_html.push(texts);
              }
              document.getElementById("userlist").innerHTML = text_html.join('');
          },
          error: function(data) {}
      });
  }

  function userShangYiYe() {
      var page = $("#page").val();
      $.ajax({
          type: "post",
          url: "http://localhost:9999/userShangYiYe",
          dataType: "jsonp",
          jsonp: "userShangYiYe",
          jsonpCallback: "success_jsonpCallback",
          success: function(data) {
              var text_html = [];
              for (var i = 0; i < data.length; i++) {
                  var comment = data[i];
                  var texts = "<tr>" +
                      "<td>" + comment.username + "</td>" +
                      "<td>" + comment.idCard + "</td>" +
                      "<td>" + "<a href='##'>" + "<div onclick='update(this)'>" + comment.count + "</div>" + "</a>" + "</td>" +
                      "<td>" + comment.lastTime + "</td>" +
                      "</tr>";
                  text_html.push(texts);
              }
              document.getElementById("userlist").innerHTML = text_html.join('');
          },
          error: function(data) {}
      });
  }

  function userXiaYiYe() {
      var page = $("#page").val();
      $.ajax({
          type: "post",
          url: "http://localhost:9999/userXiaYiYe",
          dataType: "jsonp",
          jsonp: "userShangYiYe",
          jsonpCallback: "success_jsonpCallback",
          success: function(data) {
              var text_html = [];
              for (var i = 0; i < data.length; i++) {
                  var comment = data[i];
                  var texts = "<tr>" +
                      "<td>" + comment.username + "</td>" +
                      "<td>" + comment.idCard + "</td>" +
                      "<td>" + "<a href='##'>" + "<div onclick='update(this)'>" + comment.count + "</div>" + "</a>" + "</td>" +
                      "<td>" + comment.lastTime + "</td>" +
                      "</tr>";
                  text_html.push(texts);
              }
              document.getElementById("userlist").innerHTML = text_html.join('');
          },
          error: function(data) {}
      });
  }
