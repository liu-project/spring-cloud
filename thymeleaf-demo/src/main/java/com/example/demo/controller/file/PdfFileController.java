package com.example.demo.controller.file;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pdf")
public class PdfFileController {

	
	@GetMapping("/download/{filename}")
	@ResponseBody
	public void download(@PathVariable("filename")String filename, HttpServletResponse response) throws IOException {
		String fullPath = "static/" + filename;
		response.addHeader("Content-Type", "application/pdf");
		//直接下载时要指定
//		response.addHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode("CA搭建过程.pdf", "UTF-8"));
		response.addHeader("Content-Disposition", "fileName=" + URLEncoder.encode("修改保存的文件名测试.pdf", "UTF-8"));
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(fullPath);
		OutputStream out = response.getOutputStream();
		byte[] buf = new byte[512];
		while (in.read(buf) != -1) {
			out.write(buf);
		}
		in.close();
		out.flush();
		out.close();
		System.out.println(filename);
	}
}
