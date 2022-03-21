
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RubberDucksPage;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RubberDuckTest extends TestBase {

    @Test
    public void clickRubberDucksTest() {
        $(RubberDucksPage.bottomRubberDucks).click();
        $("title").shouldHave(ownText(RubberDucksPage.expectedTitleRD));
    }

    @Test
    public void findElementSubcategoryTest() {
        RubberDucksPage.findElementSubcategoryClick();
        $(RubberDucksPage.titleElementSubcategory).shouldHave(text(RubberDucksPage.expectedSubcategory));
    }

    @Test
    public void clickNameAndSortTest() {
        RubberDucksPage.clickRubberDucksBottom();
        List<String> elements = $$(RubberDucksPage.locatorElementRD_Name).texts();
        Collections.sort(elements);
        $(RubberDucksPage.elementRD_NameClick).click();
        assert $$(RubberDucksPage.locatorElementRD_Name).texts().equals(elements);
    }
    @Test
    public void findElementSaleRubberDucksTest() {
        String expectedString = RubberDucksPage.getAccessibility(RubberDucksPage.locatorYellowDuckStreeng);
        boolean result = expectedString.toLowerCase().contains("Yellow Duck".toLowerCase()) &&
                expectedString.toLowerCase().contains("SALE".toLowerCase());
        Assert.assertTrue(result,"Accessibility not contain sale & Yellow Duck");
    }

    @Test
    public void clickPriceAndSortRubberDucksPageTest() {
        Assert.assertTrue(RubberDucksPage.clickPriceAndSortRubberDucksPage(),"Price not sort");

    }
    @Test
    public void greenDuckIsNewElementTest() {
        RubberDucksPage.greenDuckNewElementTest();
        String expectedString = RubberDucksPage.greenDuckNewElementTest();
        boolean result = expectedString.toLowerCase().contains("Green Duck".toLowerCase()) &&
                expectedString.toLowerCase().contains("NEW".toLowerCase());
        Assert.assertTrue(result,"Accessibility not contain new & Green Duck");
    }

}
