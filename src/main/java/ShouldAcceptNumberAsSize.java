import org.openqa.selenium.WebDriver;

public class ShouldAcceptNumberAsSize extends Test {
    ShouldAcceptNumberAsSize(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,40");
    }
}
