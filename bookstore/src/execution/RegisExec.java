package execution;

import org.testng.annotations.Test;

import actions.RegisActions;
import objects.Browser;

public class RegisExec extends RegisActions
{
@Test
public void execu() throws Exception 
{
	Thread.sleep(5000);
	Browser.browserm();
	
	RegisExec obj=new RegisExec();
	obj.data("D:\\Imran\\Book1.xlsx","Sheet1");
	
}

}