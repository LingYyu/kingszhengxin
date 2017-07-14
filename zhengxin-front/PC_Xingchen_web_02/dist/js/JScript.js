/* checkbox 全选 */
$(function () {
    $("#Checkbox_all").click(function () {
        $("input[name='checkbox_yuan']").prop("checked", $(this).prop("checked"));
    })
});
//左侧树形结构
$(function() {

        var defaultData = [
          {
            text: '征信源',
            state:{
             expanded:false
            },
            href: 'Credit.htm',
            tags: ['0'],
            icon:'glyphicon glyphicon-star',
            
          },
          {
            text: '商户',
            state:{
             expanded:false
            },
            href: 'merchant.htm',
            tags: ['0'],
            icon:'glyphicon glyphicon-credit-card',
           
          },
          {
            text: '系统管理',
             state:{
             expanded:true
            },
            href: '#parent3',
            tags: ['3'],
            icon:'glyphicon glyphicon-cog',
            nodes: [
              {
                text: '征信源管理',
                href: 'system_credit.htm',
                tags: ['0'],
              },
              {
                text: '商户管理',
                href: 'system_merchant.htm',
                tags: ['0'],
              },
              {
                text: '产品管理',
                href: 'system_productmanage.htm',
                tags: ['0']
              },
              {
                text: '调整记录',
                href: 'system_adjustment.htm',
                tags: ['0']
              }
            ]
          }
        ];
        $('#treeview1').treeview({
          data: defaultData,
          expandIcon:'glyphicon glyphicon-menu-down',
          collapseIcon:'glyphicon glyphicon-menu-up',
          color: "#fff",
          backColor: "#131b26",
          onhoverColor: "#428bca",
          showBorder: false,
          highlightSelected: true,
          enableLinks:true,
          selectedColor: "#fff",
          selectedBackColor: "#428bca",
        });

  		});

/* 时间日期 */
$(function () {
    $(".form_datetime").datetimepicker({ format: 'yyyy-mm',
        autoclose:true,
        language:  'zh-CN',
        startView:'3',
        minView:'3'
    });
});

//tab切换
$(function () {
    $('#myTabs a:first').tab('show'); //初始化显示哪个tab 
    $('#myTabs a').click(function (e) {
        e.preventDefault(); //阻止a链接的跳转行为 
        $(this).tab('show'); //显示当前选中的链接及关联的content 
    })
});

//credit页面
$(function () {
    $("#Checkbox_all_credit").click(function () {
        $("input[name='Checkbox_system_credit']").prop("checked", $(this).prop("checked"));
    })
});

//creditproduct
$(function () {
    $("#Checkbox_all_creditproduct").click(function () {
        $("input[name='checkbox_system_creditproduct']").prop("checked", $(this).prop("checked"));
    })
});

//merchant页面
$(function () {
    $("#Checkbox_all_merchant").click(function () {
        $("input[name='checkbox_system_merchant']").prop("checked", $(this).prop("checked"));
    })
});

//adjustmentcredit页面
$(function () {
    $("#Checkbox_all_adjustmentcredit").click(function () {
        $("input[name='checkbox_system_adjustmentcredit']").prop("checked", $(this).prop("checked"));
    })
});

//adjustmentmerchant页面
$(function () {
    $("#Checkbox_all_adjustmentmerchant").click(function () {
        $("input[name='checkbox_system_adjustmentmerchant']").prop("checked", $(this).prop("checked"));
    })
});
//状态管理
function stateManage(obj){
	var $this=$(obj);
	var $prev=$this.prev();
	var str=$this.text();
	if(str=="启用"){
		$this.text("停用");
		$this.css("color","#155faa");
		$prev.text("已开启/");
	}else{
		$this.text("启用");
		$this.css("color","red");
		$prev.text("已关闭/");
	}
}