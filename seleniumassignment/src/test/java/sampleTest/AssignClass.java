package sampleTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
        //web_dirver  initialization
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//login initialization
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		//add to cart relative path
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		Thread.sleep(2000);
		
		
		//click to icon relative path
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		Thread.sleep(2000);
		
		
		//checkout button 
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		//Enter First name & last name
		driver.findElement(By.id("first-name")).sendKeys("Mahmudur");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Rahman");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("3100");
		Thread.sleep(2000);
		
		//continue relative path
		
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(2000);
		
		//finish absolute path
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
		Thread.sleep(2000);


	}

}
