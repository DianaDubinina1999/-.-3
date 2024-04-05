package org.ibs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ValidationUtils {
    private WebDriver driver;

    public ValidationUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void isElementPresent(String name) {
        if (!driver.findElements(By.id("name")).isEmpty()) {
            System.out.println("Продукт" + " " + name + "  добавлен на страницу");
        } else {
            System.out.println("Продукт" + " " + name + " не добавлен на страницу");
        }
    }

    public void isCheckBoxExist(String name) {
        if (driver.findElement(By.id("exotic")).isSelected()) {
            System.out.println("Чек-бокс для" + " " + name + " " + "выбран");
        } else {
            System.out.println("Чек-бокс для" + " " + name + " " + "не выбран");
        }
    }

    public void isTypeExist(String type) {
        if (driver.findElement(By.id("type")).isEnabled()) {
            System.out.println("Тип" + " " + type + " " + "выбран");
        } else {
            System.out.println("Тип" + " " + type + " " + " не выбран");
        }
    }

    public void isNameAdded(String name) {
        if (!driver.findElements(By.id("name")).isEmpty()) {
            System.out.println("Наименование" + " " + name + " добавлено");
        } else {
            System.out.println("Наименование" + " " + name + " добавлено");
        }
    }
}
