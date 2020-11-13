import org.openqa.selenium.WebDriver;

public class ShouldAcceptInputSeparatedWithCommas extends Test {
    ShouldAcceptInputSeparatedWithCommas(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,40,41,42");
    }
}
