var wei=0;
$(function () {
	num();
   	//loadData();
   	
});


function loadpage() {
    var myPageCount = parseInt($("#PageCount").val());
    var myPageSize = parseInt($("#PageSize").val());
    var countindex = myPageCount % myPageSize > 0 ? (myPageCount / myPageSize) + 1 : (myPageCount / myPageSize);
	 
    $("#countindex").val(countindex);

    $.jqPaginator('#pagination', {
        totalPages: parseInt($("#countindex").val()),
        visiblePages: parseInt($("#visiblePages").val()),
        currentPage: 1,
        first: '<li class="first"><a href="javascript:;">首页</a></li>',
        prev: '<li class="prev"><a href="javascript:;"><i class="arrow arrow2"></i>上一页</a></li>',
        next: '<li class="next"><a href="javascript:;">下一页<i class="arrow arrow3"></i></a></li>',
        last: '<li class="last"><a href="javascript:;">末页</a></li>',
        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
        onPageChange: function (num, type) {
        	if(wei==0){
        		if (type == "change") {
        			
                	history(num);
	            }else{
	                history(num);
	            }
        	}else{
        		if (type == "change") {
                	check(num);
	            }else{
	                //check(num);
	            }
        	}
            
        }
    });
}

function num(){
	$.ajax({
		url: "http://localhost:9999/CheckHistoryAlllistNum",
		dataType: "jsonp",
		jsonp:"callback",
		jsonpCallback:"success_jsonpCallback",
		async:false,
		success: function(data) {
			if(data==0){
         		$("#historypage").css("display","none");
         		$("#messagewei").css("display","block");
         	}else{
         		$("#historypage").css("display","block");
         		$("#messagewei").css("display","none");
         		$("#PageCount").val(data);
    			loadpage();
         	}   
        },
        error: function(data) {
        }
	});
}

function num1(loanPhase,productName){
	$.ajax({
		url: "http://localhost:9999/CheckHistoryAlllistNum1",
		dataType: "jsonp",
		jsonp:"callback",
		jsonpCallback:"success_jsonpCallback",
		data: {
             "loanPhase": loanPhase,
             "productName": productName
        },
		success: function(data) {
			$("#PageCount").val(data);
    		loadpage();
        },
        error: function(data) {
        }
	});
}


function check(currentPage) {
	 wei=1;
     var loan_phase = $('#loan_phase').val();
     var product_name = $('#product_name').val();
     
     $.ajax({
         type: "POST",
         url: "http://localhost:9999/CheckHistorylist",
         dataType: "jsonp",
         jsonp: "callback", //服务端用于接收callback调用的function名的参数 
         jsonpCallback: "success_jsonpCallback", //callback的function名称,服务端会把名称和data一起传递回来
         data: {
         	"currentPage":currentPage,
             "loanPhase": loan_phase,
             "productName": product_name
         },
         success: function(data) {
         	if(currentPage==1){
         		num1(loan_phase,product_name);
         	}
         	if(data.length==0){
         		$("#historypage").css("display","none");
         		$("#messagewei").css("display","block");
         	}else{
         		$("#historypage").css("display","block");
         		$("#messagewei").css("display","none");
         	}
             $("#historybody").empty();
             for (var i = 0; i < data.length; i++) {
                 var innerHtml =
                     "<tr>" +
                     "<td>" + data[i].name + "</td>" +
                     "<td>" + data[i].idCard + "</td>" +
                     "<td>" + data[i].loanPhase + "</td>" +
                     "<td>" + data[i].productName + "</td>" +
                     "<td><a href='#'><div onclick='update(\""+data[i].reportCode+"\")'>" +
                     data[i].reportCode + "</a></td>" +
                     "<td>" + data[i].updateTime + "</td>" +
                     "</tr>";
                 $("#historybody").append(innerHtml);
             }

         },
         error: function(data) {
         }
     });
 }