package com.newtouch.fbf.common.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * * @author wei * @date 创建时间：2016年10月29日 下午6:15:46 * @version 1.0 * @parameter
 * * @since * @return
 */
public class IdCardByNameAgeSex {
	public static int Age(String cardCode) {

		String year = cardCode.substring(6).substring(0, 4);// 得到年份
		String yue = cardCode.substring(10).substring(0, 2);// 得到月份
		Date date = new Date();// 得到当前的系统时间
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String fyear = format.format(date).substring(0, 4);// 当前年份
		String fyue = format.format(date).substring(5, 7);// 月份
		int age = 0;
		if (Integer.parseInt(yue) <= Integer.parseInt(fyue)) { // 当前月份大于用户出身的月份表示已过生
			age = Integer.parseInt(fyear) - Integer.parseInt(year) + 1;
		} else {// 当前用户还没过生
			age = Integer.parseInt(fyear) - Integer.parseInt(year);
		}
		return age;

	}

	public static String Sex(String cardCode) {
		String sex;
		if (Integer.parseInt(cardCode.substring(16).substring(0, 1)) % 2 == 0) {// 判断性别
			sex = "女";
		} else {
			sex = "男";
		}
		return sex;
	}
	public static void main(String[] args) {
		System.out.println(IdCardByNameAgeSex.Age("511023199609188565"));
		System.out.println(IdCardByNameAgeSex.Sex("511023199609188565"));
		
	
	}

}
