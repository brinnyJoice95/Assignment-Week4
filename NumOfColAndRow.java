package week4.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumOfColAndRow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(" https://html.com/tags/table/ ");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   // 1. Launch the URL https://html.com/tags/table/
	    //	2. Get the count of number of rows
	    	//3. Get the count of number of columns
	    List<WebElement> col = driver.findElements(By.xpath("//div[@class='render']/table//tr"));
	    System.out.println("count of column :" +col.size());
	    
	    
	    List<WebElement> row = driver.findElements(By.xpath("//div[@class='render']/table//td"));
	    System.out.println("Count iof row :" +row.size());
	}

}
