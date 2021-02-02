package wrapper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;


public class ProjectSpecificWrapper extends GenericWrapper {
	
	
	public String excelfile;

	//@Parameters ({"url", "uname", "pwd"})
	
	@BeforeMethod
	
	public void login() {
		invokeApp("http://leaftaps.com/opentaps");

	}


	@AfterMethod
	
	public void exWait() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void closeBrowser() {
		driver.close();
	}

	@DataProvider
	
	public String[][] getData() throws IOException {
	
	ReadExcel r1 = new ReadExcel();
		
		return r1.readExcel(excelfile);
		
	}
	
}

