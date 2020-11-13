import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptNonIntegerAsSize extends Test {
    ShouldNotAcceptNonIntegerAsSize(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,49.5");
    }
}
