package tests;

import manager.HelperStudent;
import models.StudentDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StudentFormTests extends TestBase implements HelperStudent {
    @BeforeClass
    public void goToPracticeForm(){
        selectPracticeForm();
    }

    @Test
    public void registrationStudentPositiveTest(){
        StudentDTO student = new StudentDTO("Froda", "Begins", );

    }
}