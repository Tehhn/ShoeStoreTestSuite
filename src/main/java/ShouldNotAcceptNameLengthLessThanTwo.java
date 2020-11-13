import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptNameLengthLessThanTwo extends Test {
    ShouldNotAcceptNameLengthLessThanTwo(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","P,40,41");
    }
}
