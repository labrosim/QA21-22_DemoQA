package manager;

import org.openqa.selenium.By;

public interface HelperStudent extends HelperBase{
    By buttonElements = By.xpath("//div[@class='card mt-4 top-card']");
    By buttonForms = By.xpath("//div[text()='Forms']");
    By buttonPracticeForms = By.xpath("//span[text()='Practice Form']");

    default void selectPracticeForm(){
        clickBase(buttonElements);
        pause(5);
        clickBase(buttonForms);
        clickBase(buttonPracticeForms);
    }
}