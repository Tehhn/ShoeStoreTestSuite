import org.openqa.selenium.WebDriver;

public class ShouldAcceptWordAsName extends Test {
    ShouldAcceptWordAsName(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,40,41");
    }
}
