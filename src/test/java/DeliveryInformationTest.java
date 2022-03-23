import org.testng.annotations.Test;
import pages.DeliveryInformationPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DeliveryInformationTest extends TestBase{

    @Test
    public void findDeliveryInformationTest() {
        DeliveryInformationPage.clickDeliveryInformationBottom();
        $(DeliveryInformationPage.titleDeliveryInformation).shouldHave(text(DeliveryInformationPage.expectedTitle));
        logger.info(String.format("ExpName: %s \n ActualName: %s",DeliveryInformationPage.expectedTitle));

    }
}