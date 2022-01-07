import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regestration {
	

	
		public static void main(String[] args){
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\Desktop\\Aravind_Sekar\\MiniProject_AutomationPractise\\Driver\\chromedriver_96.exe");		
			WebDriver driver=new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
	
		
			WebElement Sign_in = driver.findElement(By.xpath("//a[@class='login']"));
			Sign_in.click();
          WebElement email_id1 = driver.findElement(By.xpath("//input[@id='email_create']"));
         	email_id1.sendKeys("Aravind@gmail.com");
WebElement but_ton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		but_ton.click();
	
		//WebElement find1 = driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
		//find1.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@data-validate='isName']"));
		firstname.sendKeys("Aravind");
		
			
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
