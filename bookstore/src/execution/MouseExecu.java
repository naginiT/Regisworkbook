package execution;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import actions.MouseActions;
import objects.Browser;

public class MouseExecu 
	{
	
	public void mouse(WebElement Agricultre, WebElement Agrisub, WebElement Agripro) throws Exception 
	{
		Browser.browserm();
		
		MouseActions.agricul(Agricultre, Agrisub, Agripro);
		
		
	}

}
