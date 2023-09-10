package org.base;

import org.openqa.selenium.WebElement;

public class BaseClassTodayMain extends Base {
public static void main(String[] args) {
browserLaunch();
urlLaunch("https://www.facebook.com/login/");
locator(id,"email");



}
}
