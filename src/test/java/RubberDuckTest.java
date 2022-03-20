import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RubberDucksPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RubberDuckTest extends TestBase {

    @Test
    public void findRubberDucksTest() {
        RubberDucksPage.clickRubberDucksBottom();
        Assert.assertEquals(RubberDucksPage.getTitleRubberDucksSting(), RubberDucksPage.expectedTitleRD);
    }

    @Test
    public void findElementSubcategoryTest() {
        RubberDucksPage.findElementSubcategoryGetTitle();
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
        Assert.assertTrue(RubberDucksPage.greenDuckNewElementTest());
    }

}
