import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptSizeBiggerThan50 extends Test {
    ShouldNotAcceptSizeBiggerThan50(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,49,51");
    }
}
