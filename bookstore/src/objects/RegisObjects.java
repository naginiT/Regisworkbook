package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisObjects extends Browser
{

static WebElement element;
static By Fname=By.xpath("//*[@id=\"input-firstname\"]");
static By Lname=By.xpath("//*[@id=\"input-lastname\"]");
static By Email=By.xpath("//*[@id=\"input-email\"]");
static By Phone=By.xpath("//*[@id=\"input-telephone\"]");
static By fax=By.xpath("//*[@id=\"input-fax\"]");
static By Cmpy=By.xpath("//*[@id=\"input-company\"]");
static By Address=By.xpath("//*[@id=\"input-address-1\"]");
static By Add=By.xpath("//*[@id=\"input-address-2\"]");
static By City=By.xpath("//*[@id=\"input-city\"]");
static By Post=By.xpath("//*[@id=\"input-postcode\"]");
static By Country=By.xpath("//*[@id=\"input-country\"]");
static By State=By.xpath("//*[@id=\"input-zone\"]");
static By Password=By.xpath("//*[@id=\"input-password\"]");
static By NewPass=By.xpath("//*[@id=\"input-confirm\"]");
static By Sub=By.xpath("//*[@id=\"content\"]/form/fieldset[4]/div/div/label[2]/input");
static By Policy=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");

static By Con=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

public RegisObjects(WebDriver driver)
{
	super();
}
public static WebElement frstname()
{
element= driver.findElement(Fname);
return element;
}
public static WebElement lastname()
{
element= driver.findElement(Lname);
return element;
}
public static WebElement mail()
{
element= driver.findElement(Email);
return element;
}
public static WebElement contact()
{
element= driver.findElement(Phone);
return element;
}
public static WebElement faxx()
{
element= driver.findElement(fax);
return element;
}
public static WebElement company()
{
element= driver.findElement(Cmpy);
return element;
}
public static WebElement add()
{
element= driver.findElement(Address);
return element;
}
public static WebElement Add2()
{
element= driver.findElement(Add);
return element;
}

public static WebElement place()
{
element= driver.findElement(City);
return element;
}
public static WebElement postcode()
{
element= driver.findElement(Post);
return element;
}

public static Select countrie()
{
	 Select select=new Select(driver.findElement(Country));
		return select;
}
public static Select Statee()
{
	 Select select=new Select(driver.findElement(State));
		return select;
}
public static WebElement passwrd()
{
element= driver.findElement(Password);
return element;
}
public static WebElement newpassword()
{
element= driver.findElement(NewPass);
return element;
}
public static WebElement subscribe()
{
element= driver.findElement(Sub);
return element;
}
public static WebElement accept()
{
element= driver.findElement(Policy);
return element;
}
public static WebElement contiune()
{
element= driver.findElement(Con);
return element;
}


}