package com.newtouch.fbf.common;


import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
/**
 * <p>Title:  </p>
 * <p>Description:  图片上传</p>
 * @author wei
 * @date
 */
public class UploadUtils {
	public static String uploadFile(MultipartFile file, HttpServletRequest request) {
		if(file.isEmpty()) {
			return null;
		}
		String fileName = file.getOriginalFilename();
		FileOutputStream outputStream;
		try {
			outputStream = new FileOutputStream("D:/Code/HBuilder/zhengxin-front/PC_Xingchen_web_02/dist/images/uploadimages/" + fileName);
			outputStream.write(file.getBytes());
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileName;
	}
}
