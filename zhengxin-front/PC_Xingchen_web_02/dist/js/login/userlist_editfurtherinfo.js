function showdata() {
    $.ajax({
        type: "post",
        dataType: "jsonp",
        jsonp: "checkAll",
        jsonpCallback: "success_jsonpCallback",
        url: "http://localhost:9999/showAdditionalInformation",
        data: {

        },
        success: function(data) {

            $("#user_username").text(data.userName);
            $("#user_idcard").text(data.idCard);
            // console.log(data);
            $("#address").text(data.companyAddress);
            $("#position").text(data.position);
            $("#email").text(data.userEmail);
            if(data.addressInfoUrl!=""){
		        $("#img1").attr("src", "../dist/images/uploadimages/"+data.addressInfoUrl);
		    }
		    if(data.jobInfoUrl!=""){
			    $("#img2").attr("src", "../dist/images/uploadimages/"+data.jobInfoUrl);
		    }
		    if(data.financeInfoUrl!=""){
			    $("#img3").attr("src", "../dist/images/uploadimages/"+data.financeInfoUrl);
		    }
           /* $("#img1").attr("src", "../dist/images/uploadimages/"+data.addressInfoUrl);
            $("#img2").attr("src", "../dist/images/uploadimages/"+data.jobInfoUrl);
            $("#img3").attr("src", "../dist/images/uploadimages/"+data.financeInfoUrl);*/
        },
        error: function(data) {

        }
    });
}
