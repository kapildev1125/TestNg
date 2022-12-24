package com.flipkart.stepdefinition;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
   
   
public class MobilePurchase {
	   
	   @DataProvider(name = "credentials")
	   public Object[][] loginCreds(){
		return new Object[][] {{"kapil","23456"}};
		   
	   }
	   @DataProvider(name = "mobile")
	   public Object[][] mobileName(){
		return new Object[][] {{"redmi"}};
	   }
	   
	   
	@BeforeClass
	public static void launch() {
		System.out.println("launch");
	}
	@AfterClass
	public static void close() {
		System.out.println("close");
	}
	@BeforeMethod
	public void startTime() {
		System.out.println("s time");
	}
    @AfterMethod
    public void endTime() {
		System.out.println("e time");
}
    @Test(priority = 1 ,dataProvider = "credentials",enabled = false, invocationCount = 3)
    public void  login (String user , String pass) {
		System.out.println("login"+":"+user+":"+pass);
}
    @Test(priority = 2 , dataProvider ="mobile")
    public void search(String name) {
		System.out.println("search"+":"+"name");
    }
    @Test(priority = 3)
    public void mobileClick() {
		System.out.println("mobileClick");
    }
    @Test(priority = 4)
    public void windowHandling() {
		System.out.println("windowHandling");
    }
    @Test(priority = 5)
    public void addToCart() {
		System.out.println("addToCart");
}
}