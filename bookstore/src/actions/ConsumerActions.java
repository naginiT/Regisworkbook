package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import objects.Browser;

public class ConsumerActions extends Browser
	{
	public static void goods(WebElement Goods,WebElement Luxury)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(Luxury).build().perform();
		ac.moveToElement(Goods).click();
	
	}

}
