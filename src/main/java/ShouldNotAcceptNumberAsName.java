import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptNumberAsName extends Test {
    ShouldNotAcceptNumberAsName(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","132456,40,41");
    }
}
