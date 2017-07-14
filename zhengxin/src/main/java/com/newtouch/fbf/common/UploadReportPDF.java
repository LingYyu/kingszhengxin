package com.newtouch.fbf.common;/** * @author  wei * @date 创建时间：2016年11月5日 下午3:49:34 * @version 1.0 * @parameter  * @since  * @return  */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class UploadReportPDF {
	private 

	Document document = new Document();// 建立一个Document对象

	private static Font headfont;// 设置字体大小
	private static Font keyfont;// 设置字体大小
	private static Font textfont;// 设置字体大小

	static {
		BaseFont bfChinese;
		try {

			bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
			headfont = new Font(bfChinese, 10, Font.BOLD);// 设置字体大小
			keyfont = new Font(bfChinese, 8, Font.BOLD);// 设置字体大小
			textfont = new Font(bfChinese, 8, Font.NORMAL);// 设置字体大小
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UploadReportPDF(File file) {
		document.setPageSize(PageSize.A4);// 设置页面大小
		try {
			PdfWriter.getInstance(document, new FileOutputStream(file));
			document.open();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	int maxWidth = 520;

	public PdfPCell createCell(String value, com.itextpdf.text.Font font, int align) {
		PdfPCell cell = new PdfPCell();
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(align);
		cell.setPhrase(new Phrase(value, font));
		return cell;
	}

	public PdfPCell createCell(String value, com.itextpdf.text.Font font) {
		PdfPCell cell = new PdfPCell();
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setPhrase(new Phrase(value, font));
		return cell;
	}

	public PdfPCell createCell(String value, com.itextpdf.text.Font font, int align, int colspan, int rowspan) {
		PdfPCell cell = new PdfPCell();
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		// cell.setHorizontalAlignment(align);
		cell.setColspan(colspan);
		cell.setRowspan(rowspan);
		cell.setPhrase(new Phrase(value, font));
		return cell;
	}

	public PdfPCell createCell(String value, com.itextpdf.text.Font font, int align, int colspan, int rowspan,
			boolean boderFlag) {
		PdfPCell cell = new PdfPCell();
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// cell.setHorizontalAlignment(align);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setColspan(colspan);
		cell.setRowspan(rowspan);
		cell.setPhrase(new Phrase(value, font));
		cell.setPadding(3.0f);
		if (!boderFlag) {
			cell.setBorder(0);
			cell.setPaddingTop(15.0f);
			cell.setPaddingBottom(8.0f);
		}
		return cell;
	}

	public PdfPTable createTable(int colNumber) {
		PdfPTable table = new PdfPTable(colNumber);
		try {
			table.setTotalWidth(maxWidth);
			table.setLockedWidth(true);
			table.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.getDefaultCell().setBorder(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return table;
	}

	public PdfPTable createTable(float[] widths) {
		PdfPTable table = new PdfPTable(widths);
		try {
			table.setTotalWidth(maxWidth);
			table.setLockedWidth(true);
			table.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.getDefaultCell().setBorder(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return table;
	}

	public PdfPTable createBlankTable() {
		PdfPTable table = new PdfPTable(1);
		table.getDefaultCell().setBorder(0);
		table.addCell(createCell("", keyfont));
		table.setSpacingAfter(20.0f);
		table.setSpacingBefore(20.0f);
		return table;
	}
	 public PdfPCell createCell(Image img,com.itextpdf.text.Font font,int align,int colspan,int rowspan){  
         PdfPCell cell = new PdfPCell();  
         cell.setVerticalAlignment(Element.ALIGN_MIDDLE); 
         cell.setHorizontalAlignment(Element.ALIGN_CENTER);
         //cell.setHorizontalAlignment(align);  
         cell.setFixedHeight(30);
         cell.setColspan(colspan); 
         cell.setRowspan(rowspan);
         cell.setImage(img);
         //cell.setPhrase(new Phrase(img,font));  
        return cell;  
    }

	public void generatePDF(Modules modules) throws Exception {
        
		PdfPTable table1 = createTable(4);
		// table1.addCell(createCell("学生信息列表：",
		// keyfont,Element.ALIGN_LEFT,4,maxWidth, false));

		table1.addCell(createCell("kings个人征信报告", keyfont, Element.ALIGN_CENTER, 4, maxWidth));
		table1.addCell(createCell("报告编号", keyfont, Element.ALIGN_CENTER, 4, maxWidth));
		table1.addCell(createCell("基本信息", keyfont, Element.ALIGN_CENTER, 4, maxWidth));
		table1.addCell(createCell("星辰评分", keyfont, Element.ALIGN_CENTER));

		// Image image = Image.getInstance("vonnegut.gif");
		Image img=Image.getInstance("D:/Code/HBuilder/zhengxin-front/PC_Xingchen_web_02/dist/images/uploadimages/"+modules.gettUserBaseinfo().getCardPicUrl1());
		table1.addCell(createCell(img, textfont, 0, 0, 7));
		table1.addCell(createCell("姓名", textfont));
		table1.addCell(createCell(modules.gettUserBaseinfo().getUserName(), textfont));
		table1.addCell(createCell(modules.gettUserReport().getMark().toString(), textfont, 0, 0, 3));
		table1.addCell(createCell("年龄", textfont));
		table1.addCell(createCell(String.valueOf(modules.gettUserReport().getAge()), textfont));
		table1.addCell(createCell("性别", textfont));
		table1.addCell(createCell(modules.gettUserReport().getSex(), textfont));
		table1.addCell(createCell("身份证号", textfont));
		table1.addCell(createCell(modules.gettUserReport().getIdCard(), textfont));
		table1.addCell(createCell("贷前建议", textfont));
		table1.addCell(createCell("手机号", textfont));
		table1.addCell(createCell(modules.gettUserBaseinfo().getTelephone(), textfont));
		table1.addCell(createCell(modules.gettUserReport().getSuggestion(), textfont, 0, 0, 2));
		table1.addCell(createCell("学历", textfont));
		table1.addCell(createCell(modules.getEducationInfoCheck().getCollegeLevel(), textfont));
		table1.addCell(createCell("贷款类型", textfont));
		table1.addCell(createCell(modules.gettUserReport().getBorrowType(), textfont));

		table1.addCell(createCell("身份验证核查", textfont));
		table1.addCell(createCell("认真结果", textfont));
		table1.addCell(createCell("一致", textfont, Element.ALIGN_CENTER, 2, 0));

		table1.addCell(createCell("通讯信息查询", textfont, 0, 0, 2));
		table1.addCell(createCell("手机在网时长", textfont));
		table1.addCell(createCell("5年", textfont, Element.ALIGN_CENTER, 2, 0));
		table1.addCell(createCell("手机实名认证", textfont));
		table1.addCell(createCell("一致", textfont, Element.ALIGN_CENTER, 2, 0));

		table1.addCell(createCell("银行卡信息", textfont, 0, 0, 2));
		table1.addCell(createCell("银行卡验证", textfont));
		table1.addCell(createCell("一致", textfont, Element.ALIGN_CENTER, 2, 0));
		table1.addCell(createCell("活跃卡反馈", textfont));
		table1.addCell(createCell("是", textfont, Element.ALIGN_CENTER, 2, 0));

		table1.addCell(createCell("学历信息查询", textfont, 0, 0, 16));
		table1.addCell(createCell("学历验证", textfont, 0, 0, 9));
		table1.addCell(createCell("毕业学校", textfont));
		table1.addCell(createCell(modules.getEducationInfoCheck().getCollege(), textfont));
		table1.addCell(createCell("学历层次", textfont));
		table1.addCell(createCell("学士学位", textfont));
		table1.addCell(createCell("入学时间", textfont));
		table1.addCell(createCell(new SimpleDateFormat("yyyy/MM/dd").
				format(modules.getEducationInfoCheck().getStartTime()), textfont));
		table1.addCell(createCell("专业", textfont));
		table1.addCell(createCell(modules.getEducationInfoCheck().getMajor(), textfont));
		table1.addCell(createCell("毕业时间", textfont));
		table1.addCell(createCell(new SimpleDateFormat("yyyy/MM/dd").
				format(new Date(modules.getEducationInfoCheck().getStartTime().getYear()+4, 6,20)), textfont));
		table1.addCell(createCell("毕业结论", textfont));
		table1.addCell(createCell("优", textfont));
		table1.addCell(createCell("学历类别", textfont));
		table1.addCell(createCell("全", textfont));
		table1.addCell(createCell("状态", textfont));
		table1.addCell(createCell("成功", textfont));
		table1.addCell(createCell("描述", textfont));
		table1.addCell(createCell("优秀", textfont));

		table1.addCell(createCell("学籍验证", textfont, 0, 0, 7));
		table1.addCell(createCell("学院", textfont));
		table1.addCell(createCell("一致", textfont));
		table1.addCell(createCell("学院级别", textfont));
		table1.addCell(createCell("一致", textfont));
		table1.addCell(createCell("毕业时间", textfont));
		table1.addCell(createCell(new SimpleDateFormat("yyyy/MM/dd").
				format(new Date(modules.getEducationInfoCheck().getStartTime().getYear()+4, 6,20)), textfont));
		table1.addCell(createCell("入学时间", textfont));
		table1.addCell(createCell("一致", textfont));
		table1.addCell(createCell("状态", textfont));
		table1.addCell(createCell("成功", textfont));
		table1.addCell(createCell("学籍", textfont));
		table1.addCell(createCell("一致", textfont));
		table1.addCell(createCell("学历类别", textfont));
		table1.addCell(createCell("一致", textfont));
		document.add(table1);
		if (modules.gettUserModule().getBusinessChoose()) {
			PdfPTable table3 = createTable(5);
			table3.addCell(createCell("个人工商法人信息核查", textfont, 0, 0, 11));
			table3.addCell(createCell("企业名称", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getEnterpriseName(), textfont));
			table3.addCell(createCell("法人", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getLegalPerson(), textfont));
			table3.addCell(createCell("注册资本", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getRegisteredCapital(), textfont));
			table3.addCell(createCell("开业日期", textfont));
			table3.addCell(createCell("2012年11月", textfont));
			table3.addCell(createCell("经营期限", textfont));
			table3.addCell(createCell("外贸，批发", textfont));
			table3.addCell(createCell("登记机关", textfont));
			table3.addCell(createCell("上海市工商行政管理局", textfont));
			table3.addCell(createCell("企业股东及出资信息", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getShareholdersInfo(), textfont, 3));
			table3.addCell(createCell("企业主要管理人员及职务", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getEnterprisePosition(), textfont, 3));
			table3.addCell(createCell("企业主要管理人员是否失信", textfont));
			table3.addCell(createCell("是", textfont, 3));
			table3.addCell(createCell("被执行人姓名", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getExecutedName(), textfont));
			table3.addCell(createCell("失信人类型", textfont));
			table3.addCell(createCell("逾期还款", textfont));
			table3.addCell(createCell("性别", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getGender(), textfont));
			table3.addCell(createCell("年龄", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getDishonestyAge().toString(), textfont));
			table3.addCell(createCell("身份证号", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getIdCard(), textfont));
			table3.addCell(createCell("身份证原始签发地", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getIdcardAddress(), textfont));
			table3.addCell(createCell("立案时间", textfont));
			table3.addCell(createCell(new SimpleDateFormat("yyyy/MM/dd").
					format(modules.getLagalPersonCheck().getFilingTime()), textfont));
			table3.addCell(createCell("案件状态", textfont));
			table3.addCell(createCell("执行中", textfont));
			table3.addCell(createCell("执行法院/省份", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getCourtExecution(), textfont));
			table3.addCell(createCell("执行标的", textfont));
			table3.addCell(createCell(modules.getLagalPersonCheck().getExecutiveSubject(), textfont));

			document.add(table3);
		}
		
		if (modules.gettUserModule().getLoanChoose()) {
			PdfPTable table4 = createTable(5);
			table4.addCell(createCell("贷款信息查询", textfont, 0, 0, 5));
			table4.addCell(createCell("是否在其他平台同时借款", textfont));
			table4.addCell(createCell("是", textfont));
			table4.addCell(createCell("借款类型", textfont));
			table4.addCell(createCell("信用贷款", textfont));
			table4.addCell(createCell("借款日期", textfont));
			table4.addCell(createCell("2015/10/30", textfont));
			table4.addCell(createCell("借款金额", textfont));
			table4.addCell(createCell("10万", textfont));
			table4.addCell(createCell("借款用途", textfont));
			table4.addCell(createCell("装修", textfont));
			table4.addCell(createCell("借款期限", textfont));
			table4.addCell(createCell("3个月", textfont));
			table4.addCell(createCell("联系电话", textfont));
			table4.addCell(createCell(modules.gettUserBaseinfo().getTelephone(), textfont));
			table4.addCell(createCell("联系地址", textfont));
			table4.addCell(createCell(modules.getLoanInfoCheck().getAddress(), textfont));
			table4.addCell(createCell("是否是网贷黑名单", textfont));
			table4.addCell(createCell("是", textfont, 3));
			document.add(table4);
		}
		
		if (modules.gettUserModule().getDrivingChoose()) {
			/**
			 * 行驶证查询
			 */
			PdfPTable table5 = createTable(5);
			table5.addCell(createCell("行驶证查询", textfont, 0, 0, 7));
			table5.addCell(createCell("车牌号", textfont));
			table5.addCell(createCell(modules.getDrivingLicenseCheck().getDrivingCarNo(), textfont));
			table5.addCell(createCell("品牌", textfont));
			table5.addCell(createCell(modules.getDrivingLicenseCheck().getDrivingCarType(), textfont));
			// 以上是第一行
			table5.addCell(createCell("机动车所有人", textfont));
			table5.addCell(createCell(modules.getDrivingLicenseCheck().getDrivingCarName(), textfont));
			table5.addCell(createCell("车主身份证号", textfont));
			table5.addCell(createCell(modules.getDrivingLicenseCheck().getIdCard(), textfont));
			// 以上是第二行
			table5.addCell(createCell("机动车状态", textfont));
			table5.addCell(createCell("违法未处理", textfont));
			table5.addCell(createCell("使用性质", textfont));
			table5.addCell(createCell("私人生活用车", textfont));
			// 以上是第三行
			table5.addCell(createCell("车身颜色", textfont));
			table5.addCell(createCell(modules.getDrivingLicenseCheck().getDrivingCarColor(), textfont));
			table5.addCell(createCell("车辆保险到期日期", textfont));
			table5.addCell(createCell("2016/8/30 ", textfont));
			// 以上是第4行
			table5.addCell(createCell("发动机号", textfont));
			table5.addCell(createCell("C190C8008", textfont));
			table5.addCell(createCell("地址", textfont));
			table5.addCell(createCell(modules.getDrivingLicenseCheck().getAddress(), textfont));
			// 以上是第5行
			table5.addCell(createCell("发证日期", textfont));
			table5.addCell(createCell("2014/8/20", textfont));
			table5.addCell(createCell("初次登记日期", textfont));
			table5.addCell(createCell("2014/7/1", textfont));
			// 以上是第6行
			table5.addCell(createCell("车辆识别代号", textfont));
			table5.addCell(createCell("LSV235E789K052", textfont, 0, 3, 1));

			// 以上是第7行
			document.add(table5);
		}
		
		if (modules.gettUserModule().getIllegalChoose()) {
			PdfPTable table6 = createTable(5);
			table6.addCell(createCell("违章查询", textfont, 0, 0, 4));
			table6.addCell(createCell("违章时间", textfont));
			table6.addCell(createCell("2015/9/30", textfont));
			table6.addCell(createCell("违章地点", textfont));
			table6.addCell(createCell(modules.getIllegalInfoCheck().getViolationAddress(), textfont));
			table6.addCell(createCell("违章原因", textfont));
			table6.addCell(createCell(modules.getIllegalInfoCheck().getViolationReason(), textfont));
			table6.addCell(createCell("违章扣分", textfont));
			table6.addCell(createCell("6分", textfont));
			table6.addCell(createCell("违章罚款金额", textfont));
			table6.addCell(createCell("300元", textfont));
			table6.addCell(createCell("联系电话", textfont));
			table6.addCell(createCell(modules.getIllegalInfoCheck().getMobile(), textfont));
			table6.addCell(createCell("违章处理地址", textfont));
			table6.addCell(createCell(modules.getIllegalInfoCheck().getViolationAddress(), textfont));
			table6.addCell(createCell("执行部门", textfont));
			table6.addCell(createCell("上海公安局", textfont));
			document.add(table6);
		}
		if (modules.gettUserModule().getFlyChoose()) {
			PdfPTable table2 = createTable(6);
			table2.addCell(createCell("飞行情况核查", textfont, 0, 0, 4));
			table2.addCell(createCell("个人飞行信息查询", textfont, 0, 0, 4));
			table2.addCell(createCell("商务舱/头等舱次数", textfont));
			table2.addCell(createCell("商务舱", textfont));
			table2.addCell(createCell("经济舱次数", textfont));
			table2.addCell(createCell("3", textfont));
			table2.addCell(createCell("飞行次数", textfont));
			table2.addCell(createCell("3", textfont));
			table2.addCell(createCell("频繁乘机到达城市", textfont));
			table2.addCell(createCell("上海", textfont));
			table2.addCell(createCell("最后抵达城市", textfont));
			table2.addCell(createCell("上海", textfont));
			table2.addCell(createCell("平均票价", textfont));
			table2.addCell(createCell("300", textfont));
			table2.addCell(createCell("1年中飞行次数", textfont));
			table2.addCell(createCell("3", textfont));
			table2.addCell(createCell("飞行总里程数", textfont));
			table2.addCell(createCell("10000", textfont));

			document.add(table2);
		}

		

		document.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\text.pdf");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			new UploadReportPDF(file).generatePDF(new Modules());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
