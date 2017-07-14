function accountAction() {
    $.ajax({
        type: "post",
        url: "http://localhost:9999/accountAction",
        dataType: "jsonp",
        jsonp: "accountAction",
        jsonpCallback: "success_jsonpCallback",
        data: {
            "page": "1",
        },
        success: function(data) {
            $('#pageNum').text("共" + data[0].carPrice + "页");
            var text_html = [];
            if (data.length == 0) {
                var texts = "<h3 align='center'>没有账单</h3>"
                text_html.push(texts);
                console.log(text_html.join(''));
                document.getElementById("accountwei1").innerHTML = text_html.join('');
                /*$('#accountwei').text("没有账单");*/

            }
            else {
                for (var i = 0; i < data.length; i++) {

                    var comment = data[i];
                    if (comment.paymentStatus == '1') {
                        var payment = "已支付"
                    } else {
                        var payment = "未支付"
                    }

                    console.log(comment);
                    var texts = "<tr><td><a href='#' onclick='accountInfoAction(" +
                        comment.id +
                        ")' data-toggle=\"modal\" data-target=\"#myModal\">" +
                        comment.id +
                        "</a></td><td>" +
                        comment.billingStardate +
                        "~" +
                        comment.billingEnddate +
                        "</td><td>￥" +
                        comment.money +
                        "</td><td>" +
                        payment +
                        "</td><td>" +
                        comment.billingEnddate +
                        "</td></tr>";
                    text_html.push(texts);
                }
                console.log(text_html.join(''));
                document.getElementById("accountwei").innerHTML = text_html.join('');
            }
        },
        error: function(data) {}
    });
}

function jumpPage() {
    var page = $("#page").val();
    $.ajax({
        type: "post",
        url: "http://localhost:9999/accountAction",
        dataType: "jsonp",
        jsonp: "accountAction",
        jsonpCallback: "success_jsonpCallback",
        data: {
            "page": page,
        },
        success: function(data) {
            var text_html = [];
            for (var i = 0; i < data.length; i++) {
                var comment = data[i];
                if (comment.paymentStatus == '1') {
                    var payment = "已支付"
                } else {
                    var payment = "未支付"
                }

                console.log(comment);
                var texts = "<tr><td><a href='#' onclick='accountInfoAction(" +
                    comment.id +
                    ")' data-toggle=\"modal\" data-target=\"#myModal\">" +
                    comment.id +
                    "</a></td><td>" +
                    comment.billingStardate +
                    "~" +
                    comment.billingEnddate +
                    "</td><td>￥" +
                    comment.money +
                    "</td><td>" +
                    payment +
                    "</td><td>" +
                    comment.billingEnddate +
                    "</td></tr>";
                text_html.push(texts);
            }
            console.log(text_html.join(''));
            document.getElementById("accountwei").innerHTML = text_html.join('');

        },
        error: function(data) {}
    });
}

function accountShangYiYe() {
    var page = $("#page").val();
    $.ajax({
        type: "post",
        url: "http://localhost:9999/accountShangYiYe",
        dataType: "jsonp",
        jsonp: "accountAction",
        jsonpCallback: "success_jsonpCallback",
        success: function(data) {
            var text_html = [];
            for (var i = 0; i < data.length; i++) {
                var comment = data[i];
                if (comment.paymentStatus == '1') {
                    var payment = "已支付"
                } else {
                    var payment = "未支付"
                }

                console.log(comment);
                var texts = "<tr><td><a href='#' onclick='accountInfoAction(" +
                    comment.id +
                    ")' data-toggle=\"modal\" data-target=\"#myModal\">" +
                    comment.id +
                    "</a></td><td>" +
                    comment.billingStardate +
                    "~" +
                    comment.billingEnddate +
                    "</td><td>￥" +
                    comment.money +
                    "</td><td>" +
                    payment +
                    "</td><td>" +
                    comment.billingEnddate +
                    "</td></tr>";
                text_html.push(texts);
            }
            console.log(text_html.join(''));
            document.getElementById("accountwei").innerHTML = text_html.join('');

        },
        error: function(data) {}
    });
}

