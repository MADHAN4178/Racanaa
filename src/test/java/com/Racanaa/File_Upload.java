package com.Racanaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Eclipse\\Eclipse Workspace\\Racanaa\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/upload");
    WebElement uploadElement = driver.findElement(By.id("//input[@id='file-upload']"));

    // enter the file path onto the file-selection input field
    uploadElement.sendKeys("C:\\newhtml.html");

    // check the "I accept the terms of service" check box
    driver.findElement(By.id("terms")).click();

    // click the "UploadFile" button
    driver.findElement(By.name("send")).click();
}
}
