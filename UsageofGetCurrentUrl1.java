package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetCurrentUrl1 {
public static void main(String[] args) {
	//instantiate browser specific class
	WebDriver driver=new ChromeDriver();
	//pass the main url
	driver.get("https://www.flipkart.com/");
	//pass the actual login page url
	String actualloginpageurl=driver.getCurrentUrl();
	System.out.println("actualloginpageurl="+actualloginpageurl);
}
}
