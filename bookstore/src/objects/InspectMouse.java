package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InspectMouse extends Browser  
{

 static WebElement element;
static By  Agriculture=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/a/span[2]");
static By Sub=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/div/div/div/div/div/ul/li[1]/a/span");
static By title=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/div/div/div/div/div/ul/li[1]/div/div/div/div/div/ul/li[1]/a/span");


public  InspectMouse(WebDriver driver)
{
	super();
}
public static WebElement Agricultre()
{
	element= driver.findElement(Agriculture);
	return element;
 }
public static WebElement Agrisub()
{
	element= driver.findElement(Sub);
	return element;
 }
public static WebElement Agripro()
{
	element= driver.findElement(title);
	return element;
 }

}
