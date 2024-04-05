package org.ibs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ValidationUtils {
    private WebDriver driver;

    public ValidationUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void isElementPresent(String name) {
        if (driver.findElements(By.id("name")).isEmpty()) {
            throw new AssertionError("Продукт"+ " " + name + " "+ "не добавлен");
        }
    }

    public void isCheckBoxExist(String name) {
        if (!driver.findElement(By.id("exotic")).isSelected()) {
            throw new AssertionError("Чек-бокс для"+ " " + name + " "+ "не выбран");
            }
        }

    public void isTypeExist(String type) {
            if (!driver.findElement(By.id("type")).isEnabled()){
                throw new AssertionError("Тип" + " " + type + " " + " не выбран");
            }
        }



    public void isNameAdded() {
            if (driver.findElements(By.id("name")).isEmpty()) {
                throw new AssertionError("Наименование не добавлено");
            }
        }
    }

