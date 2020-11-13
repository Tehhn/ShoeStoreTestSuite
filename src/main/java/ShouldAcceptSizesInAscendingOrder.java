import org.openqa.selenium.WebDriver;

public class ShouldAcceptSizesInAscendingOrder extends Test {
    ShouldAcceptSizesInAscendingOrder(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,40,41");
    }
}
