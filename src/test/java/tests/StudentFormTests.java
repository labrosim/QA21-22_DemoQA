package tests;

import manager.HelperStudent;
import models.StudentDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StudentFormTests extends TestBase implements HelperStudent {
    @BeforeClass
    public void goToPracticeForm() {

        selectPracticeForm();
    }


    @Test
    public void registrationStudentPositiveTest() {
        StudentDTO student = new StudentDTO("Frodo", "Baggins", "frodobaggins@mail.com",
                "Male", "1234567890", "10 Sep 2020", "Maths,English", "Sports",
                "J.Washington street, 10", "NCR", "Delphi");
        fillStudentForm(student);
        clickButtonSubmit();
        Assert.assertTrue(isElementPresent_ThanksFor());

    }
    @Test
    public void registrationStudentPositiveTest_1() {
        StudentDTO student = new StudentDTO("Frodo1", "Baggins1", "frodobaggins@mail.com",
                "Male", "1234567890", "10 Sep 2020", "Maths,English", "Sports",
                "J.Washington street, 10", "NCR", "Delphi");
        fillStudentForm(student);
        clickButtonSubmit();
        Assert.assertTrue(isElementPresent_ThanksFor());

    }
    @Test
    public void registrationStudentNegativeTest_lastName_empty() {
        StudentDTO student = new StudentDTO("Frodo1", "", "frodobaggins@mail.com",
                "Male", "1234567890", "10 Sep 2020", "Maths,English", "Sports",
                "J.Washington street, 10", "NCR", "Delphi");
        fillStudentForm(student);
        clickButtonSubmit();
        Assert.assertTrue(isElementPresent_ThanksFor());

    }

    @AfterMethod
    public void afterMethod(){
        pause(3);
        clickButtonCloseModal();
    }
}