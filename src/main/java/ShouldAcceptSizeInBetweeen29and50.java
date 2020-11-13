import org.openqa.selenium.WebDriver;

public class ShouldAcceptSizeInBetweeen29and50 extends Test {
    ShouldAcceptSizeInBetweeen29and50(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,30,40,41,49");
    }
}
