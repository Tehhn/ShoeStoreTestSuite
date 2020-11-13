import org.openqa.selenium.WebDriver;

public class ShouldAcceptNameLengthFromTwoToTen extends Test {
    ShouldAcceptNameLengthFromTwoToTen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,40,41");
    }
}
