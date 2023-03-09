package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC04B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("123");
		WebElement enterpassword=driver.findElement(By.id("password"));
		enterpassword.sendKeys("22131");
		WebElement login=driver.findElement(By.id("Login"));
		login.click();	
		Thread.sleep(3000);
		WebElement userPasswordError=driver.findElement(By.xpath("//div[@id='error']"));
		String experrormessage = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String display = userPasswordError.getText();
	      System.out.println("Error message is: "+ display);
	      //verify error message with Assertion
	      Assert.assertEquals(experrormessage, display);
	}

}
