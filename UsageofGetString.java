package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetString {
public static void main(String[] args) {
	//instantiate the browser specific class
	//lanuch empty chrome browser
	WebDriver driver=new ChromeDriver();
	//triger the main url of app
	driver.get("https://www.justbake.in/");
}
}
