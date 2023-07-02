package seleniumCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		WebElement Uname = driver.findElement(By.id("username"));
		Uname.sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		
		driver.findElement(By.partialLinkText("/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NTT");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sudhan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("jeyakanthan");
		WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
				
		Select src = new Select(sourcedd);
		
		src.selectByVisibleText("Website");
		
		driver.findElement(By.xpath("//*[@id=\"ext-gen602\"]")).click();
		
		
		
		
	}
}
