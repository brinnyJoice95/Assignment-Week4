package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/selectable/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.switchTo().frame(0);
	    WebElement select  = driver.findElement(By.xpath("//li[text()='Item 1']"));
	    WebElement select2 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	    Actions builder=new Actions(driver);
	    builder.clickAndHold(select).moveToElement(select2).release().perform();//(select2).release().perform();
	    String title1 =driver.getTitle();
        System.out.println(title1);
		
	 
	}

}
