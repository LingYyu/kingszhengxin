$(function () {
	var reportCode = GetRequest();
     $.ajax({
        type: "post",
        url: "http://localhost:9999/updateRopertAndCount",
        dataType: "jsonp",
        jsonp: "updateReport",
        jsonpCallback: "success_jsonpCallback",
        data: {
            "reportCode": reportCode,
        },
        success: function(data) {
        },
        error: function(data) {
            
        }
    });
});


// 打印
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
// 下载成pdf
// function downloadSG() {
//     html2canvas($('.table-responsive'), { // html2canvas 是将当前页面转换成图片；
//         // $('.table-responsive') 是要转换为图片的页面范围；
//         // height: 5000,// height:5000,这个高度要根据页面的大小灵活调整；
//         onrendered: function(canvas) {
//             var imgData = canvas.toDataURL('image/jpg');
//             var doc = new jsPDF('p', 'px', 'a3'); // p：横向，a3：纸张大小，默认是a4;
//             //第一列 左右边距  第二列上下边距  第三列是图片左右拉伸  第四列 图片上下拉伸
//             doc.addImage(imgData, 'JPG', 5, 10, 620, 1500);
//             // doc.addImage(imgData, 'PNG', -9, 0,650,1500);将转换后的图片放到pdf文档上，后面四个参数可根据实际效果灵活调整；
//             doc.addPage(); //一页pdf显示不完整的时候，新增一页；
//             doc.addImage(imgData, 'JPG', 5, -900, 620, 1505);
//             doc.save('report_details.pdf');
//         }
//     });
// }
function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串 
    var idCard = url.slice(1);
    return idCard;
}
function report_details() {
	var reportCode=GetRequest();
    $.ajax({
        type: "post",
        url: "http://localhost:9999/getTUserModel",
        dataType: "jsonp",
        jsonp: "report_details",
        jsonpCallback: "success_jsonpCallback",
        data: {
			"code":reportCode,
        },
        success: function(data) {

            /*for (i in data) {*/
                $("#user_username").text(data.tuser.name);
                $("#user_idcard").text(data.tuser.idCard);

                $("#reportcode").text(data.tuser.reportCode);
                $("#publish_time").text(data.tuser.publishTime);
                $("#name").text(data.tuser.name);
                $("#mark").text(data.tuser.mark);
                $("#age").text(data.tuser.age);
                $("#sex").text(data.tuser.sex);
                $("#id_card").text(data.tuser.idCard);
                $("#mobile").text(data.tuser.mobile);
                $("#suggest").text(data.tuser.suggestion);
                $("#education").text(data.edu.collegeLevel);
                $("#borrow_type").text(data.tuser.borrowType);
				$("#idImg").attr("src", "../dist/images/uploadimages/"+data.tUserBaseinfo.cardPicUrl1);


                $("#college").text(data.edu.college);
                $("#college_level").text(data.edu.collegeLevel);
                $("#start_time").text(data.edu.startTime);
                $("#major").text(data.edu.major);
                
                if(data.edu.collegeLevel=="本科"){
                	 //alert(data.edu.startTime);
                	 var graduationTime=(parseInt(data.edu.startTime.substr(0,4))+4)+"-"+"07";
                	// alert(graduationTime);
                }else if(data.edu.collegeLevel=="硕士"){
                	var graduationTime=(parseInt(data.edu.startTime.substr(0,4))+6)+"-"+"07";
                }else{
                	var graduationTime=(parseInt(data.edu.startTime.substr(0,4))+8)+"-"+"07";
                }
                $("#graduation_time").text(graduationTime);
                $("#graduation_con").text(data.edu.graduationCon);
                $("#degree_category").text(data.edu.degreeCategory);
                $("#status").text(data.edu.status);
                $("#description").text(data.edu.description);
                $("#graduationTime").text(graduationTime);

                if (!data.tUserModule.businessChoose) {
                	$("#href5").css("display", "none");
                    $("#legal_person_check").css("display", "none");

                } else {
                    $("#legal_person_check").css("display", "");
                    $("#enterprise_name").text(data.legal.enterpriseName);
                    $("#legal_person").text(data.legal.legalPerson);
                    $("#registered_capital").text(data.legal.registeredCapital);
                    $("#opening_date").text(data.legal.openingDate);
                    $("#operating_period").text(data.legal.operatingPeriod);
                    $("#regist_authority").text(data.legal.registAuthority);
                    $("#shareholders_info").text(data.legal.shareholdersInfo);
                    $("#enterprise_position").text(data.legal.enterprisePosition);
                    $("#enterprise_dishonesty").text(data.legal.enterpriseDishonesty);
                    $("#executed_name").text(data.legal.executedName);
                    $("#dishonesty_type").text(data.legal.dishonestyType);
                    $("#gender").text(data.legal.gender);
                    $("#dishonesty_age").text(data.legal.dishonestyAge);
                    $("#id_card3").text(data.legal.idCard);
                    $("#idcard_address").text(data.legal.idcardAddress);
                    $("#filing_time").text(data.legal.filingTime);
                    $("#case_status").text(data.legal.caseStatus);
                    $("#court_execution").text(data.legal.courtExecution);
                    $("#executive_subject").text(data.legal.executiveSubject);

                }
                if (!data.tUserModule.loanChoose) {
                	$("#href6").css("display", "none");
                    $("#loan_info_check").css("display", "none");

                } else {
                    $("#loan_info_check").css("display", "");
                    $("#other_loans").text(data.otherLoans);
                    $("#loan_type").text(data.loanType);
                    $("#loan_date").text(data.loanDate);
                    $("#loan_amount").text(data.loanAmount);
                    $("#using_loan").text(data.usingLoan);
                    $("#loan_deadline").text(data.loanDeadline);
                    $("#mobile2").text(data.tUserBaseinfo.telephone);
                    $("#address2").text(data.loan.address);
                    $("#loan_blacklist").text(data.loan.loanBlacklist);
                }
                if (!data.tUserModule.drivingChoose) {
                	$("#href7").css("display", "none");
                    $("#driving_license_check").css("display", "none");
                } else {
                    $("#driving_license_check").css("display", "");
                    $("#driving_car_no").text(data.drivinglicense.drivingCarNo);
                    $("#driving_car_type").text(data.drivinglicense.drivingCarType);
                    $("#driving_car_name").text(data.drivinglicense.drivingCarName);
                    $("#id_card1").text(data.drivinglicense.idCard);
                    $("#driving_car_status").text(data.drivinglicense.drivingCarStatus);
                    $("#use_property").text(data.drivinglicense.useProperty);
                    $("#driving_car_color").text(data.drivinglicense.drivingCarColor);
                    $("#maturity_date").text(data.drivinglicense.maturityDate);
                    $("#dengine_no").text(data.drivinglicense.dengineNo);
                    $("#address1").text(data.drivinglicense.address);
                    $("#issue_date").text(data.drivinglicense.issueDate);
                    $("#initial_regist_date").text(data.drivinglicense.initialRegistDate);
                    $("#dcar_frame_no").text(data.drivinglicense.dcarFrameNo);

                }
                if (!data.tUserModule.illegalChoose) {
                	$("#href8").css("display", "none");
                    $("#illegal_info_check").css("display", "none");
                } else {
                    $("#illegal_info_check").css("display", "");
                    $("#violation_time").text(data.illegal.violationTime);
                    $("#violation_place").text(data.illegal.violationPlace);
                    $("#violation_reason").text(data.illegal.violationReason);
                    $("#illegal_deduction").text(data.illegal.illegalDeduction);
                    $("#violation_bills").text(data.illegal.violationBills);
                    $("#mobile5").text(data.tUserBaseinfo.telephone);
                    $("#violation_address").text(data.illegal.violationAddress);
                    $("#executive_branch").text(data.illegal.executiveBranch);
                }
                if (!data.tUserModule.flyChoose) {
                	$("#href9").css("display", "none");
                    $("#flight_info_check").css("display", "none");
                } else {
                    $("#flight_info_check").css("display", "");
                    $("#first_class").text(data.firstClass);
                    $("#economy_class").text(data.economyClass);
                    $("#flight_times").text(data.flightTimes);
                    $("#frequent_reach_city").text(data.frequentReachCity);
                    $("#finally_arrived").text(data.finallyArrived);
                    $("#average_fare").text(data.averageFare);
                    $("#year_fight_times").text(data.yearFightTimes);
                    $("#total_flight").text(data.totalFlight);
                }
                if (!data.tUserModule.internetChoose) {
                	$("#href10").css("display", "none");
                    $("#internetmessage").css("display", "none");
                } else {
                    $("#internetmessage").css("display", "");
                    $("#shouhuoren1").text(data.tUserBaseinfo.userName);
                    $("#shouhuoren").text(data.tUserBaseinfo.userName);
                    $("#zhenshiname").text(data.tUserBaseinfo.userName);
                    $("#zhanghunicheng").text(data.tUserBaseinfo.userName);
                    $("#phoneNumber").text(data.tuser.mobile);
                    
                }
           // }

        },
        error: function(data) {
            // window.location.href = "report_details.html";

        }
    });
}

function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串 
    var idCard = url.slice(1);
    // alert(idCard);
    return idCard;
}

function report() {
    window.location.href = "report.html?" + GetRequest().substr(0,18);
}

function download() {
    var reportCode = document.getElementById("reportcode").innerHTML;
    $.ajax({
        type: "post",
        url: "http://localhost:9999/uploadReportPDF",
        dataType: "jsonp",
        jsonp: "download",
        jsonpCallback: "success_jsonpCallback",
        data: {
            "reportCode": reportCode,
        },
        success: function(data) {
            $("#signin").modal("show");
        },
        error: function(data) {
            showModal("下载失败,请重试！");
        }
    });
}
/*修改弹出层内容*/
function showModal(content) {
    $("#myModalContent").html(content);
    $("#signin").modal("show");
}
