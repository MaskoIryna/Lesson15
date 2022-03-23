package pages;
import org.openqa.selenium.By;
import org.testng.log4testng.Logger;

import static com.codeborne.selenide.Selenide.$;

public class DeliveryInformationPage {
    protected static Logger logger = Logger.getLogger(TestBase.class);

    private static final By bottomDeliveryInformation = By.linkText("Delivery Information");
    public static final By titleDeliveryInformation = By.cssSelector("#box-information-links>.title");
    public static String expectedTitle = "Information";


    public static void clickDeliveryInformationBottom() {
        $(bottomDeliveryInformation).click();
        logger.info(String.format("Name:  %s  Click: %s "));

    }


}




