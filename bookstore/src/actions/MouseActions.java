package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import objects.Browser;

public class MouseActions extends Browser
	{
	 public static void agricul(WebElement Agricultre,WebElement Agrisub, WebElement Agripro)
	  {
			Actions a=new Actions(driver);
			a.moveToElement(Agricultre).build().perform();
			a.moveToElement(Agrisub).build().perform();
			a.moveToElement(Agripro).click();
			
}

	}