   /**
    * 验证码
    */
   var code;

   function createCode() {
       code = "";
       var codeLength = 4; //验证码的长度
       var checkCode = document.getElementById("checkCode");
       var codeChars = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
           'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
           'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'); //所有候选组成验证码的字符，当然也可以用中文的
       for (var i = 0; i < codeLength; i++) {
           var charNum = Math.floor(Math.random() * 52);
           code += codeChars[charNum];
       }
       if (checkCode) {
           checkCode.className = "code";
           checkCode.innerHTML = code;
       }
   }
   /*验证码验证*/
   // $(function() {
   //     $("#inputCode").keyup(function() {
   //         var inputCode = $("#inputCode").val();
   //         if (inputCode.length == 0 || (inputCode.toUpperCase() != code.toUpperCase())) {
   //             $("#check-msg").text("验证码不正确");
   //             $("#inputCode").css("border-color", "red");
   //             $("#login").css("pointer-events", "none");
   //             $("#login").css("opacity", "0.5");
   //             flag = 0;
   //         } else {
   //             $("#check-msg").text("");
   //             $("#inputCode").removeClass("login_control");
   //             $("#inputCode").css("border-color", "#b2a8fd");
   //             $("#login").css("pointer-events", "all");
   //             $("#login").css("opacity", "1");
   //             flag = 1;
   //         }
   //     });
   // });

   /*验证全部为空，按钮不可点*/
   var flag = [0, 0, 0] /*代表表单的三个输入框，为1可用*/
   $(function() {
       $("#inputEmail").keyup(function() {
           var inputEmail = $("#inputEmail").val();
           var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
           if (inputEmail.length == 0 || (!reg.test(inputEmail))) {
               $("#username-msg").text("邮箱格式不正确,请重新填写!");
               $("#inputEmail").css("border-color", "red");
               flag[0] = 0;
           } else {
               $("#username-msg").text("");
               $("#inputEmail").css("border-color", "#b2a8fd");
               flag[0] = 1;
           }
       });
   });
   $(function() {
       $("#inputPassword").keyup(function() {
           var inputPassword = $("#inputPassword").val();
           if (inputPassword.length == 0) {
               // $("#passwd-msg").text("密码必须为6-16位");
               $("#inputPassword").css("border-color", "red");
               flag[1] = 0;
           } else if (inputPassword.length >= 6 && inputPassword.length <= 16) {
               $("#inputPassword").css("border-color", "#b2a8fd");
               $("#passwd-msg").text("");
               flag[1] = 1;
           } else {
               // $("#passwd-msg").text("密码必须为6-16位");
               $(".login_control").css("border-color", "red");
               flag[1] = 0;

           }
       });
   });
   /* 验证码验证*/
   $(function() {
       $("#inputCode").keyup(function() {
           var inputCode = $("#inputCode").val();
           if (inputCode.length == 0 || (inputCode.toUpperCase() != code.toUpperCase())) {
               $("#check-msg").text("验证码不正确");
               $("#login").css("opacity", "0.5");
               $("#login").css("pointer-events", "none");
               $("#inputCode").css("border-color", "red");
               flag[2] = 0;
           } else if (flag[0] == 1 && flag[1] == 1) {
               $("#check-msg").text("");
               $("#login").css("pointer-events", "all");
               $("#inputCode").css("border-color", "#b2a8fd");
               $("#login").css("opacity", "1");
               flag[2] = 1;
           }

       });
   });
   /**
    * 判断当前对象是否为空
    * @method isEmpty
    * @param {Object} obj
    * @return {Boolean} empty 当为 null,undefined,"" 将返回true
    */
   function isEmpty(obj) {
       return (obj == null || typeof obj == "undefined" || obj.length == 0)
   }
   /**
    * 邮箱格式验证
    * @param {String} str
    */
   function IsEmail(str) {
       var myReg = /^([-_A-Za-z0-9\.]+)@([_A-Za-z0-9]+\.)+[A-Za-z0-9]{2,3}$/;
       if (myReg.test(str)) {
           return true;
       } else {
           return false;
       }
   }
   /**
    * 判断当前对象是否非空
    * @method isNotEmpty
    * @param {Object} obj
    * @return {Boolean}
    */
   function isNotEmpty(obj) {
       return !isEmpty(obj);
   }

   function noEmpty(event) {
       if (isNotEmpty($(event).val())) {
           $(event).removeClass('login_control');

       } else {
           $(event).addClass('login_control');
       }
   }
   /*邮箱验证*/
   function checkEmail(event) {
       if (IsEmail($(event).val())) {
           $(event).removeClass('login_control');
       } else {
           $(event).addClass('login_control');
       }
   }
   /*确认按钮*/
   function checkbutton() {
       var inputEmail = $("#inputEmail").val();
       var inputPassword = $("#inputPassword").val();
       $.ajax({
           type: "post",
           //                  url:"",
           url: "http://localhost:9999/login",
           async: true,
           dataType: "jsonp",
           jsonp: "checkbutton",
           jsonpCallback: "success_jsonpCallback",
           data: {
               "inputEmail": inputEmail,
               "inputPassword": inputPassword,
           },
           success: function(data) {
               if (data == "登陆成功") {
                   sessionStorage.setItem("wei", inputEmail);
                   window.location.href = "creatUser.html";
               } else if (data == "用户不存在") {
                   createCode();
                   $("#username-msg").text("用户不存在！");
                   $("#inputEmail").val("");
                   $('#inputPassword').val("");
                   $("#inputCode").val("");
                   $("#login").css("pointer-events", "none");
                   $("#login").css("opacity", "0.5");
                   // showModal("登录失败", "用户不存在！");
               } else if (data == "密码错误") {
                   createCode();
                   $("#passwd-msg").text("密码错误");
                   $("#inputEmail").val("");
                   $('#inputPassword').val("");
                   $("#inputCode").val("");
                   $("#login").css("pointer-events", "none");
                   $("#login").css("opacity", "0.5");
                   // showModal("登录失败", "密码错误");
               }
           },
           error: function(data) {
               // window.location.href = "singin.html";
           }
       });
   }
   /*修改弹出层内容*/
   function showModal(title, content) {
       $("#myModalLabel").html(title);
       $("#myModalContent").html(content);
       $("#signin").modal("show");
   }
   /* 弹出对话框按注标题移动 */
   $(function() {
       $(".modal").draggable({
           cursor: "move",
           //   handle: '.modal-header'
       });
   });
   /* 创建用户页面弹出对话框移动 */
   $(function() {
       $(".modal-content").draggable({
           cursor: "move",
           //   handle: '.modal-header'
       });
   });
