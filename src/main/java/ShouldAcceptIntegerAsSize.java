import org.openqa.selenium.WebDriver;

public class ShouldAcceptIntegerAsSize extends Test {
    ShouldAcceptIntegerAsSize(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,49");
    }
}
