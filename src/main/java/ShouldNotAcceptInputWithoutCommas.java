import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptInputWithoutCommas extends Test {
    ShouldNotAcceptInputWithoutCommas(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike45,46,47");
    }
}
