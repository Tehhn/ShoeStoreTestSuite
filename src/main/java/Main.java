import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.indexeddb.model.Key;

public class Main {
    private static String driverPath = "C:\\Users\\Tehhn\\bin\\chromedriver.exe";

    public static void main(String[] args) {
        System.out.println("==============Running Test Suite=======================");

        new StoreTestSuite(configureDriver()).run();

        System.out.println("==============Test Suite Finished Running=======================");

    }

    public static WebDriver configureDriver() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }


}
