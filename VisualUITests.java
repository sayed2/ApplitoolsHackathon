import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class VisualUITests {
    private static BatchInfo batch;
    public WebDriver driver;

    @BeforeSuite
    public static void setBatch(){
        batch = new BatchInfo("Hackathon");
    }
    @BeforeMethod
    public void driverStarter(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdou\\chromedriver.exe");
        driver = new ChromeDriver();
        eyes.setApiKey(System.getenv("APPLITOOLS_API_KEY"));
        eyes.setBatch(batch);
    }

     Eyes eyes = new Eyes();

    @Parameters({"LoginURLV2","GifURLV2"})
    @Test
    public void visualUITest(String LoginURLV2, String GifURLV2) {
        // Login Page UI Elements Test
        eyes.setBatch(batch);
        eyes.setMatchLevel(MatchLevel.STRICT);
        eyes.setForceFullPageScreenshot(true);
        eyes.open(driver, "HackathonAPP" , "Login Page UI Elements Test", new RectangleSize(1920, 1080));
        driver.get(LoginURLV2);
        eyes.checkWindow("Login Page");
        eyes.close(false);

        // Data-Driven Test
        eyes.open(driver, "HackathonAPP" , "No Username No Password Test", new RectangleSize(1920, 1080));
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        eyes.checkWindow("No Username/Password Validation message");
        eyes.close(false);

        eyes.open(driver, "HackathonAPP" , "No Password Test", new RectangleSize(1920, 1080));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("TesterUsername");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        eyes.checkWindow("No Password - Validation message");
        eyes.close(false);

        eyes.open(driver, "HackathonAPP" , "No Username Test", new RectangleSize(1920, 1080));
        driver.findElement(By.xpath("//input[@id='username']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TesterPassword");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        eyes.checkWindow("No Username - Validation message");
        eyes.close(false);

        eyes.open(driver, "HackathonAPP" , "Enter Both Username & Password - Login Test", new RectangleSize(1920, 1080));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("TesterUsername");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        eyes.checkWindow("Both Username/Password - Login Test");
        eyes.close(false);

        // Table Sort Test
        eyes.open(driver, "HackathonAPP" , "Ascending Order & Intact Rows Test", new RectangleSize(1920, 1080));
        driver.findElement(By.xpath("//th[@id='amount']")).click();
        eyes.checkWindow("Ascending Order & Intact Rows");
        eyes.close(false);

        // Canvas Chart Test
        eyes.open(driver, "HackathonAPP" , "Canvas Chart Test 2017/2018", new RectangleSize(1920, 1080));
        driver.findElement(By.xpath("//a[@id='showExpensesChart']")).click();
        eyes.checkWindow("Canvas Chart Test - Previous 2 Years");
        eyes.close(false);

        eyes.open(driver, "HackathonAPP" , "Canvas Chart Test - Adding 2019", new RectangleSize(1920, 1080));
        driver.findElement(By.xpath("//button[@id='addDataset']")).click();
        eyes.checkWindow("Canvas Chart Test - Last 3 Years");
        eyes.close(false);

        // Dynamic Content Test
        eyes.setMatchLevel(MatchLevel.LAYOUT);
        eyes.open(driver, "HackathonAPP" , "Dynamic Content Test - Ads", new RectangleSize(1920, 1080));
        driver.get(GifURLV2);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("TesterUsername");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TesterPassword");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        eyes.checkWindow("Dynamic Content - Ads");
        eyes.close(true);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
