import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptSizeLessThan29 extends Test {
    ShouldNotAcceptSizeLessThan29(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,28,30");
    }
}
