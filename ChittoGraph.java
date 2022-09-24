package week4.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChittoGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(" https://www.chittorgarh.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  //  1. Launch the URL https://www.chittorgarh.com/
	    //	2. Click on stock market
	    //	3. Click on NSE bulk Deals
	    //	4. Get all the Security names
	    //	5. Ensure whether there are duplicate Security names
	    driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
	    driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
	    //WebElement table = driver.findElement(By.xpath("//div[@class='table-responsive']/table"));
	   List<String> lst = new ArrayList<String>();
	   
	    
	    List<WebElement> names = driver.findElements(By.xpath("//div[@class='table-responsive']/table//td[3]"));
	   
	    for (int i=1;i<names.size();i++) {
	    	String text= names.get(i).getText();
	    	for(int j= 1;j<names.size();j++) {
	    		lst.add(text);
	    		
	    		
	    	}}
	    	
	    	Set<String>dup=new HashSet<String>(lst);
	    	System.out.println(dup);
	    
	    	if(lst.size()==dup.size()) {
	    		System.out.println("Duplicate Present");}
	    	
	    		else {
	    			System.out.println("No Duplicate Present");
	    		
	    	
	    	
	    }
			
		}


	

}
