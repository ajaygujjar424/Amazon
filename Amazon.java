package amazon;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(1500);
		//Search: "Wrist Watches"
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//Scrolldown Action
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(0,1000)");*/
		//Thread.sleep(2000);
		//Display: "Analogue"
		driver.findElement(By.xpath("//span[.='Analogue']")).click();
		Thread.sleep(2000);
	    //Brands Material: "Leather"
	    driver.findElement(By.xpath("//span[.='Leather']")).click();
	    Thread.sleep(2000);
	    //Brand: "Titan"
	    driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Titan']")).click();
	    Thread.sleep(2000);
	    //Discount: "25% Off or more"
	    driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
	    Thread.sleep(2000);
	    //Get the Fifth Element from the search
	    driver.findElement(By.xpath("//img[@alt=\"Titan Neo Analog Blue Dial Men's Watch - NN1733KL03/NP1733KL03\"]")).click();
	    Thread.sleep(2000);
	    driver.quit();
	    
	    

	}

}
