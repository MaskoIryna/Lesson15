import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DeliveryInformationPage;

public class DeliveryInformationTest extends TestBase {

    @Test
    public void findDeliveryInformationTest() {
        DeliveryInformationPage.clickDeliveryInformationBottom(driver);
        Assert.assertEquals(DeliveryInformationPage.getDeliveryInformationTitle(driver), DeliveryInformationPage.expectedTitle);
    }
}