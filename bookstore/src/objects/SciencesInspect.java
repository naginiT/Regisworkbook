package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SciencesInspect extends Browser
	{
	static WebElement element;
	static By  Life=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[5]/a/span");
	static By  Boitech=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[5]/div/div/div/div/div/ul/li[1]/a/span");
	static By  Biological=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[5]/div/div/div/div/div/ul/li[1]/div/div/div/div/div/ul/li[1]/a/span");
	public SciencesInspect(WebDriver driver) 
	{
	
		super();
	}
	public static WebElement Lyfe()
	{
		element=driver.findElement(Life);
		return element;	
		
	}
	public static WebElement Tech()
	{
		element= driver.findElement(Boitech);
		return element;	
		}
	public static WebElement Therapy()
	{
		element= driver.findElement(Biological);
		return element;	
		}



}
