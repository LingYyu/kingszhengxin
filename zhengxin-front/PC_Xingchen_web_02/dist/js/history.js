 function history(currentPage) {
    // var idcard = GetRequest();
    //  $("#user_idcard").text(idcard);
     $.ajax({
         type: "POST",
         url: "http://localhost:9999/CheckHistoryAlllist",
         dataType: "jsonp",
         jsonp: "history",
         jsonpCallback: "success_jsonpCallback",
         data: {
             "currentPage": currentPage,
         },
         error: function(data) {

         },
         success: function(data) {
             if (data.length == 0) {
                 $("#historypage").css("display", "none");
                 $("#messagewei").css("display", "block");
             } else {
                 $("#historypage").css("display", "block");
                 $("#messagewei").css("display", "none");
             }
             $("#historybody").empty();
             for (i in data) {
                 $("#historybody").append(
                     "<tr>" + "<td>" + data[i].name + "</td>" +
                     "<td>" + data[i].idCard + "</td>" +
                     "<td>" + data[i].loanPhase + "</td>" + "<td>" + data[i].productName + "</td>" +
                     "<td><a href='#'><div onclick='update(\""+data[i].reportCode+"\")'>" +
                     data[i].reportCode + "</div></a></td>" +
                     "<td>" + data[i].updateTime + "</td>" +
                     "</tr>");
             }
         }
     });
 }
 function update(btn) {
    /* var tr = btn.parentElement.parentElement.parentElement;
     var td = tr.cells[1];*/
     window.location.href = "report_details.html?" + btn;
 }


 /*function historyAction() {
     $.ajax({
         type: "post",
         url: "http://localhost:9999/historyAction",
         dataType: "jsonp",
         jsonp: "historyAction",
         jsonpCallback: "success_jsonpCallback",
         data: {
             "page": "1",
         },
         success: function(data) {
             $('#pageNum').text("共" + data[0].carPrice + "页");
             var text_html = [];
             if (data.length == 0) {
                 var texts = "没有记录"
                 text_html.push(texts);
                 document.getElementById("historypage").innerHTML = text_html.join('');
                 // $("#historypage").text("没有记录");
             } else {
                 for (var i = 0; i < data.length; i++) {
                     var comment = data[i];
                     var texts = "<tr><td>" + comment.name +
                         "</td><td>" + comment.idCard +
                         "</td><td>" + comment.loanPhase +
                         "</td><td>" + comment.productName +
                         "</td><td><a><div onclick='update(this)'>" + comment.reportCode +
                         "</div></a></td><td>" + comment.checkTime +
                         "</td></tr>";
                     text_html.push(texts);
                 }
                 document.getElementById("historybody").innerHTML = text_html.join('');
             }
         },
         error: function(data) {}
     });
 }
*/
 /*function jumpPage() {
     var page = $("#page").val();
     $.ajax({
         type: "post",
         url: "http://localhost:9999/historyAction",
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
                 var texts = "<tr><td>" + comment.name +
                     "</td><td>" + comment.idCard +
                     "</td><td>" + comment.loanPhase +
                     "</td><td>" + comment.productName +
                     "</td><td><a><div onclick='update(this)'>" + comment.reportCode +
                     "</div></a></td><td>" + comment.checkTime +
                     "</td></tr>";
                 text_html.push(texts);
             }
             document.getElementById("historybody").innerHTML = text_html.join('');
         },
         error: function(data) {}
     });
 }

 function historyShangYiYe() {
     var page = $("#page").val();
     $.ajax({
         type: "post",
         url: "http://localhost:9999/historyShangYiYe",
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
                 var texts = "<tr><td>" + comment.name +
                     "</td><td>" + comment.idCard +
                     "</td><td>" + comment.loanPhase +
                     "</td><td>" + comment.productName +
                     "</td><td><a><div onclick='update(this)'>" + comment.reportCode +
                     "</div></a></td><td>" + comment.checkTime +
                     "</td></tr>";
                 text_html.push(texts);
             }
             document.getElementById("historybody").innerHTML = text_html.join('');
         },
         error: function(data) {}
     });
 }

 function historyXiaYiYe() {
     var page = $("#page").val();
     $.ajax({
         type: "post",
         url: "http://localhost:9999/historyXiaYiYe",
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
                 var texts = "<tr><td>" + comment.name +
                     "</td><td>" + comment.idCard +
                     "</td><td>" + comment.loanPhase +
                     "</td><td>" + comment.productName +
                     "</td><td><a><div onclick='update(\""+comment.reportCode+"\")'>" + comment.reportCode +
                     "</div></a></td><td>" + comment.checkTime +
                     "</td></tr>";
                 text_html.push(texts);
             }
             document.getElementById("historybody").innerHTML = text_html.join('');
         },
         error: function(data) {}
     });
 }*/
 // 获取idcard
