package com.vm.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.vm.selenium.utilities.RegressionCommons;

public class Home extends RegressionCommons
{
	WebDriver driver;
	
	public Home(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	@FindBy(xpath="(//span[text()='Resources'])[1]")
	public WebElement Resources;
	
	@FindBy(xpath="(//span[text()='About'])[1]")
	public WebElement About;
	
	@FindBy(xpath="(//span[text()='Blog'])[1]")
	public WebElement Blog;
	
	@FindBy(xpath="(//span[text()='Careers'])[1]")
	public WebElement Careers;
	
	@FindBy(xpath="(//span[text()='News'])[1]")
	public WebElement News;
	
	@FindBy(xpath="(//span[text()='Events'])[1]")
	public WebElement Events;
	
	@FindBy(xpath="(//nav[@id='utility-menu'])[1]/ul/li")
	public List<WebElement> utilityMenu;
	
	public void homePage_Menus(ExtentTest test) throws Exception
	{
		String resources = Resources.getText();
		System.out.println(resources);
		equalIgnoreCase(driver, test, resources, "Resources");
		String about = About.getText();
		System.out.println(about);
		equalIgnoreCase(driver, test, about, "About");
		String blog = Blog.getText();
		System.out.println(blog);
		equalIgnoreCase(driver, test, blog, "Blog");
		String careers = Careers.getText();
		System.out.println(careers);
		equalIgnoreCase(driver, test, careers, "Careers");
		String news = News.getText();
		System.out.println(news);
		equalIgnoreCase(driver, test, news, "News");
		String events = Events.getText();
		System.out.println(events);
		equalIgnoreCase(driver, test, events, "Events");
			
	}
	
	
	public void menus(ExtentTest test) throws Exception
	{
		for(int i =1 ; i<=utilityMenu.size(); i++)
		{
			System.out.println("((//nav[@id='utility-menu'])[1]/ul/li)["+ i + "]");

			String menuname = driver.findElement(By.xpath("((//nav[@id='utility-menu'])[1]/ul/li)["+ i + "]")).getText();
			System.out.println(menuname);
			test.log(LogStatus.PASS, menuname);
		}
		
	
		
		
	}
	
	

}
