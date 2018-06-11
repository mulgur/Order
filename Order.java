package com.weborder;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/merveulgur/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		driver.findElement(By.xpath("//a[@href=\"Process.aspx\"]")).click();
		
		Random rd = new Random(); 
        int n = rd.nextInt(100);
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(n + "");
        
       
        int nums = 65 + (int)(Math.random() * ((90 - 65) + 1));
        char ch = (char) nums;
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John " + ch + " Smith");
        
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 Any st");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Anytown");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Virginia");
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys("22102");
		
		
        int crd = 1 + (int)(Math.random() * ((3 - 1) + 1));
        
        String s = "";
        for(int i = 0; i < 14; i++) {
        	s = s + rd.nextInt(9);
        	
        }
        
        
        switch(crd) {
        case 1: driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("46" + s);
        break;       
        case 2: driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();   
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("57" + s);
        break;
        case 3: driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();  
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("3" + s);
		break;
               
        }
        
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("03/2020");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();

		

        
        
        
        

        
        


	}

}
