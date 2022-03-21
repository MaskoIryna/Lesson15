
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RubberDucksPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class RubberDuckTest extends TestBase {

    @Test
    public void clickRubberDucksTest() {
        $(RubberDucksPage.bottomRubberDucks).click();
        $("title").shouldHave(ownText(RubberDucksPage.expectedTitleRD));
    }

    @Test
    public void findElementSubcategoryTest() {
        RubberDucksPage.findElementSubcategory();
        $(RubberDucksPage.titleElementSubcategory).shouldHave(text(RubberDucksPage.expectedSubcategory));
    }

    @Test
    public void clickNameAndSortTest() {
        RubberDucksPage.clickRubberDucksBottom();
        Assert.assertTrue(RubberDucksPage.clickNameAndSort());
    }
    @Test
    public void findElementSaleRubberDucksTest() {
        RubberDucksPage.findElementSaleRubberDucks();
        $(RubberDucksPage.elementSale).shouldHave(text("SALE"));
    }

    @Test
    public void clickPriceAndSortRubberDucksPageTest() {
        Assert.assertTrue(RubberDucksPage.clickPriceAndSortRubberDucksPage());

    }
    @Test
    public void greenDuckNewElementTest() {

//        String expectedString = $(RubberDucksPage.locatorGreenDuck).getAccessibleName();
        Assert.assertTrue(RubberDucksPage.greenDuckNewElementTest());
    }

}
