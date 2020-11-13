import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class StoreTestSuite {
    private WebDriver driver;
    private String storeUrl = "Store Url";

    StoreTestSuite(WebDriver driver) {
        this.driver = driver;
    }

    public void run() {
        driver.get(storeUrl);
        List<Test> tests = new ArrayList<>();
        tests.add(new ShouldAcceptWordAsName(driver));
        tests.add(new ShouldNotAcceptNumberAsName(driver));
        tests.add(new ShouldNotAcceptNameLengthLessThanTwo(driver));
        tests.add(new ShouldNotAcceptNameLengthMoreThanTen(driver));
        tests.add(new ShouldAcceptNameLengthFromTwoToTen(driver));
        tests.add(new ShouldNotAcceptSizeLessThan29(driver));
        tests.add(new ShouldNotAcceptSizeBiggerThan50(driver));
        tests.add(new ShouldAcceptSizeInBetweeen29and50(driver));
        tests.add(new ShouldAcceptNumberAsSize(driver));
        tests.add(new ShouldAcceptIntegerAsSize(driver));
        tests.add(new ShouldNotAcceptNonIntegerAsSize(driver));
        tests.add(new ShouldNotAcceptNonNumberCharacterAsSize(driver));
        tests.add(new ShouldAcceptSizesInAscendingOrder(driver));
        tests.add(new ShouldNotAcceptSizesInNotAscendingOrder(driver));
        tests.add(new ShouldNotAcceptEmptyListOfSizes(driver));
        tests.add(new ShouldAcceptListOfSizesLength1to5(driver));
        tests.add(new ShouldNotAcceptListOfSizesLengthMoreThan5(driver));
        tests.add(new ShouldAcceptNameBeforeListOfSizes(driver));
        tests.add(new ShouldNotAcceptNameNotBeforeListOfSizes(driver));
        tests.add(new ShouldAcceptInputSeparatedWithCommas(driver));
        tests.add(new ShouldNotAcceptInputWithoutCommas(driver));
        tests.add(new ShouldAcceptBlankSpaces(driver));
        tests.add(new ShouldAcceptNoBlankSpaces(driver));



        for (int i=1;i<=tests.size();i++) {
            Test test = tests.get(i);
            System.out.println("Running: " + i + ". "+ test.getClass().getName());
            test.run();
            try {
                Thread.sleep(500);
                driver.navigate().back();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }
}