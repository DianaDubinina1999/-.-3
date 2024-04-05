package org.ibs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class ValidationUtils {
    private WebDriver driver;

    public ValidationUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void isProductExist(String name) {
        if (driver.findElements(By.xpath("//*[contains(text(),'" + name + "')]")).isEmpty()) {
            throw new AssertionError("Продукт" + " " + name + " " + "не добавлен");
        }
    }

    public void isCheckBoxExist(String name) {
        if (!driver.findElement(By.id("exotic")).isSelected()) {
            throw new AssertionError("Чек-бокс для" + " " + name + " " + "не выбран");
        }
    }


    public void isTypeExist(String type) {
        if (!driver.findElement(By.xpath("//option[. = '" + type + "']")).isSelected()) {
            throw new AssertionError("Тип" + " " + type + " " + " не выбран");
        }
    }


    public void isNameAdded(String name) {
        if (!driver.findElement(By.id("name")).isDisplayed()) {
            throw new AssertionError("Наименование" + " " + name + " " + "не добавлено");

        }
    }
}
