package manager;

public interface HelperBase extends AppManager{
    default void method(){
        driver.findElement(locator)
    }
}
