import org.openqa.selenium.WebDriver;

public class ShouldAcceptBlankSpaces extends Test {
    ShouldAcceptBlankSpaces(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,  40, 41 ");
    }
}
