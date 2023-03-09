package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01 {
 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("home123@abc.com");
		WebElement emptypassword=driver.findElement(By.id("password"));
		emptypassword.sendKeys("");
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		 String exppassword = "Please enter your password.";
	      //identify actual error message
	      WebElement errormsg = driver.findElement(By.id("error"));
	      String display = errormsg.getText();
	      System.out.println("Error message is: "+ display);
	      //verify error message with Assertion
	      Assert.assertEquals(exppassword, display);
	      driver.close();
	}
}
	