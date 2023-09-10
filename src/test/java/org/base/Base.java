package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
public static WebDriver driver;
	
public static void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--Remote-allow-origins=*");
	
	driver = new ChromeDriver(co);
		driver.manage().window().maximize();
}
public static void urlLaunch(String url) {
	driver.get(url);
}
public static WebElement locator(String attributeName,String attributeValue) {	
	if(attributeName.equalsIgnoreCase("id")) {
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}
	else if(attributeName.equalsIgnoreCase("name")) {
		WebElement findElement = driver.findElement(By.name(attributeName));
		return findElement;
	}
	else {
		return null;
	}}
	public static WebElement xpathLocator(String xpathExpression) {
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;
		}
	public static void  sendText(WebElement element,String keyToSend) {
	element.sendKeys(keyToSend);
		}
	public static void elementClick(WebElement element) {
		WebElement findElement = driver.findElement(By.id("loginbutton"));
		findElement.click();	
	}
	}