package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConsumerInspect extends Browser  
	{
	static WebElement element;
	static By  Cnsumer=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[4]/a/span");
	static By  Luxry=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[4]/div/div/div/div/div/ul/li[6]/a/span");
	
	public ConsumerInspect(WebDriver driver) 
	{
	
		super();
	}
	public static WebElement Goods()
	{
		element=driver.findElement(Cnsumer);
		return element;	
		
	}
	public static WebElement Luxury()
	{
		element= driver.findElement(Luxry);
		return element;	
		}

}
