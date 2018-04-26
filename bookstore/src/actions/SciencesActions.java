package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import objects.Browser;

public class SciencesActions extends Browser
	{
	public static void lfe(WebElement Lyfe,WebElement Tech,WebElement Therapy )
	{
		Actions a=new Actions(driver);
		a.moveToElement(Lyfe).build().perform();
		a.moveToElement(Tech).build().perform();
		a.moveToElement(Therapy).click();
		
	}

}
