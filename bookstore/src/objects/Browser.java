package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser 
{
public static WebDriver driver;
@Test
public static void browserm( ) throws Exception  
{
	
System.setProperty("webdriver.chrome.driver","D:\\Imran\\Jarfiles\\chromedriver.exe");
 driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.cubicitsolution.co.in/bookstore/");
//Thread.sleep(5000);
//driver.findElement(By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li[1]/a/span")).click();

 }
}