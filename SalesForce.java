package home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("bootCamp@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		//driver.findElement(By.partialLinkText("/lightning/o/Opportunity/home")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()", element);
		//driver.findElement(By.xpath("span[text()='Opportunities']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		WebElement name = driver.findElement(By.xpath("(//input[@class='slds-input'])[7]"));
		name.sendKeys("Salesforce"); 
		String gettext = name.getAttribute("value");
		System.out.println("text : " + gettext);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//lightning-button-icon[contains(@class,'slds-input')]/preceding-sibling::input")).sendKeys("09/1/2025");
		 //driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux fix-slds-input_faux slds-com')]")).click();
		  driver.findElement(By.xpath("//span[text()='--None--']")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.findElement(By.xpath("(//span[text()='Needs Analysis'])[4]")).click();
	     driver.findElement(By.xpath("(//lightning-button[@variant='brand']/button)[3]")).click();
	
		
		
		 
	}

	
	}



