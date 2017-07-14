package com.newtouch.fbf.service.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import org.springframework.stereotype.Service;

import com.newtouch.fbf.entity.TUserBillingInformation;
import com.newtouch.fbf.service.ExcelService;
import com.newtouch.fbf.service.ITUserBillingInformation;

import jxl.Workbook;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/** * @author  wei * @date 创建时间：2016年11月5日 上午10:09:10 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class ExcelServiceImpl implements ExcelService {
	

	@Override
	public void Excel(String id) {
		try {
			ITUserBillingInformation information=new TUserBillingInformationImpl();
			TUserBillingInformation us = information.getTUserBillingInformation(id);
		    double a1=us.getCarTimes()*us.getCarPrice();
		    String b1=Double.toString(a1);
			double a2=us.getDrivingTimes()*us.getDrivingPrice();
			String b2=Double.toString(a2);
			double a3=us.getEduTimes()*us.getEduPrice();
			String b3=Double.toString(a3);
			double a4=us.getFlyTimes()*us.getFlyPrice();
			String b4=Double.toString(a4);
			double count=a1+a2+a3+a4+15*79;
			String c=Double.toString(count);
			String df=new SimpleDateFormat("yyyy/MM/dd").format(us.getBillingStardate());
			String dd=new SimpleDateFormat("yyyy/MM/dd").format(us.getBillingEnddate());
			
	        //打开文件  
	        WritableWorkbook book= Workbook.createWorkbook(new File("E://账单详情-"+us.getId()+".xls"));   
	        //生成名为“第一页”的工作表，参数0表示这是第一页   
	        WritableSheet sheetOne=book.createSheet("第一页",0);   
	          
	        /** 
	         * 定义单元格样式 
	         */  
	        WritableFont wf_title = new WritableFont(WritableFont.ARIAL, 11,  
	                WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE,  
	                jxl.format.Colour.BLACK); // 定义格式 字体 下划线 斜体 粗体 颜色  
	        WritableFont wf_head = new WritableFont(WritableFont.ARIAL, 11,  
	                WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE,  
	                jxl.format.Colour.BLACK); // 定义格式 字体 下划线 斜体 粗体 颜色  
	        WritableFont wf_table = new WritableFont(WritableFont.ARIAL, 11,  
	                WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE,  
	                jxl.format.Colour.BLACK); // 定义格式 字体 下划线 斜体 粗体 颜色  

	        WritableCellFormat wcf_title = new WritableCellFormat(wf_title); // 单元格定义  
	        wcf_title.setBackground(jxl.format.Colour.WHITE); // 设置单元格的背景颜色  
	        wcf_title.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式  
	        wcf_title.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN,jxl.format.Colour.BLACK); //设置边框  
	          
	        WritableCellFormat wcf_title1 = new WritableCellFormat(wf_title); // 单元格定义  
	        wcf_title1.setBackground(jxl.format.Colour.WHITE); // 设置单元格的背景颜色  
	        wcf_title1.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式  
	        wcf_title1.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN,jxl.format.Colour.BLACK); //设置边框  
	          
	        WritableCellFormat wcf_title2 = new WritableCellFormat(wf_title); // 单元格定义  
	        wcf_title2.setBackground(jxl.format.Colour.WHITE); // 设置单元格的背景颜色  
	        wcf_title2.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式  
	        wcf_title2.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN,jxl.format.Colour.BLACK); //设置边框  

	        WritableCellFormat wcf_head1 = new WritableCellFormat(wf_head);   
	        wcf_head1.setBackground(jxl.format.Colour.WHITE);  
	        wcf_head1.setAlignment(jxl.format.Alignment.CENTRE);   
	        wcf_head1.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN,jxl.format.Colour.BLACK);   
	          
	        WritableCellFormat wcf_head2 = new WritableCellFormat(wf_head);   
	        wcf_head2.setBackground(jxl.format.Colour.YELLOW2);  
	        wcf_head2.setAlignment(jxl.format.Alignment.CENTRE);   
	        wcf_head2.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN,jxl.format.Colour.BLACK);   


	        WritableCellFormat wcf_table1 = new WritableCellFormat(wf_table);   
	        wcf_table1.setBackground(jxl.format.Colour.LIGHT_GREEN);   
	        wcf_table1.setAlignment(jxl.format.Alignment.CENTRE);   
	        wcf_table1.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN,jxl.format.Colour.BLACK);   
	          
	        WritableCellFormat wcf_table2 = new WritableCellFormat(wf_table);   
	        wcf_table2.setBackground(jxl.format.Colour.YELLOW2);   
	        wcf_table2.setAlignment(jxl.format.Alignment.CENTRE);   
	        wcf_table2.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN,jxl.format.Colour.BLACK);   
	          
	        sheetOne.setColumnView(0, 15); // 设置列的宽度  
	        sheetOne.setColumnView(1, 15); // 设置列的宽度  
	        sheetOne.setColumnView(2, 15); // 设置列的宽度  
	        sheetOne.setColumnView(3, 15); // 设置列的宽度  
	        sheetOne.setColumnView(4, 15); // 设置列的宽度  
	        sheetOne.setColumnView(5, 15); // 设置列的宽度  
	        sheetOne.setColumnView(6, 15); // 设置列的宽度  
	        sheetOne.setColumnView(7, 15); // 设置列的宽度  
	        sheetOne.setColumnView(8, 15); // 设置列的宽度  
	        sheetOne.setColumnView(9, 15); // 设置列的宽度  
	        sheetOne.setColumnView(10, 15); // 设置列的宽度  
	        sheetOne.setColumnView(11, 15); // 设置列的宽度  
	        sheetOne.setColumnView(12, 15); // 设置列的宽度  
	        sheetOne.setColumnView(13, 15); // 设置列的宽度  
	        

	        //在Label对象的构造子中指名单元格位置是第一列第一行(0,0)   
	        //以及单元格内容为test   
	        Label title=new Label(0,0,"账单详情-"+us.getId(),wcf_title);  
	        Label titleOne=new Label(0,1,"商户名称",wcf_title1);  
	        Label titleTwo=new Label(1,1,us.getBusinessInformation(),wcf_title1);  
	        Label titleThree=new Label(3,1,"客户类型",wcf_title1);
	        Label titleFour=new Label(4,1,us.getBusinessType(),wcf_title1);
	        Label titleFive=new Label(0,2,"账单周期",wcf_title1);
	        Label titleSix=new Label(1,2,df+"至"+dd,wcf_title1);
	        
	        Label column1=new Label(0,3,"充值情况",wcf_head1);  
	        Label column2=new Label(1,3,"上月剩余金额",wcf_head1);  
	          
	        Label column3=new Label(2,3,us.getBalance().toString(),wcf_head1);  
	        Label column4=new Label(3,3,"本月充值金额",wcf_head1);
	        Label column5=new Label(4,3,us.getRecharge().toString(),wcf_head1);
	        Label column6=new Label(5,3,"本月金额",wcf_head1);
	        Label column7=new Label(6,3,us.getMoney().toString(),wcf_head1);

	        //或者WritableCell cell =  new jxl.write.Number(column, row, value, wcf)  
	        //将定义好的单元格添加到工作表中   
	        sheetOne.addCell(title);   
	        sheetOne.addCell(titleOne);   
	        sheetOne.addCell(titleTwo);   
	        sheetOne.addCell(titleThree);
	        sheetOne.addCell(titleFour);
	        sheetOne.addCell(titleFive);
	        sheetOne.addCell(titleSix);
	        
	        
	        sheetOne.addCell(column1);   
	        sheetOne.addCell(column2);   
	        sheetOne.addCell(column3);   
	        sheetOne.addCell(column4);   
	        sheetOne.addCell(column5);
	        sheetOne.addCell(column6);
	        sheetOne.addCell(column7);
	        
	        
	        //合： 第1列第1行  到 第13列第1行  
	        sheetOne.mergeCells(0, 0, 6, 0);   
	        sheetOne.mergeCells(1, 1, 2, 1);   
	        sheetOne.mergeCells(4, 1, 6, 1);   
	        sheetOne.mergeCells(1, 2, 6, 2);
	          
	          
	          
	        /*动态数据   */  
	        
	        Label content1=new Label(0,4,"对账汇总信息",wcf_title);  
	        Label content2=new Label(0,5,"对账汇总信息",wcf_title);
	        Label content3=new Label(0,6,"对账汇总信息",wcf_title);  
	        Label content4=new Label(0,7,"对账汇总信息",wcf_title);  
	        Label content5=new Label(0,8,"对账汇总信息",wcf_title);  
	        Label content6=new Label(0,9,"对账汇总信息",wcf_title);
	        Label content7=new Label(0,10,"对账汇总信息",wcf_title);
	        
	        sheetOne.addCell(content1);  
	        sheetOne.addCell(content2);  
	        sheetOne.addCell(content3);
	        sheetOne.addCell(content4);
	        sheetOne.addCell(content5);
	        sheetOne.addCell(content6);
	        sheetOne.addCell(content7);
	        
	        sheetOne.mergeCells(0, 4, 0,10);
	        
	        Label content11=new Label(1,4,"产品类型",wcf_title);  
	        Label content21=new Label(1,5,"征信产品",wcf_title);
	        Label content31=new Label(1,6,"征信产品",wcf_title);  
	        Label content41=new Label(1,7,"征信产品",wcf_title);  
	        Label content51=new Label(1,8,"征信产品",wcf_title);
	        Label content61=new Label(1,9,"征信产品",wcf_title);
	        Label content71=new Label(1,10,"总计",wcf_title);
	        
	        sheetOne.addCell(content11);  
	        sheetOne.addCell(content21);  
	        sheetOne.addCell(content31);
	        sheetOne.addCell(content41);
	        sheetOne.addCell(content51);
	        sheetOne.addCell(content61);
	        sheetOne.addCell(content71);
	        
	        sheetOne.mergeCells(1, 5, 1,9);
	        
	        
	        Label column42=new Label(2,4,"产品名称",wcf_title);
	        Label column43=new Label(3,4,"计费数(笔)",wcf_title);
	        Label column44=new Label(4,4,"单价",wcf_title);
	        Label column45=new Label(5,4,"计费金额",wcf_title);
	        Label column46=new Label(6,4,"备注",wcf_title);
	        
	        sheetOne.addCell(column42);  
	        sheetOne.addCell(column43);  
	        sheetOne.addCell(column44);
	        sheetOne.addCell(column45);
	        sheetOne.addCell(column46);
	        
	        Label column52=new Label(2,5,"征信报告",wcf_title);
	        Label column53=new Label(3,5,"15",wcf_title);
	        Label column54=new Label(4,5,"79",wcf_title);
	        Label column55=new Label(5,5,"1185.0",wcf_title);
	        Label column56=new Label(6,5,"",wcf_title);
	        
	        sheetOne.addCell(column52);  
	        sheetOne.addCell(column53);  
	        sheetOne.addCell(column54);
	        sheetOne.addCell(column55);
	        sheetOne.addCell(column56);
	        
	        Label column62=new Label(2,6,"行驶证查询",wcf_title);
	        Label column63=new Label(3,6,us.getDrivingTimes().toString(),wcf_title);
	        Label column64=new Label(4,6,us.getDrivingPrice().toString(),wcf_title);
	        Label column65=new Label(5,6,b1,wcf_title);
	        Label column66=new Label(6,6,"",wcf_title);
	        
	        sheetOne.addCell(column62);  
	        sheetOne.addCell(column63);  
	        sheetOne.addCell(column64);
	        sheetOne.addCell(column65);
	        sheetOne.addCell(column66);
	        
	        Label column72=new Label(2,7,"车辆违章查询",wcf_title);
	        Label column73=new Label(3,7,us.getCarTimes().toString(),wcf_title);
	        Label column74=new Label(4,7,us.getCarPrice().toString(),wcf_title);
	        Label column75=new Label(5,7,b4,wcf_title);
	        Label column76=new Label(6,7,"",wcf_title);
	        
	        sheetOne.addCell(column72);  
	        sheetOne.addCell(column73);  
	        sheetOne.addCell(column74);
	        sheetOne.addCell(column75);
	        sheetOne.addCell(column76);
	        
	        Label column82=new Label(2,8,"飞行记录查询",wcf_title);
	        Label column83=new Label(3,8,us.getFlyTimes().toString(),wcf_title);
	        Label column84=new Label(4,8,us.getFlyPrice().toString(),wcf_title);
	        Label column85=new Label(5,8,b3,wcf_title);
	        Label column86=new Label(6,8,"",wcf_title);
	        
	        sheetOne.addCell(column82);  
	        sheetOne.addCell(column83);  
	        sheetOne.addCell(column84);
	        sheetOne.addCell(column85);
	        sheetOne.addCell(column86);
	        
	        Label column92=new Label(2,9,"学历查询",wcf_title);
	        Label column93=new Label(3,9,us.getEduTimes().toString(),wcf_title);
	        Label column94=new Label(4,9,us.getEduPrice().toString(),wcf_title);
	        Label column95=new Label(5,9,b3,wcf_title);
	        Label column96=new Label(6,9,"",wcf_title);
	        
	        sheetOne.addCell(column92);  
	        sheetOne.addCell(column93);  
	        sheetOne.addCell(column94);
	        sheetOne.addCell(column95);
	        sheetOne.addCell(column96);
	        
	        Label column101=new Label(1,10,"总计",wcf_title);
	        Label column102=new Label(2,10,"￥"+c,wcf_title);
	        
	        
	        sheetOne.addCell(column101);  
	        sheetOne.addCell(column102);  
	        
	        sheetOne.mergeCells(2, 10, 6,10);
	        
	        

	        //写入数据并关闭文件   
	        book.write();   
	        book.close();   
	    }catch(Exception e){   
	        System.out.println(e);   
	    }   

	}

}
