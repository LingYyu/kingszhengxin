
$(function () {
	num();
   	
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
        		if (type == "change") {
        			user_data(num);
                	//history(num);
	           }else{
	           	//loan(num);
	           }
        }
    });
}



function num(){
	$.ajax({
		url: "http://localhost:9999/selectUserNum",
		dataType: "jsonp",
		jsonp:"callbackparam",
		jsonpCallback:"success_jsonpCallback",
		data: {
            
        },
		success: function(data) {
			$("#PageCount").val(data);
    		loadpage();
        },
        error: function(data) {
        	$("#PageCount").val(10);
    		loadpage();
        }
	});
}


