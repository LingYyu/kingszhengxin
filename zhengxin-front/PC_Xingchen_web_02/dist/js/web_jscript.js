/*
 * 星辰征信前台公用JS文件
 * 2016/8/10
 * jingjing
 */
/* 生成报告图片动画 */
$(function() {
    var time = setTimeout(function() {
        $("#building").addClass("hidden");
        $("#builded").removeClass("hidden");
        $("#waiting").removeClass("waiting");
    }, 5000);
});
/* 上传文件 */
function getObjectURL(file) {
    var url = null;
    if (window.createObjectURL != undefined) { // basic
        url = window.createObjectURL(file);
    } else if (window.URL != undefined) { // mozilla(firefox)
        url = window.URL.createObjectURL(file);
    } else if (window.webkitURL != undefined) { // webkit or chrome
        url = window.webkitURL.createObjectURL(file);
    }
    return url;
}
$(function() {
    $("input[type='file']").on("change", function() {
        var objUrl = getObjectURL(this.files[0]); //获取图片的路径，该路径不是图片在本地的路径
        if (objUrl) {
            $(this).siblings("img").attr("src", objUrl); //将图片路径存入src中，显示出图片
        }
    });
    $(".mg-rounded-disc").on("click", function() {
        $(this).siblings("input[type='file']").click();
    });
});
/* 弹出对话框按注标题移动 */
$(function() {
    $(".modal").draggable({
        cursor: "move",
        // handle: '.modal-header'
    });
});
/* 时间日期 */
$(function() {
    $(".form_datetime").datetimepicker({
        format: 'yyyy-mm',
        autoclose: true,
        language: 'zh-CN',
        startView: '3',
        minView: '3',
    });
});
/* 时间日期 */
$(function() {
    $(".form_datetime1").datetimepicker({
        format: 'yyyy-mm-dd',
        autoclose: true,
        language: 'zh-CN',
        startView: '2',
        minView: '2'
    });
});
/* 复选框 */
$(document).ready(function() {
    $('input').iCheck({
        checkboxClass: 'icheckbox_flat-pink',
        radioClass: 'iradio_flat-pink'
    });
    $("#flat-checkbox-0").on('ifClicked', function() {
        if ($(this).prop('checked')) {
            $("#exampleInputxuehao").attr("disabled", false);
        } else {
            $("#exampleInputxuehao").attr("disabled", true);
        }
    });
    $("#showjpsd4").on('ifClicked', function() {
        if ($(this).prop('checked')) {
            $("#jpasd4").attr("disabled", false);
        } else {
            $("#jpasd4").attr("disabled", true);
        }
    });
    $("#showjingdong4").on('ifClicked', function() {
        if ($(this).prop('checked')) {
            $("#jingdong4").attr("disabled", false);
        } else {
            $("#jingdong4").attr("disabled", true);
        }
    });
    $("#showtaopasd4").on('ifClicked', function() {
        if ($(this).prop('checked')) {
            $("#taopasd4").attr("disabled", false);
        } else {
            $("#taopasd4").attr("disabled", true);
        }
    });
    $("#showtaobao4").on('ifClicked', function() {
        if ($(this).prop('checked')) {
            $("#taobao4").attr("disabled", false);
        } else {
            $("#taobao4").attr("disabled", true);
        }
    });

});
