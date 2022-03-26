package com.instarentProjectManagement.Utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {
	Properties p;
	public ReadConfig() {
	//public static void main(String[] args) throws IOException {

//	 p=new Properties();
//	FileInputStream fi = new FileInputStream(".\\Configuration\\config.properties");
//	p.load(fi);	
//	System.out.println(p.getProperty("baseUrl"));
//	}

	try {
		FileInputStream fi = new FileInputStream(".\\Configuration\\config.properties");
		p=new Properties();
		p.load(fi);
		
	}catch (Exception e) {
		System.out.print("Exception is"+e.getMessage());
	}} 
	public String getApplicationUrl() {
		String appUrl=p.getProperty("baseUrl");
		return appUrl;
		
	}
	public String getApplicationUrl2() {
		String appUrl1=p.getProperty("baseUrli");
		return appUrl1;
		
	}

	public String getusername() {
		String username=p.getProperty("user");
		return username;
	}
	
	public String getpassword() {
		String password=p.getProperty("passwords");
		return password;
	}
	
	
}