

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\Desktop\\Aravind_Sekar\\AutomationPractice_Project\\Driver\\chromedriver_96.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
			login.click();
			
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Rithan@gmail.com");
		
		WebElement passwrd = driver.findElement(By.xpath("//input[@id='passwd']"));
		passwrd.sendKeys("Arav@123");
		
		WebElement buton = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		buton.click();
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(women).build().perform();
		WebElement t_shirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		ac.moveToElement(t_shirt).build().perform();
		ac.click().build().perform();
		
		WebElement atc = driver.findElement(By.xpath("//span[@class='available-now']"));
		ac.moveToElement(atc).build().perform();
		ac.click().build().perform();
		
		
		WebElement qv = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
		qv.click();

		Thread.sleep(4000);

		WebElement ptc = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		ptc.click();

		Thread.sleep(5000);
		WebElement but1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		but1.click();

		
		
		Thread.sleep(5000);
		WebElement ptc1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		ptc1.click();
		
		WebElement checkbx = driver.findElement(By.id("cgv"));
		checkbx.click();
		
		Thread.sleep(5000);
		WebElement ship = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		ship.click();
		
		WebElement pay = driver.findElement(By.xpath("//a[@class='cheque']"));
		pay.click();
		
		WebElement order = driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]"));
		order.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
