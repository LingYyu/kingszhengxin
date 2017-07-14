var isIE = /msie/i.test(navigator.userAgent) && !window.opera;



function fileChange(target, id) {
	var fileSize = 0;
	var filetypes = [".jpg", ".png", "PNG", ".JPG"];
	var filepath = target.value;
	var filemaxsize = 1024 * 10; //10M   
	if(filepath) {
		var isnext = false;
		var fileend = filepath.substring(filepath.indexOf("."));
		if(filetypes && filetypes.length > 0) {
			for(var i = 0; i < filetypes.length; i++) {
				if(filetypes[i] == fileend) {
					isnext = true;
					break;
				}
			}
		}
		if(!isnext) {
			showModal("不接受此文件类型！", target.id);
			//						alert("不接受此文件类型！");
			target.value = "";
			return false;
		}
	} else {
		return false;
	}
	if(isIE && !target.files) {
		var filePath = target.value;
		var fileSystem = new ActiveXObject("Scripting.FileSystemObject");
		if(!fileSystem.FileExists(filePath)) {
			showModal("附件不存在，请重新输入！", target.id);
			return false;
		}
		var file = fileSystem.GetFile(filePath);
		fileSize = file.Size;
	} else {
		fileSize = target.files[0].size;
	}

	var size = fileSize / 1024;
	if(size > filemaxsize) {
		showModal("附件大小不能大于" + filemaxsize / 1024 + "M！", target.id);
		//					alert("附件大小不能大于" + filemaxsize / 1024 + "M！");
		target.value = "";
		return false;
	}
	if(size <= 0) {
		showModal("附件大小不能为0M！", target.id);
		//					alert("附件大小不能为0M！");
		target.value = "";
		return false;
	}
	
	
	
	if(isNotEmpty($("#companyAddress").val()) && isPhone($("#companyTel").val()) && IsEmail($("#email").val()) && $("#P1").val().length != 0 && $("#P2").val().length != 0 && $("#P3").val().length != 0) {
		$("#next").css("pointer-events", "all");
		$("#next").css("background-color", "#2d6a82");
		$("#next").css("opacity", "1");
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