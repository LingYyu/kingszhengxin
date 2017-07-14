/* function reportAction() {
 	var idcard = GetRequest();
     $("#user_idcard").text(idcard);
     $.ajax({
         type: "post",
         url: "http://localhost:9999/report",
         dataType: "jsonp",
         jsonp: "report",
         jsonpCallback: "success_jsonpCallback",
         data: {
             "page": "1",
         },
         success: function(data) {
             $('#pageNum').text("共" + data[0].Age + "页");
             var text_html = [];
             if (data.length == 0) {
                 var texts = "<h3 align='center'>没有编号</h3>"
                 text_html.push(texts);
                 document.getElementById("reportpage").innerHTML = text_html.join('');
             } else {
                 for (var i = 0; i < data.length; i++) {
                     var comment = data[i];
                     var texts = "<tr>" +
                         "<td><a href='#' onclick='reportdetail()'>" + data[i].reportCode + "</a></td>" +
                         "<td>" + data[i].loanPhase + "</td>" +
                         "<td>" + data[i].productName + "</td>" +
                         "<td>" + data[i].checkTime + "</td>" +
                         "</tr>";
                     text_html.push(texts);
                 }
                 document.getElementById("wenqipeng").innerHTML = text_html.join('');
             }
         },
         error: function(data) {}

     });
 }

 function jumpPage() {
     var page = $("#page").val();
     $.ajax({
         type: "post",
         url: "http://localhost:9999/jumpPage",
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
                     "<td><a href='#' onclick='reportdetail()'>" + data[i].reportCode + "</a></td>" +
                     "<td>" + data[i].loanPhase + "</td>" +
                     "<td>" + data[i].productName + "</td>" +
                     "<td>" + data[i].checkTime + "</td>" +
                     "</tr>";
                 text_html.push(texts);
             }
             document.getElementById("wenqipeng").innerHTML = text_html.join('');
         },
         error: function(data) {}
     });
 }
  function reportShangYiYe() {
     var page = $("#page").val();
     $.ajax({
         type: "post",
         url: "http://localhost:9999/ShangYiYe",
         dataType: "jsonp",
         jsonp: "reportShangYiYe",
         jsonpCallback: "success_jsonpCallback",
         data: {
             "page": page,
         },
         success: function(data) {
             var text_html = [];
             for (var i = 0; i < data.length; i++) {
                 var comment = data[i];
                 var texts = "<tr>" +
                     "<td><a href='#' onclick='reportdetail()'>" + data[i].reportCode + "</a></td>" +
                     "<td>" + data[i].loanPhase + "</td>" +
                     "<td>" + data[i].productName + "</td>" +
                     "<td>" + data[i].checkTime + "</td>" +
                     "</tr>";
                 text_html.push(texts);
             }
             document.getElementById("wenqipeng").innerHTML = text_html.join('');
         },
         error: function(data) {}
     });
 }
  function reportXiaYiYe() {
     var page = $("#page").val();
     $.ajax({
         type: "post",
         url: "http://localhost:9999/XiaYiYe",
         dataType: "jsonp",
         jsonp: "reportXiaYiYe",
         jsonpCallback: "success_jsonpCallback",
         data: {
             "page": page,
         },
         success: function(data) {
             var text_html = [];
             for (var i = 0; i < data.length; i++) {
                 var comment = data[i];
                 var texts = "<tr>" +
                     "<td><a href='#' onclick='reportdetail()'>" + data[i].reportCode + "</a></td>" +
                     "<td>" + data[i].loanPhase + "</td>" +
                     "<td>" + data[i].productName + "</td>" +
                     "<td>" + data[i].checkTime + "</td>" +
                     "</tr>";
                 text_html.push(texts);
             }
             document.getElementById("wenqipeng").innerHTML = text_html.join('');
         },
         error: function(data) {}
     });
 }
*/
 function user_data(page) {
     var idcard = GetRequest();
     $("#user_idcard").text(idcard);
     $.ajax({
         url: "http://localhost:9999/report",
         dataType: "jsonp",
         jsonp: "user_data",
         jsonpCallback: "success_jsonpCallback",
         data: {
         	"page":page,
             "idcard": idcard,
         },
         success: function(data) {
         	$("#wenqipeng").empty();
         	$("#user_username").text(data[0].name);
             for (i in data) {
                 var html = "<tr>" +
                     "<td><a href='#' onclick='reportdetail(\""+data[i].reportCode+"\")'>" + data[i].reportCode + "</a></td>" +
                     "<td>" + data[i].loanPhase + "</td>" +
                     "<td>" + data[i].productName + "</td>" +
                     "<td>" + data[i].checkTime + "</td>" +
                     "</tr>";
                 $("#wenqipeng").append(html);

             }
         },
         error: function(data) {}
     });
 }

 function GetRequest() {
     var url = location.search; //获取url中"?"符后的字串 
     var idCard = url.slice(1);
     return idCard;
 }

 function reportdetail(reportCode) {
     window.location.href = "report_details.html?" + reportCode;
 }

 function modellige() {
     window.location.href = "model.html?" + GetRequest();
 }

 function edit() {
     window.location.href = "userlist_editfurtherinfo.html?" + GetRequest();
 }

 function loan() {
     window.location.href = "loan_infor.html?" + GetRequest();
 }
