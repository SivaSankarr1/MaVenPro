package org.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitSample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--Remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebElement text1 = driver.findElement(By.id("populate-text"));
		text1.click();
		WebDriverWait wait =new WebDriverWait(driver, 15);
		Boolean presentText = wait.until(ExpectedConditions.textToBePresentInElement(text1, "Selenium Webdriver"));
		if(presentText==true) {
		System.out.println(text1.getText());
		}
		
		driver.close();
				
	}
	
}
