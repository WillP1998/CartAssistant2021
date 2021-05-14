//user interface coming soon

package supremeAutoBuy;

import java.awt.GridLayout;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
//
//public class GUI {
//	public GUI() {
//	JFrame frame = new JFrame("Cart Assistant");
//	JPanel panel = new JPanel();
//	panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
//	panel.setLayout(new GridLayout(0, 1));
	
	
//}

public class AutoBuy {
	public static void main(String[] args) {
		//chromedriver setup
		System.setProperty("webdriver.chrome.driver", "/Users/williampano/Desktop/python/chromedriver");
		WebDriver driver = new ChromeDriver();

		
		//add to cart
		driver.get("https://www.supremenewyork.com/shop/all/accessories");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[14]/div/a/img")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"cart\"]/a[2]")).click();
		
		//fillout info
		driver.findElement(By.xpath("//*[@id=\"order_billing_name\"]")).sendKeys("Will Pano");
		driver.findElement(By.xpath("//*[@id=\"order_email\"]")).sendKeys("panowilliam.wp@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"order_tel\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"bo\"]")).sendKeys("9315 glen turret ct.");
		driver.findElement(By.xpath("//*[@id=\"order_billing_zip\"]")).sendKeys("77095");
		driver.findElement(By.xpath("//*[@id=\"order_billing_city\"]")).sendKeys("Houston");
		driver.findElement(By.xpath("//*[@id=\"rnsnckrn\"]")).sendKeys("1111222233334444");
		Select monthSelect = new Select(driver.findElement(By.xpath("//*[@id=\"credit_card_month\"]")));
		monthSelect.selectByIndex(0);
		Select yearSelect = new Select(driver.findElement(By.xpath("//*[@id=\"credit_card_year\"]")));
		yearSelect.selectByIndex(2);
		driver.findElement(By.xpath("//*[@id=\"orcer\"]")).sendKeys("552");
		driver.findElement(By.xpath("//*[@id=\"cart-cc\"]/fieldset/p/label/div/ins")).click();
		driver.findElement(By.xpath("//*[@id=\"pay\"]/input")).click();
		driver.findElement(By.xpath("")).sendKeys("");
		}

	private static By xpath(String string) {
		// TODO Auto-generated method stub
		return null;
	};

}
