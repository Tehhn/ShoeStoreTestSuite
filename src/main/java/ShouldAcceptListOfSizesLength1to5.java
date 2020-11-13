import org.openqa.selenium.WebDriver;

public class ShouldAcceptListOfSizesLength1to5 extends Test {
    ShouldAcceptListOfSizesLength1to5(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Nike,49,51");
    }
}
