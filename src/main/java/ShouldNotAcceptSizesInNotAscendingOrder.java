import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptSizesInNotAscendingOrder extends Test {
    ShouldNotAcceptSizesInNotAscendingOrder(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,40,39,41");
    }
}
