import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Mini_Project {
	
public static void main(String[] args) throws InterruptedException, AWTException {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\Desktop\\Aravind_Sekar\\MiniProject_AutomationPractise\\Driver\\chromedriver_96.exe");		
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	//driver.manage().window().maximize();
	
	
		
	WebElement button = driver.findElement(By.xpath("//a[@class='login']"));
	button.click();
		
	WebElement email_Id = driver.findElement(By.xpath("//input[@id='email']"));
	email_Id.sendKeys("Rithan@gmail.com");
		
	WebElement passwrd = driver.findElement(By.xpath("//input[@id='passwd']"));
	passwrd.sendKeys("Arav@123");
	
    WebElement but_on = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	but_on.click();

	WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
	Actions a=new Actions(driver);
	a.moveToElement(women).build().perform();
	WebElement bls = driver.findElement(By.xpath("//a[text()='Blouses']"));
	a.moveToElement(bls).build().perform();
	a.click().build().perform();
	WebElement Qv = driver.findElement(By.xpath("//a[@class='quick-view-mobile']"));
    a.moveToElement(Qv).build().perform();
	a.click().build().perform();
	
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart'][1]"));
	addtocart.click();
	Thread.sleep(4000);
	WebElement pco = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	pco.click();
	
	
	
	
	//act.moveToElement(catagery).build().perform();
	//act.contextClick(catagery).build().perform();
	//act.click().build().perform();
	
	//Robot r = new Robot();
	
	//r.keyPress(KeyEvent.VK_DOWN);
	//r.keyRelease(KeyEvent.VK_DOWN);
	//r.keyPress(KeyEvent.VK_DOWN);
	//r.keyRelease(KeyEvent.VK_DOWN);
	//r.keyPress(KeyEvent.VK_DOWN);
	//r.keyRelease(KeyEvent.VK_DOWN);
	//Thread.sleep(3000);
    //act.click();
	

   }
}
