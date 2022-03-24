import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
        protected Logger logger = Logger.getLogger(TestBase.class);

    @BeforeTest
    public void setup() {
        Configuration.assertionMode = AssertionMode.STRICT;
        Configuration.baseUrl = "https://litecart.stqa.ru/en/";
        Configuration.browser = CHROME;
        Configuration.pageLoadTimeout = 5000;
        open(Configuration.baseUrl);
    }

    @AfterTest
    public void after() {
        logger.debug("close windows");
        closeWindow();
    }
}



