package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {

		 WebDriver driver = null;
		@BeforeSuite
		 @Test (priority= 1)
		  //TEST CASE NO 1
		  		public void setUp() {
		  			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAURABH\\Desktop\\chromedriver-win64\\chromedriver.exe");
		  			  driver=new ChromeDriver(); 
		  			  driver.get("https://biz-pitch-admin.netlify.app/");
		  			  driver.manage().window().maximize();
		  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	  			
		  }
		@AfterSuite
		public void teardown() {
			  driver.close();
		}
		 @Test (priority= 2)
		  
		  public void SuccessfulLogiin() throws InterruptedException  {
			
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
				emaildField.clear();
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
				passwordField.clear();
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
				
				//Enter Login Details
				emaildField.sendKeys("kartik.quantumitinnovation@gmail.com");
				passwordField.sendKeys("password");
				Thread.sleep(3000);
				submitBtn.click();
				
				Thread.sleep(3000);
}
		 @Test (priority= 2)
		  
		  public void InvalidEmailLogin() throws InterruptedException  {
			
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
				emaildField.clear();
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
				passwordField.clear();
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
				
				//Enter Login Details
				emaildField.sendKeys("kartik.quantumitinnovation@gmail.com");
				passwordField.sendKeys("passsword");
				Thread.sleep(3000);
				submitBtn.click();
				
				
				
				 // Wait for toast message to appear
		        WebDriverWait wait = new WebDriverWait(driver, 10);
		        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div")));
				
		     // Check if toast message is displayed
		        if(toastMessage.isDisplayed()) {
		            System.out.println("Test Passed : Either admin is not set or not verified" + toastMessage.getText());
		        } else {
		            System.out.println("Toast message not displayed.");
		        }
    }		
		 @Test (priority= 3)
		  
		  public void InvalidPasswordlLogin() throws InterruptedException  {
			
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
				emaildField.clear();
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
				passwordField.clear();
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
				
				//Enter Login Details
				emaildField.sendKeys("kartik.quantumitinnovation@gmail.com");
				passwordField.sendKeys("passsworad");
				Thread.sleep(3000);
				submitBtn.click();
				
				
				
				 // Wait for toast message to appear
		        WebDriverWait wait = new WebDriverWait(driver, 10);
		        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div")));
				
		     // Check if toast message is displayed
		        if(toastMessage.isDisplayed()) {
		            System.out.println("Test Passed : Either admin is not set or not verified" + toastMessage.getText());
		        } else {
		            System.out.println("Toast message not displayed.");
		        }
}
		 @Test (priority= 4)
		  
		  public void InvalidEmailandPasswordLogin() throws InterruptedException  {
			
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
				emaildField.clear();
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
				passwordField.clear();
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
				
				//Enter Login Details
				emaildField.sendKeys("kartik.quantumitinsnovation@gmail.com");
				passwordField.sendKeys("passzsword");
				Thread.sleep(3000);
				submitBtn.click();
				
				
				
				 // Wait for toast message to appear
		        WebDriverWait wait = new WebDriverWait(driver, 10);
		        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div")));
				
		     // Check if toast message is displayed
		        if(toastMessage.isDisplayed()) {
		            System.out.println("Test Passed : Either admin is not set or not verified" + toastMessage.getText());
		        } else {
		            System.out.println("Toast message not displayed.");
		        }
}
		 @Test (priority= 5)
		  
		  public void EmailFieldIsVisible() throws InterruptedException  {
			
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
				emaildField.isDisplayed();
				
		        }
		 @Test (priority= 5)
		  
		  public void PasswordFieldIsVisible() throws InterruptedException  {
			
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
				passwordField.isDisplayed();
}
		 @Test (priority= 6)
		  
		  public void TestLogo() throws InterruptedException  {
			
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
				emaildField.clear();
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
				passwordField.clear();
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
				
				//Enter Login Details
				emaildField.sendKeys("kartik.quantumitinnovation@gmail.com");
				passwordField.sendKeys("password");
				Thread.sleep(3000);
				submitBtn.click();
				
				Thread.sleep(3000);
				
				
				WebElement Category= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				Category.click();
				
				Thread.sleep(3000);
				
				
				WebElement Logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a/img"));
				Logo.click();
				Thread.sleep(7000);
				
				WebElement Dashboard= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/p[1]/strong"));
if(Dashboard.isDisplayed()) {
	System.out.println("Test Case Passed: Homepage is displayed successful");
}else {
	System.out.println("Test Case Failed: Homepage is not displayed ");

}
				
			
}
		 @Test (priority= 7)
		  //Test Case 42: Verify that the admin can search for a specific user to deactivate.
		  public void SearchUser() throws InterruptedException  {
			
			 // Search the Email and Password fields
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
				emaildField.clear();
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
				passwordField.clear();
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
				
				//Enter Login Details
				emaildField.sendKeys("kartik.quantumitinnovation@gmail.com");
				passwordField.sendKeys("password");
				Thread.sleep(3000);
				submitBtn.click();
				
				Thread.sleep(3000);
				
				// Go to User Management Page
				WebElement User= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
				User.click();
				
				Thread.sleep(3000);
				
				// Enter Search Keyword in search field
				WebElement SearchBox= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/div/div/input"));
				SearchBox.sendKeys("Vishal verma");
				Thread.sleep(7000);
			
				// Check the result
				WebElement SearchResult= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr/td[3]"));
if(SearchResult.isDisplayed()) {
	System.out.println("Test Case Passed: Search Result is displayed successful");
}else {
	System.out.println("Test Case Failed: Search Result is not displayed ");

}
}
		 @Test (priority= 8)
		  //Test Case 43: Verify that the admin can deactivate a user account.
		  public void DeactivateUser() throws InterruptedException  {
			
			 // Search the Email and Password fields
				WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
				emaildField.clear();
				WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
				passwordField.clear();
				WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
				
				//Enter Login Details
				emaildField.sendKeys("kartik.quantumitinnovation@gmail.com");
				passwordField.sendKeys("password");
				Thread.sleep(3000);
				submitBtn.click();
				
				Thread.sleep(3000);
				
				// Go to User Management Page
				WebElement User= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
				User.click();
				
				Thread.sleep(3000);
			
				// Change to deactivate
				WebElement Deactivate= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button"));
				Deactivate.click();
				
				
				// Check the result
			WebElement	Result = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button"));

if(Result.isDisplayed()) {
	System.out.println("Test Case Passed: Deactivate User successful");
}else {
	System.out.println("Test Case Failed: Deactivate User not successful ");

}
}
}	 

