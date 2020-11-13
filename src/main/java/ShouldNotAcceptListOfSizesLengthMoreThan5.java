import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptListOfSizesLengthMoreThan5 extends Test {
    ShouldNotAcceptListOfSizesLengthMoreThan5(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,40,41,42,43,44,45");
    }
}
