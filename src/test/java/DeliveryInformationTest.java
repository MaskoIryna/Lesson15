
import org.testng.annotations.Test;
import pages.DeliveryInformationPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class DeliveryInformationTest extends TestBase{

    @Test
    public void findDeliveryInformationTest() {
        DeliveryInformationPage.clickDeliveryInformationBottom();
        logger.info("click Delivery Information Bottom ");
        $(DeliveryInformationPage.titleDeliveryInformation).shouldHave(text(DeliveryInformationPage.expectedTitle));
        logger.info((String.format("find element DeliveryInformation title is %s",DeliveryInformationPage.expectedTitle)));

    }
}