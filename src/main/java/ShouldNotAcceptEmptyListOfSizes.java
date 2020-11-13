import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptEmptyListOfSizes extends Test {
    ShouldNotAcceptEmptyListOfSizes(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","aBc, ");
    }
}
