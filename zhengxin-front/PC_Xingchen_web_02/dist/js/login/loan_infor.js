$(function() {
    username();
});



function checkTel(tel) {
        //var isPhone = /^([0-9]{3,4}-)?[0-9]{7,8}$/;
        //var isMob = /^((\+?86)|(\(\+86\)))?(13[0123456789][0-9]{8}|15[012356789][0-9]{8}|18[02356789][0-9]{8}|147[0-9]{8}|1349[0-9]{7})$/;
        //var value = tel.replace(/^\s\s*/, '').replace(/\s\s*$/, '');
        var isMob = /^(13[0-9]{9})|(15[0-9]{9})|(18[0-9]{9}$)/;
        if (isMob.test(tel)&&tel.length==11) {
            return true;
        } else {
            return false;
        }
}

   function isTel(event) {
        if (checkTel($(event).val())) {
            $(event).removeClass('form-control_red');
        } else {
            $(event).addClass('form-control_red');
        }
    }


function loan(page) {
    var idCard = GetRequest();
    $.ajax({
        type: "post",
        url: "http://localhost:9999/SubmitterAndCreateTime",
        dataType: "jsonp",
        jsonp: "loan",
        jsonpCallback: "success_jsonpCallback",
        data: {
        	"page":page,
            "idCard": idCard,
        },
        success: function(data) {
        	$("#commit").empty();
            for (var i = 0; i < data.length; i++) {
                var html = "<tr>" + "<td>" + data[i].submitter + "</td>" +
                    "<td><a href = '#'  onclick = 'show(\""+data[i].id+"\")' id='createTime'>" +
                    data[i].createTime + "</a></td>" + "</tr>";
                $("#commit").append(html);
            }
        },
        error: function(data) {

        }

    });
}

function username() {
    $.ajax({
        type: "post",
        url: "http://localhost:9999/getname",
        dataType: "jsonp",
        jsonp: "username",
        //          jsonpCallback: "success_jsonpCallback",
        data: {
           
        },
        success: function(data) {
            $("#user_idcard").text(data.idCard);
            $("#user_username").text(data.userName);

            //电话
            $("#exampleInputTel1").text(data.phone);
        },
        error: function(data) {

        }
    });
}

function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串 
    var idCard = url.slice(1);
    return idCard;
}

function modellige() {
    window.location.href = "model.html?" + GetRequest();
}

function edit() {
    window.location.href = "userlist_editfurtherinfo.html?" + GetRequest();
}

function report() {
    window.location.href = "report.html?" + GetRequest();
}

function firm() {
    var exampleInputrepeatData = $("#exampleInputrepeatData1").val();
    var exampleInputrepeathetong = $("#exampleInputrepeathetong1").val();
    var exampleInputrepeatqixian = $("#exampleInputrepeatqixian1").val();
    var exampleInputrepeatmoney = $("#exampleInputrepeatmoney1").val();
    var exampleInputTel = $("#exampleInputTel1").val();
    var exampleInputrepeatpurpose = $("#exampleInputrepeatpurpose1").val();
    var exampleInputtype = $("#exampleInputtype1").val();
    var exampleInputaddress = $("#exampleInputaddress1").val();
    var sfzdk = $("#sfzdk1").val();
    var sfsl = $("#sfsl1").val();
    var sfyycfq = $("#sfyycfq1").val();
    var month_money = $("#month_money1").val();
    var stage_money = $("#stage_money1").val();
    var salary_money = $("#salary_money1").val();
    var address = $("#address1").val();
    var company_type = $("#company_type1").val();
    var csjj = $("#csjj1").val();
    var stages_or = $("#stages_or1").val();
    var stages_money = $("#stages_money1").val();
    var long_owed = $("#long_owed1").val();
    var arrears_or = $("#arrears_or1").val();
    var contact_or = $("#zp1").val();
    var sfyq = $("#sfyq1").val();
    var yzdz = $("#yzdz1").val();
    var arrears_day = $("#arrears_day1").val();
    var remarks = $("#remarks1").val();
    
    $.ajax({
        url: "http://localhost:9999/insertInfo1",
        dataType: "jsonp",
        jsonp: "firm", //服务端用于接收callback调用的function名的参数 
        jsonpCallback: "success_jsonpCallback", //callback的function名称,服务端会把名称和data一起传递回来
        data: {
            "borrowDate": exampleInputrepeatData,
            "borrow_contractno": exampleInputrepeathetong,
            "period": exampleInputrepeatqixian,
            "amount": exampleInputrepeatmoney,
            "phone": exampleInputTel,
            "purpose": exampleInputrepeatpurpose,
            "borrow_type": exampleInputtype,
            "contact_address": exampleInputaddress,
            "borrow_status": sfzdk,
            "sfsl": sfsl,
            "instalment_again": sfyycfq,
            "monthly_repay": month_money,
            "instalment_amount": stage_money,
            "salary": salary_money,
            "company_address": address,
            "company_type": company_type,
            "primary_reject": csjj,
            "contactless": contact_or,
            "chect": contact_or,
            "extension": sfyq,
            "reject_time": stages_or,
            "reject_amount": stages_money,
            "longterm_arrear": long_owed,
            "capital_debt": yzdz,
            "overdue": arrears_or,
            "overdue_days": arrears_day,
            "other_infos": remarks,
        },
        success: function(data) {
        	
            if (data != null) {
                window.location.href = "loan_infor.html";

            } else if (data == null) {
              qingkong();
            }
        },
        error: function(data) {
            qingkong();
        },
    });
}


 function qingkong(){
         //借款日期
          $("#exampleInputrepeatData1").val("");
          //借款合同号
          $("#exampleInputrepeathetong1").val("");
          //借款期限
          $("#exampleInputrepeatqixian1").val("");
          //借款金额
          $("#exampleInputrepeatmoney1").val("");
          //联系电话
          $("#exampleInputTel1").val("");
          //借款用途
           $("#exampleInputrepeatpurpose1").val("");
          //借款类型
          $("#exampleInputtype1").val("");
          //联系地址
           $("#exampleInputaddress1").val("");
          //分期金额
          $("#month_money1").val("");
          //每月还款
          $("#stage_money1").val("");
          //薪资收入
          $("#salary_money1").val("");
          //公司地址
           $("#address1").val("");
          //公司类型
          $("#company_type1").val("");
          //拒贷日期
           $("#stages_or1").val("");
          //拒贷金额
           $("#stages_money1").val("");
          //长期欠款
           $("#long_owed1").val("");
          //是否逾期
          $("#arrears_or1").val("");
          //逾期天数
          $("#arrears_day1").val("");
          //其他补充信息
          $("#remarks1").val("");
           $("#tijiao1").attr("disabled","true");
       
     }
