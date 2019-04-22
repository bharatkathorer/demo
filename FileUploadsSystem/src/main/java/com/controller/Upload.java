package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class Upload extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		
		String name1 = null;
		try {
			ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
			List<FileItem> f=sf.parseRequest(request);
			for(FileItem fi:f) {
				name1=fi.getName().toString();
				fi.write(new File("D:\\Projects in 2019\\FileUploadsSystem\\src\\main\\webapp\\images\\"+fi.getName().replaceAll(fi.getName(), "b.jpg")));
			}
			out.println("File Uploaded" +name1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
