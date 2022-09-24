package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.leafground.com/drag.xhtml");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    WebElement sort1 = driver.findElement(By.xpath("(//td[text()='Bamboo Watch'])[2]"));
	    WebElement sort2 = driver.findElement(By.xpath("(//td[text()='Blue Band'])[2]"));
	    WebElement sort3 = driver.findElement(By.xpath("(//td[text()='Blue T-Shirt'])[2]"));
	    WebElement sort4 = driver.findElement(By.xpath("(//td[text()='Galaxy Earrings'])[2]"));
	    Actions builder = new Actions(driver);
		builder.dragAndDrop(sort1, sort3).dragAndDrop(sort2, sort4).perform();
		String title1 =driver.getTitle();
        System.out.println(title1);

	}

}
