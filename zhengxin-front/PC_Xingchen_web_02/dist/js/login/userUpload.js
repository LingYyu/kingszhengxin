
 // 提交之后跳转至编辑页面
 function reset() {
     // loaduser();
     $.ajaxFileUpload({
         type: "post",
         url: "http://localhost:9999/editAdditionalInformation",
         dataType: "jsonp",
         secureuri: false,
		 fileElementId: ['P1','P2','P3'],
         jsonp: "checkAll",
         jsonpCallback: "success_jsonpCallback",
         data: {
             "inputaddress": $("#inputaddress").val(),
             "inputposition": $("#inputposition").val(),
             "inputemail": $("#inputemail").val(),
         },
         success: function(data) {
            window.location.href = "userlist_editfurtherinfo.html";
         },
         error: function(data) {
             window.location.href = "userlist_editloaninfo.html";
         }
     });
 }

function showuser() {
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
            /*$("#companyAddress").text(data.companyAddress);
            $("#position").text(data.position);
            $("#email").text(data.userEmail);
            $("#img1").attr("src", "data.addressInfoUrl");
            $("#img2").attr("src", "data.jobInfoUrl");
            $("#img3").attr("src", "data.financeInfoUrl");*/
        },
        error: function(data) {

        }
    });
}
function back(){
    window.location.href="userlist_editfurtherinfo.html";
}

 // 上传图片
 var isIE = /msie/i.test(navigator.userAgent) && !window.opera;

 function fileChange(target, id) {
     var fileSize = 0;
     var filetypes = [".jpg", ".png", "PNG", ".JPG"];
     var filepath = target.value;
     var filemaxsize = 1024 * 10; //10M
     if (filepath) {
         var isnext = false;
         var fileend = filepath.substring(filepath.indexOf("."));
         if (filetypes && filetypes.length > 0) {
             for (var i = 0; i < filetypes.length; i++) {
                 if (filetypes[i] == fileend) {
                     isnext = true;
                     break;
                 }
             }
         }
         if (!isnext) {
             showModal("不接受此文件类型！", target.id);
             //						alert("不接受此文件类型！");
             target.value = "";
             return false;
         }
     } else {
         return false;
     }
     if (isIE && !target.files) {
         var filePath = target.value;
         var fileSystem = new ActiveXObject("Scripting.FileSystemObject");
         if (!fileSystem.FileExists(filePath)) {
             showModal("附件不存在，请重新输入！", target.id);
             return false;
         }
         var file = fileSystem.GetFile(filePath);
         fileSize = file.Size;
     } else {
         fileSize = target.files[0].size;
     }

     var size = fileSize / 1024;
     if (size > filemaxsize) {
         showModal("附件大小不能大于" + filemaxsize / 1024 + "M！", target.id);
         //					alert("附件大小不能大于" + filemaxsize / 1024 + "M！");
         target.value = "";
         return false;
     }
     if (size <= 0) {
         showModal("附件大小不能为0M！", target.id);
         //					alert("附件大小不能为0M！");
         target.value = "";
         return false;
     }
 }
 /*修改弹出层内容*/
 function showModal(content, id) {
     $("#myModalContent").html(content);
     $("#modal_btn").attr("onClick", "showerror('" + id + "')");
     $("#checkimg").modal("show");
 }
 /*格式错误再次弹出上传文件窗口*/
 function showerror(id) {
     $("#" + id).click();
 }
 /* 创建用户页面弹出对话框移动 */
 $(function() {
     $(".modal-content").draggable({
         cursor: "move",
         //		handle: '.modal-header'
     });
 });
