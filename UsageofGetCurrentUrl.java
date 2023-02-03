package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetCurrentUrl {
public static void main(String[] args) {
	//instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	//pass the main url of the app
	driver.get("https://www.burgerking.in/");
	
	String actaulLoginpageurl=driver.getCurrentUrl();
	System.out.println("actaulLoginpage url="+actaulLoginpageurl);
}
}
