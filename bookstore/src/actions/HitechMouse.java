package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import objects.Browser;

public class HitechMouse extends Browser
{
 public static void media(WebElement Tech,WebElement Services)
  {
		Actions a=new Actions(driver);
		a.moveToElement(Tech).build().perform();
		a.moveToElement(Services).click();
		
		
}
	

}
