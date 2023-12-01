package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssLocators {
    WebDriver driver;

    @Test
    public void textBox(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement inputFullName = driver.findElement(By.cssSelector("input[id='userName']"));
        System.out.println("--> "  + inputFullName.getAttribute("placeholder"));

        WebElement currentAddress = driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        System.out.println("--> " + currentAddress.getTagName());

        WebElement address = driver.findElement(By.id("permanentAddress-label"));
        System.out.println("--> " + address.getText());

        driver.quit();

    }



}
