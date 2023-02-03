package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetTitle {
public static void main(String[] args) {
	//instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	//triger the url of app
	driver.get("https://123movies-to.org/");
	//capture the title of the web page
	String actualTitle=driver.getTitle();
	System.out.println("actualTitle= "+actualTitle);
}
}
