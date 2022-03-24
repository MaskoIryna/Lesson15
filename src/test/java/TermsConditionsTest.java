import org.testng.annotations.Test;
import pages.DeliveryInformationPage;
import pages.TermsConditionsPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TermsConditionsTest extends TestBase {
    @Test
    public void findTermsConditionsTest() {

        TermsConditionsPage.clickTermsConditionsBottom();
        $(TermsConditionsPage.pageContain).shouldHave(text(TermsConditionsPage.expectedPageContain));
        logger.info((String.format("element TermsConditions title is %s", TermsConditionsPage.expectedPageContain)));



    }


}
