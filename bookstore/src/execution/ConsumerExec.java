package execution;

import org.openqa.selenium.WebElement;

import actions.ConsumerActions;
import objects.Browser;

public class ConsumerExec
	{
	public static void goods(WebElement Goods, WebElement Luxury) throws Exception
	{
		Browser.browserm();
		ConsumerActions.goods(Goods, Luxury);
	}

}
