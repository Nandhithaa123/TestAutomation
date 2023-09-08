package TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony 
{
	public static void main(String[] args) 
	{
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("https://www.tamilmatrimony.in/");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//select the matrimony profile as yourself
		WebElement profile=driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		Select profile1=new Select(profile);
		profile1.selectByVisibleText("Myself");
		//enter the name
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Nandhitha");
		//click on gender
		driver.findElement(By.xpath("//input[@id='genderfemale']")).click();
		//select the date
		WebElement day=driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select day1=new Select(day);
		day1.selectByValue("10");
		//Select the month
		WebElement month=driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select month1=new Select(month);
		month1.selectByVisibleText("July");
		//select the year
		WebElement year=driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select year1=new Select(year);
		year1.selectByValue("2003");
		//select your religion
		
		WebElement religion=driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select religion1=new Select(religion);
		religion1.selectByVisibleText("Hindu");
		//select your mother tongue
		WebElement motherToungue=driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select motherToungue1=new Select(religion);
		motherToungue1.selectByVisibleText("Hindu");
		//select your country
		WebElement country=driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select country1=new Select(country);
		country1.selectByVisibleText("India");
		//enter your mobileNo
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9941666604");
		//enter your mailId
		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("nandhitharamesh03@gmail.com");
		//close the browser
		driver.close();
		
		
		
		
		
	}

}
