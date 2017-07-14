$(function () {
    init();
});
//做登录的session判断，没登录则跳转至登录页面
function init() {
	if(sessionStorage.getItem("wei")==null){
		$("#siginWei").modal("show");
		//window.location.href="singin.html";
		
	}
}
function toSigin(){
	window.location.href="singin.html";
}
