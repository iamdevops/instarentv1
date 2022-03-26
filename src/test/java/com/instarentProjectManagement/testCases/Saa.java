package com.instarentProjectManagement.testCases;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saa {
	@Test
	public void ss() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.instarent.com.au");
	}

}