function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串 
    var idCard = url.slice(1);
    // alert(idCard);
    return idCard;
}

function modellige() {
    window.location.href = "model.html?" + GetRequest();
}

function edit() {
    window.location.href = "userlist_editfurtherinfo.html?" + GetRequest();
}

function report() {
    window.location.href = "report.html?" + GetRequest();
}

function show(id) {
    /*var idCard = GetRequest();
    var createTime = document.getElementById("createTime").innerHTML;*/
    //alert(createTime);
    $.ajax({
        type: "post",
        url: "http://localhost:9999/SelectByCreatetime",
        dataType: "jsonp",
        jsonp: "firm", //服务端用于接收callback调用的function名的参数 
        jsonpCallback: "success_jsonpCallback", //callback的function名称,服务端会把名称和data一起传递回来
        data: {
            /*"idCard": idCard,
            "createTime": createTime,*/
           "id":id,
        },
        success: function(data) {
        	
            $("#myModal_edit").modal("show");
            
            $("#exampleInputrepeatData").val(data.borrowDate);
            $("#exampleInputrepeathetong").val(data.borrowContractno);
            $("#exampleInputrepeatqixian").val(data.period);
            $("#exampleInputrepeatmoney").val(data.amount);
            $("#exampleInputTel").val(data.phone);
            $("#exampleInputrepeatpurpose").val(data.purpose);
            $("#exampleInputtype").val(data.borrowType);
            $("#exampleInputaddress").val(data.contactAddress);
            if(data.borrowStatus){
            	$("#sfzdk").val('是');
            }else{
            	$("#sfzdk").val('否');
            }
            if(data.contactless){
            	$("#sfsl").val('是');
            }else{
            	$("#sfsl").val('否');
            }
            if(data.instalmentAgain){
            	$("#sfyycfq").val('是');
            }else{
            	$("#sfyycfq").val('否');
            }
            
            $("#month_money").val(data.instalmentAmount);
            $("#stage_money").val(data.monthlyRepay);
            $("#salary_money").val(data.salary);
            $("#address").val(data.companyAddress);
            $("#company_type").val(data.companyType);
            if(data.primaryReject){
            	 $("#csjj").val('是');
            }else{
            	 $("#csjj").val('否');
            }
            if(data.chect){
           		$("#zp").val('是');
            }else{
           		$("#zp").val('否');
            }
            
            $("#stages_or").val(data.rejectTime);
            $("#stages_money").val(data.rejectAmount);
            if(data.extension){
            	$("#sfyq").val('是');
            }else{
            	$("#sfyq").val('否');
            }
            if(data.capitalDebt){
            	$("#yzdz").val('是');
            }else{
            	$("#yzdz").val('否');
            }
            
            $("#long_owed").val(data.longtermArrear);
            $("#arrears_or").val(data.overdue);
            if(data.overdue){
            	$("#contact_or").val('是');
            }else{
            	$("#contact_or").val('否');
            }
            
            $("#arrears_day").val(data.overdueDays);
            $("#remarks").val(data.otherInfos);
        }
    });

}


