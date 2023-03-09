package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement forgotpassword=driver.findElement(By.xpath("//a[contains(text(),'Forgot Your Password')]"));
		forgotpassword.click();
		WebElement username=driver.findElement(By.xpath("//input[@id='un']"));
		username.sendKeys("home123@abc.com");
		WebElement passwordContinue=driver.findElement(By.xpath("//input[@id='continue']"));
		passwordContinue.click();
		driver.close();
	}

}
