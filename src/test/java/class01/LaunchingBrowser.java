package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        /**
         * task:
         * navigate to google.com
         */
        WebDriver driver= new ChromeDriver();
        // use .get(url) to navigate to the desired url
        driver.get("https://www.google.com");
        // maximize the window
        driver.manage().window().maximize();
        //get the current url
     String currentUrl = driver.getCurrentUrl();
     // print on the console
        System.out.println("The current url of the website is: "+currentUrl);

      String title  =driver.getTitle();
        System.out.println("the title of the page is :"+title);
        // add some wait time
        Thread.sleep(5000);
        // close the web browser
        driver.quit();

    }

}
