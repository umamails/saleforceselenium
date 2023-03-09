package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("home123@abc.com");
		WebElement enterpassword=driver.findElement(By.id("password"));
		enterpassword.sendKeys("robbin08");
		WebElement remember=driver.findElement(By.xpath("//input[@id='rememberUn']"));
		remember.click();
		WebElement login=driver.findElement(By.id("Login"));
		login.click();	
		WebElement Vijaya=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		Vijaya.click();
		WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		 driver.close();
	}

	}


