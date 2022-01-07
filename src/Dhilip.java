import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dhilip {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\Desktop\\Aravind_Sekar\\AutomationPractice_Project\\Driver\\chromedriver_96.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		WebElement SignIn = driver.findElement(By.xpath("//a[@class='login']"));
		SignIn.click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("dhilipan9724@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("Yuvi@9724");
		WebElement Signbt = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		Signbt.click();
		Thread.sleep(2000);
		WebElement WomenClick = driver.findElement(By.xpath("//a[@title='Women']"));
	    Actions act = new Actions(driver);
	    act.moveToElement(WomenClick).build().perform();
	    Thread.sleep(2000);
	    WebElement CasualDress = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
	    act.click(CasualDress).build().perform();
	    Thread.sleep(2000);
	    WebElement Quickview = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
	    //act.moveToElement(Quickview).build().perform();
	    act.click(Quickview).build().perform();
        Thread.sleep(2000);
	    WebElement Addtocard = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		act.click(Addtocard).build().perform();
		Thread.sleep(2000);
		WebElement ptc  = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		ptc.click();
		
		

		
		
		
		
		
	}
	

}
