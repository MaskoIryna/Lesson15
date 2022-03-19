import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestBase {

    @Test
    public void getTitleHomePageTest() {
        Assert.assertEquals(HomePage.getTitle(driver), HomePage.expected);
    }


}
