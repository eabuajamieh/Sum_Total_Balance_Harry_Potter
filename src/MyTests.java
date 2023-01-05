
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTests {

	public WebDriver driver;

	@BeforeTest
	public void pre_my_test() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}

//	@Test(priority = 1, groups = "Customer")
//	public void login_as_customer()  {
//		
//
//	}
//
//	@Test(priority = 1, groups = "Manager")
//	public void login_as_manager() {
//
//	}

//	@Test(priority = 2, groups = "Manager")
//	public void add_customer() throws InterruptedException {
//		int userId = (int) (Math.random() * 100);
//		StringBuilder userName = new StringBuilder();
//		userName.append(userId);
//		String userIDASString = userName.toString();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
//				.sendKeys("Mr");
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
//				.sendKeys("user" + userIDASString);
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input	"))
//				.sendKeys(userIDASString);
//		;
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
//
//		String myTextinTheAlert = driver.switchTo().alert().getText();
//		System.out.println(myTextinTheAlert);
//		boolean textisfind=myTextinTheAlert.contains("sucessfully");  
//		SoftAssert mySoft=new SoftAssert();
//		
//		mySoft.assertEquals(textisfind, true,"Customer Added Successfully");
//
//		driver.switchTo().alert().accept();
//
//		driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("user" + userIDASString);
//		
//		List<WebElement> myUsers=driver.findElements(By.xpath("//tbody//tr"));
//		
//		int myActualUsers=myUsers.size();
//		
//		mySoft.assertEquals(myActualUsers,1);
//		mySoft.assertAll();
//
//	}

//	@Test()
//	public void Open_Account_for_Customer() throws InterruptedException {
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
//
//		WebElement myCustomer = driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));
//
//		Select mySelect = new Select(myCustomer);
//		mySelect.selectByVisibleText("Harry Potter");
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
//
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("1000");
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")).click();
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("500");
//
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
//
//		String myBalance = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
//
//		int newmyBalance = Integer.parseInt(myBalance);
//
//		SoftAssert mySoft = new SoftAssert();
//
//		mySoft.assertEquals(newmyBalance, 500);
//
//		mySoft.assertAll();
//
//	}

	@Test()
	public void Sum_Total_Balance_Harry_Potter() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();

		WebElement myCustomer = driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));

		Select mySelect = new Select(myCustomer);
		mySelect.selectByVisibleText("Harry Potter");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();

		WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"accountSelect\"]"));

		Select mySelect2 = new Select(myAccount);

		mySelect2.selectByIndex(0);

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("500");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();

		String myBalance = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();

		int newmyBalance = Integer.parseInt(myBalance);

		mySelect2.selectByIndex(1);

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("700");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();

		String myBalance2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();

		int newmyBalance2 = Integer.parseInt(myBalance2);

		mySelect2.selectByIndex(2);

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("200");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();

		String myBalance3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();

		int newmyBalance3 = Integer.parseInt(myBalance3);
		
		//double TotalBalanceofCustomer = Double.parseDouble(newmyBalance + newmyBalance2 * 1.19 + newmyBalance3 * 0.012);
		Double TotalBalanceofCustomer=(Double) (newmyBalance + newmyBalance2 * 1.19 + newmyBalance3 * 0.012);
		
		SoftAssert mySoft = new SoftAssert();

		mySoft.assertNotEquals(1335.4, (1335.4));

		mySoft.assertAll();

	}
}
