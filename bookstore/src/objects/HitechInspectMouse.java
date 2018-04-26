package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HitechInspectMouse extends Browser  
{
	
	static WebElement element;
	static By  Hitech=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[3]/a/span");
	static By ItServices=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[3]/div/div/div/div/div/ul/li[5]/a/span");
	
	public HitechInspectMouse(WebDriver driver) 
	{
	
		super();
	}
	public static WebElement Tech()
	{
		element=driver.findElement(Hitech);
		return element;	
		
	}
	public static WebElement Services()
	{
		element= driver.findElement(ItServices);
		return element;	
		}
	
}
