package execution;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import actions.HitechMouse;
import objects.Browser;

public class HitechExec
	{
	
	public void mouse(WebElement Tech, WebElement Services ) throws Exception 
	{
		Browser.browserm();
		HitechMouse.media(Tech, Services);
		
		
	}

}
