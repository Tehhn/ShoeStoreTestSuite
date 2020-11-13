import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptNameNotBeforeListOfSizes extends Test {
    ShouldNotAcceptNameNotBeforeListOfSizes(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","40,41,42, Nike");
    }
}