function accountXiaYiYe() {
    var page = $("#page").val();
    $.ajax({
        type: "post",
        url: "http://localhost:9999/accountXiaYiYe",
        dataType: "jsonp",
        jsonp: "accountAction",
        jsonpCallback: "success_jsonpCallback",
        success: function(data) {
            var text_html = [];
            for (var i = 0; i < data.length; i++) {
                var comment = data[i];
                if (comment.paymentStatus == '1') {
                    var payment = "已支付"
                } else {
                    var payment = "未支付"
                }

                console.log(comment);
                var texts = "<tr><td><a href='#' onclick='accountInfoAction(" +
                    comment.id +
                    ")' data-toggle=\"modal\" data-target=\"#myModal\">" +
                    comment.id +
                    "</a></td><td>" +
                    comment.billingStardate +
                    "~" +
                    comment.billingEnddate +
                    "</td><td>￥" +
                    comment.money +
                    "</td><td>" +
                    payment +
                    "</td><td>" +
                    comment.billingEnddate +
                    "</td></tr>";
                text_html.push(texts);
            }
            console.log(text_html.join(''));
            document.getElementById("accountwei").innerHTML = text_html.join('');

        },
        error: function(data) {}
    });

}

function accountInfoAction(id) {
    $.ajax({
        type: "post",
        url: "http://localhost:9999/accountInfoAction",
        dataType: "jsonp",
        jsonp: "accountInfoAction",
        jsonpCallback: "success_jsonpCallback",
        data: {
            "id": id
        },
        success: function(data) {
            $('#zdxq').text("账单详情-" + data.id);
            $('#khmc').text(data.businessInformation);
            $('#khlx').text(data.businessType);
            $('#zdzq').text(data.billingStardate + "至" + data.billingEnddate);
            $('#sysyye').text(data.balance);
            $('#byczye').text(data.recharge);
            $('#byje').text(data.money);

            $('#xszcs').text(data.drivingTimes);
            $('#xszdj').text(data.drivingPrice);
            $('#xszzs').text(data.drivingTimes * data.drivingPrice + ".00");

            $('#clwzcx').text(data.carTimes);
            $('#clwzdj').text(data.carPrice);
            $('#clwzzj').text(data.carTimes * data.carPrice + ".00");

            $('#fxjlcs').text(data.flyTimes);
            $('#fxjldj').text(data.flyPrice);
            $('#fxjlzj').text(data.flyTimes * data.flyPrice + ".00");

            $('#xlcx').text(data.eduTimes);
            $('#xldj').text(data.eduPrice);
            $('#xlzj').text(data.eduTimes * data.eduPrice + ".00");
            $('#zj').text(1185.0 + data.drivingTimes * data.drivingPrice + data.carTimes * data.carPrice + data.flyTimes * data.flyPrice + data.eduTimes * data.eduPrice + ".00");

        },
        error: function(data) {}
    });
}

function preview(oper) {
    if (oper < 10) {
        bdhtml = window.document.body.innerHTML; //获取当前页的html代码 
        sprnstr = "<!--startprint" + oper + "-->"; //设置打印开始区域 
        eprnstr = "<!--endprint" + oper + "-->"; //设置打印结束区域 
        prnhtml = bdhtml.substring(bdhtml.indexOf(sprnstr) + 18); //从开始代码向后取html 

        prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr)); //从结束代码向前取html 
        window.document.body.innerHTML = prnhtml;
        window.print();
        window.document.body.innerHTML = bdhtml;
    } else {
        window.print();

    }
}
function hidemodal(){
    // $("#myModal").modal("hide");
    // document.getElementById("myModal").style.display="none";
    $("#myModal").css("display","none");
    $(".modal-backdrop").css("display","none");
}



function uploadAccount() {
    $.ajax({
        type: "post",
        url: "http://localhost:9999/uploadAccountExcel",
        dataType: "jsonp",
        jsonp: "uploadAccount",
        jsonpCallback: "success_jsonpCallback",
        data: {
        },
        success: function(data) {
           if(data==0){
           	 $("#checkimg").modal("show");
           	//alert("账单已下载至E盘，请去E盘查看")
           }
        },
        error: function(data) {}
    });
}
