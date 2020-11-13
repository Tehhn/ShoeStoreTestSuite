import org.openqa.selenium.WebDriver;

public class ShouldNotAcceptNonNumberCharacterAsSize extends Test {
    ShouldNotAcceptNonNumberCharacterAsSize(WebDriver driver) {
        super(driver);
    }

    @Override
    public void run() {
        this.sendInput("name","Abc,40?,41");
    }
}
