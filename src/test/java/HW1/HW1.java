package HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {


           /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
     fill out the form
    close the browser
     */
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Nataliya");
        driver.findElement(By.id("customer.lastName")).sendKeys("Batsyk");
        driver.findElement(By.id("customer.address.street")).sendKeys("Koshitsya");
        driver.findElement(By.id("customer.address.city")).sendKeys("Lviv");
        driver.findElement(By.id("customer.address.state")).sendKeys("Ukraine");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("26012");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("038096254589");
        driver.findElement(By.id("customer.ssn")).sendKeys("022185036");
        driver.findElement(By.id("customer.username")).sendKeys("nbatsyk");
        driver.findElement(By.id("customer.password")).sendKeys("256G584tMN09");
        driver.findElement(By.id("repeatedPassword")).sendKeys("256G584tMN09");
        driver.quit();
    }
}


