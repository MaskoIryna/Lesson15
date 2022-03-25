import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class HomePageTest extends TestBase{

    @Test
    public void getTitleHomePageTest() {
        Assert.assertEquals(title(),"Online Store | My Store1");
        logger.info(String.format("%s",title()));
    }
}
