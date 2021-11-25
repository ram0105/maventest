package com.vapasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Scanner;
@Test
public class ParallelTest extends BaseTest {
    public WebDriver driver;

    @BeforeClass
    void setDriverPaths() {
        System.setProperty("webdriver.chrome.driver", "/Users/ramprasanth/Documents/Code/drivers/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/Users/ramprasanth/Documents/Code/drivers/geckodriver");
    }

    @Test
    void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://spree-vapasi-prod.herokuapp.com/signup");
        // WebElement element = driver.findElement(By.class("nav-link text-white")).click();

        driver.findElement(By.id("spree_user_email")).sendKeys("test12312999@test.com");
        driver.findElement(By.name("spree_user[password]")).sendKeys("123456");
        driver.findElement(By.cssSelector("[name = \"spree_user[password_confirmation]\"]")).sendKeys("123456");
        driver.findElement(By.cssSelector("[data-disable-with = \"Create\"]")).click();
        
    }

    @Test
    void test2() {
        Reporter.log("Test 2: " + Thread.currentThread().getId());
        getDriver().get("https://www.google.com");
    }

    @Test
    void test3() {
        Reporter.log("Test 3: " + Thread.currentThread().getId());
        getDriver().get("https:/www.google.com");
    }

    @Test
    void test4() {
        Reporter.log("Test 4: " + Thread.currentThread().getId());
        getDriver().get("https://www.google.com");
    }

    public static void main(String[] args) {
        System.out.println("enter any four no");
        Scanner sc = new Scanner(System.in);
        int a = getIntFromString(sc.next());
        int b = getIntFromString(sc.next());
        int c = getIntFromString(sc.next());
        int d = getIntFromString(sc.next());
        thisIsChanged(a,b,c,d);

    }

    private static void thisIsChanged(int a, int b, int c, int d) {
        if (a < b && a < c && a < d) {
            System.out.println("Smallest number is: " + a);
        } else if (b < a && b < c && b < d) {
            System.out.println("Smallest number is: " + b);
        } else if (c < a && c < b && c < d) {
            System.out.println("Smallest number is: " + c);
        } else if (d < a && d < b && d < c) {
            System.out.println("Smallest number is: " + d);
        }
    }

    private static int getIntFromString(String no) {
        try {
            int no1= Integer.parseInt(no);
            return no1;
        }catch (Exception e){
            System.out.println(no+" is not a valid input");
            System.exit(1);
            return -1;
        }
    }

}
