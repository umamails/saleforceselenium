package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC05 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("home123@abc.com");
	WebElement enterpassword=driver.findElement(By.id("password"));
	enterpassword.sendKeys("robbin08");
	WebElement login=driver.findElement(By.id("Login"));
	login.click();
	//Thread.sleep(2000);
	WebElement usermenu=driver.findElement(By.xpath("//div[@class='menuButton menuButtonRounded']"));
	usermenu.click();
	String display=usermenu.getText();
	System.out.println("username menu name is " +display);
	
	
}
}
