package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import java.util.ArrayList;
import java.util.Collections;
import static com.codeborne.selenide.Selenide.$;



public class RubberDucksPage {
    public static By bottomRubberDucks = By.linkText("Rubber Ducks");
    final static By elementSubcategory = By.linkText("Subcategory");
    public static By elementSale = By.xpath("//img[@alt='Yellow Duck']/following-sibling::div");
    public static By locatorElementRD_Name = By.xpath("//div[@class='name']");
    final static By locatorElementPrice = By.xpath("//span[@class='price']");
    public static By locatorGreenDuck = By.xpath("//a[@class='link'][@title='Green DucK']");
    public static By locatorYellowDuck = By.xpath("//a[@class='link'][@title='Yellow Duck']");
    public static String locatorYellowDuckStreeng = "//a[@class='link'][@title='Yellow Duck']";

    final static By locatorTextPrice = By.xpath("//*[contains(text(),'Price')]");
    public static By elementRD_NameClick = By.xpath("//*[contains(text(),'Name')]");
    public static By titleElementSubcategory = By.xpath("//h1[@class='title']");
    public static String expectedTitleRD = "Rubber Ducks | My Store1";
    public static String expectedSubcategory = "Subcategory";

    public static void clickRubberDucksBottom() {
        $(bottomRubberDucks).click();
    }

    public static void findElementSubcategoryClick() {
        actions().moveToElement($(bottomRubberDucks)).perform();
        actions().moveToElement($(elementSubcategory)).click().perform();
    }

    public static boolean clickPriceAndSortRubberDucksPage() {
        $(bottomRubberDucks).click();
        ArrayList<Float> actual = new ArrayList<>();
        ArrayList<Float> expected = new ArrayList<>();
//List before click "Price"
        ElementsCollection priceBeforeClick = $$(locatorElementPrice);
        for (SelenideElement counter : priceBeforeClick) {
            String priceString = counter.getText();
            float priceFloat = Float.parseFloat(priceString.substring(0, priceString.length()-2));
            expected.add(priceFloat);
        }
        Collections.sort(expected);
//List after click "Price"
        $(locatorTextPrice).click();
        ElementsCollection priceAfterClick = $$(locatorElementPrice);
        for (SelenideElement counter : priceAfterClick) {
            String priceString = counter.getText();
            float priceFloat = Float.parseFloat(priceString.substring(0, priceString.length()-2));
            actual.add(priceFloat);
        }
        return actual.equals(expected);
    }

    public static String greenDuckNewElementTest() {
        findElementSubcategoryClick();
        return $(locatorGreenDuck).getAccessibleName() ;
    }
    public static String getAccessibility(String locatorYellowDuckStreeng) {
        findElementSubcategoryClick();
//        String expectedString = $(By.xpath(locatorYellowDuckStreeng)).getAccessibleName();
        return $(By.xpath(locatorYellowDuckStreeng)).getAccessibleName();
    }
}
