package com.learning.SelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SampleTest {
	WebDriver driver;
	
	public void TestM() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rana\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
   driver=new ChromeDriver();  
     
      // Launch Website  
   driver.navigate().to("http://www.javatpoint.com/");  
     
    //Maximize the browser  
     driver.manage().window().maximize();  
     
     //Scroll down the webpage by 5000 pixels  
   JavascriptExecutor js = (JavascriptExecutor)driver;  
   js.executeScript("scrollBy(0, 5000)");   
     
    // Click on the Search button  
   driver.findElement(By.linkText("Core Java")).click();
   
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   driver.quit();
   
	}

}
