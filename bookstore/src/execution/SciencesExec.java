package execution;

import org.openqa.selenium.WebElement;

import actions.SciencesActions;
import objects.Browser;

public class SciencesExec
	{
	public static void goods(WebElement Lyfe, WebElement Tech,WebElement Therapy) throws Exception
	{
		Browser.browserm();
		SciencesActions.lfe(Lyfe, Tech, Therapy);
		
	}


}
