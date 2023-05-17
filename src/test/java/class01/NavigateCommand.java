package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        // go to google.com
        driver.get("https://google.com");
        // slow down
        Thread.sleep(2000);
        // navigate to facebook.com
        driver.navigate().to("https://facebook.com");
        //slow down
        Thread.sleep(2000);
        // refresh the page
        driver.navigate().refresh();
        //go back to previous page
        driver.navigate().back();
        // slow down
        Thread.sleep(2000);
        // go forward
        driver.navigate().forward();
        // closing the browser
        driver.quit();
        // close the current tab
        driver.close();

    }
}
