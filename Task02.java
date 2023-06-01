package SeleniumHW.Class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Task02 extends CommonMethods {
    public static void main(String[] args) {


        String URL = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser= "chrome";
        openBrowserAndLaunchApplication(URL,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement button1= driver.findElement(By.xpath("//button[text()='Get New User']"));
        button1.click();

        WebElement firstName= driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(firstName.getText());


    }
}
