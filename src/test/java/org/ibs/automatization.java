package org.ibs;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/* @author Dubinina Diana */

    public class automatization {


       WebDriver driver = new ChromeDriver();

        @Test
        public  void test() {

            System.setProperty("webdriver.chromedriver.driver", "src/test/resources/chromedriver.exe");
            driver.manage().window().setSize(new Dimension(1552, 832));
            driver.get("http://localhost:8080");

                navigateToProductPage();
                addProduct("Огурец");
                saveProduct("Огурец");
                addProduct("Вишня");
                selectType("Фрукт");
                saveProduct("Вишня");
                addProduct("Корнишон");
                checkExotic();
                saveProduct("Корнишон");
                addProduct("Манго");
                selectType("Фрукт");
                checkExotic();
                saveProduct("Манго");
                resetDatabase();


            }
        private void navigateToProductPage() {

            driver.findElement(By.id("navbarDropdown")).click();
            driver.findElement(By.linkText("Товары")).click();
        }


            private void addProduct(String name) {

                driver.findElement(By.cssSelector(".btn-grou > .btn")).click();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                driver.findElement(By.id("name")).click();
                driver.findElement(By.id("name")).sendKeys(name);

            }
            private void saveProduct (String name) {
                driver.findElement(By.id("save")).click();
                driver.navigate().refresh();
            }

            private void selectType(String type) {
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                WebElement dropdown = driver.findElement(By.id("type"));
                dropdown.findElement(By.xpath("//option[. = 'Фрукт']")).click();
            }


            private void checkExotic() {

                driver.findElement(By.id("exotic")).click();

            }

            private void resetDatabase() {

                driver.findElement(By.id("navbarDropdown")).click();
                driver.findElement(By.id("reset")).click();
                driver.close();
            }
        }

