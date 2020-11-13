import org.openqa.selenium.WebDriver;

public class ShouldAcceptNameBeforeListOfSizes extends Test {
    ShouldAcceptNameBeforeListOfSizes(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,40,41");
    }
}
