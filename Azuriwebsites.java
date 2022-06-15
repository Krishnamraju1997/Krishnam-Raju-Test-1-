import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Azuriwebsites {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Chrome driver\\Enew\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
		driver.findElement(By.id("name")).sendKeys("Manthina Krishnam Raju");
		driver.findElement(By.id("orgName")).sendKeys("Krishnam Raju");
		driver.findElement(By.id("singUpEmail")).sendKeys("krishnamrajum1997@gmail.com");
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/section/div/div[3]/div/section/div[1]/form/fieldset/div[4]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[3]/div/section/div[1]/form/fieldset/div[5]/button")).click();
		driver.close();
	}

}
