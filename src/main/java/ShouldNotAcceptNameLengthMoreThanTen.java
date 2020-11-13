import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptNameLengthMoreThanTen extends Test {
    ShouldNotAcceptNameLengthMoreThanTen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Abcdefghijk,40,41");
    }
}
