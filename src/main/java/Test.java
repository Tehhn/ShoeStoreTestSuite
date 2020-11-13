import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public abstract class Test {
    private WebDriver driver;

    protected void sendInput(String name,String input) {
        driver.findElement(By.name(name)).sendKeys(input + Keys.ENTER);
    }

    Test(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void run();
}
