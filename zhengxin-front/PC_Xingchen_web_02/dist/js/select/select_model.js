function clicka(obj){
	$(obj).addClass("a_bg");
	$moadl = $($(obj).attr("data-target"));
		$moadl.on("hide.bs.modal",function(e){//为modal添加隐藏后执行事件
				$(obj).removeClass("a_bg");
				//$(obj).addClass("btn-credit_bor");
		});
}


    
	function xueweichaxun(){
		var inputNum = $("#flat-checkbox-0").prop("checked")? 3 : 4;
		var proportion = Math.ceil(100/inputNum);
		var performance_xuewei = 0;
		var performance_xuewei = 0;
		if ($("#xuewei_select").val().length != 0 && $("#xuewei_select").val()!="请选择" && $("#xuewei_select").val()!="") {
			performance_xuewei += proportion;
			
		} 
		if($("#inschooltime").val().length!=0 && $("#inschooltime").val()!=""){
			performance_xuewei += proportion;
		}
		if($("#exampleInputxuewei").val().length!=0 && $("#exampleInputxuewei").val()!=""){
			performance_xuewei += proportion;
		}
		if($("#flat-checkbox-0").val==1 ||($("#exampleInputxuehao").val().length!=0 && $("#exampleInputxuehao").val()!="")){
			performance_xuewei += proportion;
		}
		$("#xueli").modal("hide");
		
		if(performance_xuewei >= 100){
			$("#performance_xueli").text("100%");
			$("#performance_xueli").removeClass("p1_no");
			$("#performance_xueli").addClass("p1");
		}else{
			$("#performance_xueli").text(performance_xuewei+"%");
			$("#performance_xueli").removeClass("p1_no");
			$("#performance_xueli").addClass("p1");
		}
	}
	




	function bankchaxun(){
		if ($("#examplebank").val().length != 0 && $("#examplebank").val()!="") {
			$("#bank").modal("hide");
			$("#performance_bank").text("100%");
			$("#performance_bank").removeClass("p1_no");
			$("#performance_bank").addClass("p1");
		} else{
			$("#bank").modal("hide");
			$("#performance_bank").text("0%");
			$("#performance_bank").removeClass("p1");
			$("#performance_bank").addClass("p1_no");
			
		}
	}
	





	function driver(){
		var performance_driver = 0;
		
		if ($("#examplecarnumber").val().length != 0 && $("#examplecarnumber").val()!="") {
			performance_driver +=50;
		}
		if ($("#examplevehicletype").val().length != 0 && $("#examplevehicletype").val()!="") {
			performance_driver +=50;
		}
		$("#drive").modal("hide");
		if(performance_driver == 0){
			$("#performance_drive").text("0%");
			$("#performance_drive").removeClass("p1");
			$("#performance_drive").addClass("p1_no");
		}else if(performance_driver == 50){
			$("#performance_drive").text("50%");
			$("#performance_drive").removeClass("p1");
			$("#performance_drive").addClass("p1_no");
		}else if(performance_driver == 100){
			$("#performance_drive").text("100%");
			$("#performance_drive").removeClass("p1_no");
			$("#performance_drive").addClass("p1");
		}
	}
	



	function violation(){
		var performance_violations = 0;
		if ($("#examplevcarnumber").val().length != 0 && $("#examplevcarnumber").val()!="") {
			performance_violations +=25;
		}
		if ($("#examplevvehicletype").val().length != 0 && $("#examplevvehicletype").val()!="") {
			performance_violations +=25;
		}
		if ($("#examplevin").val().length != 0 && $("#examplevin").val()!="") {
			performance_violations +=25;
		}
		if ($("#exampleengine").val().length != 0 && $("#exampleengine").val()!="") {
			performance_violations +=25;
		}
		$("#violation").modal("hide");
		if(performance_violations == 0){
			$("#performance_violation").text("0%");
			$("#performance_violation").removeClass("p1");
			$("#performance_violation").addClass("p1_no");
		}else if(performance_violations == 25){
			$("#performance_violation").text("25%");
			$("#performance_violation").removeClass("p1");
			$("#performance_violation").addClass("p1_no");
		}else if(performance_violations == 50){
			$("#performance_violation").text("50%");
			$("#performance_violation").removeClass("p1");
			$("#performance_violation").addClass("p1_no");
		}else if(performance_violations == 75){
			$("#performance_violation").text("75%");
			$("#performance_violation").removeClass("p1");
			$("#performance_violation").addClass("p1_no");
		}else if(performance_violations == 100){
			$("#performance_violation").text("100%");
			$("#performance_violation").removeClass("p1_no");
			$("#performance_violation").addClass("p1");
		}
	}
	




	function all_infor(){
		var performance_allinfor = 0;
		if ($("#exampleInputkahao").val().length != 0 && $("#exampleInputkahao").val()!="") {
			performance_allinfor+=50;
		}
		if ($("#exampleInputjiahao").val().length != 0 && $("#exampleInputjiahao").val()!="") {
			performance_allinfor+=50;
		}
		$("#all_infor").modal("hide");
		if(performance_allinfor == 0){
			$("#all_inforperformance").text("0%");
			$("#all_inforperformance").removeClass("p1");
			$("#all_inforperformance").addClass("p1_no");
		}else if(performance_allinfor == 50){
			$("#all_inforperformance").text("50%");
			$("#all_inforperformance").removeClass("p1");
			$("#all_inforperformance").addClass("p1_no");
		}else if(performance_allinfor == 100){
			$("#all_inforperformance").text("100%");
			$("#all_inforperformance").removeClass("p1_no");
			$("#all_inforperformance").addClass("p1");
		}
	}
	




	function formatBankNo (BankNo){
    if (BankNo.value == "") return;
    var account = new String (BankNo.value);
    account = account.substring(0,22); /*帐号的总数, 包括空格在内 */
    if (account.match (".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}") == null){
        /* 对照格式 */
        if (account.match (".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}|" + ".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}|" +
        ".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}|" + ".[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{7}") == null){
            var accountNumeric = accountChar = "", i;
            for (i=0;i<account.length;i++){
                accountChar = account.substr (i,1);
                if (!isNaN (accountChar) && (accountChar != " ")) accountNumeric = accountNumeric + accountChar;
            }
            account = "";
            for (i=0;i<accountNumeric.length;i++){    /* 可将以下空格改为-,效果也不错 */
                if (i == 4) account = account + " "; /* 帐号第四位数后加空格 */
                if (i == 8) account = account + " "; /* 帐号第八位数后加空格 */
                if (i == 12) account = account + " ";/* 帐号第十二位后数后加空格 */
                account = account + accountNumeric.substr (i,1)
            }
        }
    }
    else
    {
        account = " " + account.substring (1,5) + " " + account.substring (6,10) + " " + account.substring (14,18) + "-" + account.substring(18,25);
    }
    if (account != BankNo.value) BankNo.value = account;
    if (BankNo.value.length == 22) {
    	BankNo.style.borderColor = '#b2a8fd';
    }else{
    	BankNo.style.borderColor = 'red';
    }
}





function showAllModal(){
	if($("#showAllModal_div").hasClass("btn-credit_bor")) {
		$("#showAllModal_div").removeClass("btn-credit_bor");
		$("#showAllModal_div").addClass("btn-credit");
		$("#all_infor").modal('show');
		$("#all_infor").on("hide.bs.modal",function(e){//为modal添加隐藏后执行事件
				$("#showAllModal_div").removeClass("btn-credit");
				$("#showAllModal_div").addClass("btn-credit_bor");
		});
	}
}


$(function(){
	$(".modal-content").draggable({
		cursor: "move",
//		handle: '.modal-header'
	});
}); 

function clickb() {
    	if($("#showjpsd").prop("checked")){
    		$("#jpasd").attr("disabled",true);
    	}else{
    		$("#jpasd").attr("disabled",false);
    	}
    };
