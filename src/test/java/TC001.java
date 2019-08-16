import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.vm.selenium.pages.Home;
import com.vm.selenium.utilities.OpenBrowser;
import com.vm.selenium.utilities.RegressionCommons;



public class TC001 extends RegressionCommons
{
	OpenBrowser ob = new OpenBrowser();
	
	
	@BeforeSuite
	public void report()
	{
		extent = new ExtentReports(reportPath,true);
		
	}
	
	@Test
	public void TC001() throws Exception
	{
		test = extent.startTest("TC001 - ValueMomentum Home Page");
		driver = ob.browserOpen(driver, "chrome");
		navigateURL(driver, test, "https://www.valuemomentum.com/");
		
		Home homePage=PageFactory.initElements(driver, Home.class);
		homePage.homePage_Menus(test);
		
		homePage.menus(test);
	}
	
	
	@AfterMethod
	public void close()
	{
		extent.endTest(test);
		extent.flush();
		driver.close();
	}
	

}
