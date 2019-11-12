package traditionalTests;

import com.google.common.collect.Ordering;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.Vector;

public class LoginPageUIElementsTest {

    public WebDriver driver;

    @BeforeMethod
    public void driverStarter(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdou\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    // -----------------------------------------------------------------------------------------------------------------
    // Login Page UI Elements Test
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------------------
    // Top Logo
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void loginPageLogoExistTest() {

        driver.get("https://demo.applitools.com/hackathonV2.html");

        Boolean isPresent = driver.findElement(By.xpath("//div[@class='logo-w']//a//img")).isDisplayed();
        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("Logo exists");
        }
    }

    @Test
    public void logoPositionTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        Point location1 = driver.findElement(By.xpath("//div[@class='logo-w']//a//img")).getLocation();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Point location2 = driver.findElement(By.xpath("//div[@class='logo-w']//a//img")).getLocation();
        Assert.assertEquals(location2, location1);
    }

    @Test
    public void logoSizeTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        Dimension size1 = driver.findElement(By.xpath("//div[@class='logo-w']//a//img")).getSize();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Dimension size2 = driver.findElement(By.xpath("//div[@class='logo-w']//a//img")).getSize();
        Assert.assertEquals(size2, size1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    //  Auth Header
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void authHeaderExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");

        Boolean isPresent = driver.findElement(By.xpath("//h4[@class='auth-header']")).isDisplayed();

        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("Auth header exist");
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    // "Login Form" text
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void loginFormTextVerification() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Assert.assertEquals((driver.findElement(By.xpath("//h4[@class='auth-header']")).getText()), "Login Form");
    }

    @Test
    public void loginFormTextPositionTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        Point location1 = driver.findElement(By.xpath("//h4[@class='auth-header']")).getLocation();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Point location2 = driver.findElement(By.xpath("//h4[@class='auth-header']")).getLocation();
        Assert.assertEquals(location2, location1);
    }

    @Test
    public void loginFormTextFontSizeTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontSize1 = driver.findElement(By.xpath("//h4[@class='auth-header']")).getCssValue("font-size");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontSize2 = driver.findElement(By.xpath("//h4[@class='auth-header']")).getCssValue("font-size");
        Assert.assertEquals(fontSize2, fontSize1);
    }

    @Test
    public void loginFormTextFontWeightTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontWeight1 = driver.findElement(By.xpath("//h4[@class='auth-header']")).getCssValue("font-weight");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontWeight2 = driver.findElement(By.xpath("//h4[@class='auth-header']")).getCssValue("font-weight");
        Assert.assertEquals(fontWeight2, fontWeight1);
    }

    @Test
    public void loginFormTextColorTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String color1 = driver.findElement(By.xpath("//h4[@class='auth-header']")).getCssValue("color");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String color2 = driver.findElement(By.xpath("//h4[@class='auth-header']")).getCssValue("color");
        Assert.assertEquals(color2, color1);
    }

    @Test
    public void loginFormTextFontFamilyTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontFamily1 = driver.findElement(By.xpath("//h4[@class='auth-header']")).getCssValue("font-family");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontFamily2 = driver.findElement(By.xpath("//h4[@class='auth-header']")).getCssValue("font-family");
        Assert.assertEquals(fontFamily2, fontFamily1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Auth Header After
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void authHeaderAfterPositionTest() {
        // Checking the correct position of auth-header::after is not possible because there is no matching
        // selector or style
    }

    @Test
    public void authHeaderAfterWidthTest() {
        // Checking the width of auth-header::after is not possible because there is no matching
        // selector or style
    }

    @Test
    public void authHeaderAfterHeightTest() {
        // Checking the height of auth-header::after is not possible because there is no matching
        // selector or style
    }

    @Test
    public void authHeaderAfterColorTest() {
        // Checking the color of auth-header::after is not possible because there is no matching
        // selector or style
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Username Label
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void usernameLabelExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Boolean isPresent = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).isDisplayed();

        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("usernameLabelExist exist");
        }
    }

    @Test
    public void usernameLabelTextVerification() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String textValue1 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getText();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String textValue2 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getText();
        Assert.assertEquals(textValue2, textValue1);
    }

    @Test
    public void usernameLabelPositionTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        Point location1 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getLocation();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Point location2 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getLocation();
        Assert.assertEquals(location2, location1);
    }

    @Test
    public void usernameLabelFontFamilyTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontFamily1 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getCssValue("font-family");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontFamily2 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getCssValue("font-family");
        Assert.assertEquals(fontFamily2, fontFamily1);
    }

    @Test
    public void usernameLabelextFontSizeTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontSize1 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getCssValue("font-size");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontSize2 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getCssValue("font-size");
        Assert.assertEquals(fontSize2, fontSize1);
    }

    @Test
    public void usernameLabelTextFontWeightTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontWeight1 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getCssValue("font-weight");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontWeight2 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getCssValue("font-weight");
        Assert.assertEquals(fontWeight2, fontWeight1);
    }

    @Test
    public void usernameLabelTextColorTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String color1 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getCssValue("color");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String color2 = driver.findElement(By.xpath("//label[contains(text(),'Username')]")).getCssValue("color");
        Assert.assertEquals(color2, color1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Password Label
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void passwordLabelExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Boolean isPresent = driver.findElement(By.xpath("//label[contains(text(),'Pwd')]")).isDisplayed();

        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("passwordLabelExist exist");
        }
    }

    @Test
    public void passwordLabelTextVerification() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String textValue1 = driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getText();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String textValue2 = driver.findElement(By.xpath("//label[contains(text(),'Pwd')]")).getText();
        Assert.assertEquals(textValue2, textValue1);
    }

    @Test
    public void passwordLabelPositionTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        Point location1 = driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getLocation();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Point location2 = driver.findElement(By.xpath("//label[contains(text(),'Pwd')]")).getLocation();
        Assert.assertEquals(location2, location1);
    }

    @Test
    public void passwordLabelFontFamilyTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontFamily1 = driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getCssValue("font-family");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontFamily2 = driver.findElement(By.xpath("//label[contains(text(),'Pwd')]")).getCssValue("font-family");
        Assert.assertEquals(fontFamily2, fontFamily1);
    }

    @Test
    public void passwordLabelTextFontSizeTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontSize1 = driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getCssValue("font-size");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontSize2 = driver.findElement(By.xpath("//label[contains(text(),'Pwd')]")).getCssValue("font-size");
        Assert.assertEquals(fontSize2, fontSize1);
    }

    @Test
    public void passwordLabelTextFontWeightTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontWeight1 = driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getCssValue("font-weight");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontWeight2 = driver.findElement(By.xpath("//label[contains(text(),'Pwd')]")).getCssValue("font-weight");
        Assert.assertEquals(fontWeight2, fontWeight1);
    }

    @Test
    public void passwordLabelTextColorTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String color1 = driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getCssValue("color");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String color2 = driver.findElement(By.xpath("//label[contains(text(),'Pwd')]")).getCssValue("color");
        Assert.assertEquals(color2, color1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Enter Your Username Place Holder
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void enterYourUsernameExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Boolean isPresent = driver.findElement(By.xpath("//input[@id='username']")).isDisplayed();
        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("enterYourUsername exist");
        }
    }

    @Test
    public void enterYourUsernameTextVerification() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String textValue2 = driver.findElement(By.xpath("//input[@id='username']")).getAttribute("placeholder");
        Assert.assertEquals(textValue2, "Enter your username");
    }

    @Test
    public void enterYourUsernamePositionTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        Point location1 = driver.findElement(By.xpath("//input[@id='username']")).getLocation();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Point location2 = driver.findElement(By.xpath("//input[@id='username']")).getLocation();
        Assert.assertEquals(location2, location1);
    }

    @Test
    public void enterYourUsernameFontFamilyTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontFamily1 = driver.findElement(By.xpath("//input[@id='username']")).getCssValue("font-family");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontFamily2 = driver.findElement(By.xpath("//input[@id='username']")).getCssValue("font-family");
        Assert.assertEquals(fontFamily2, fontFamily1);
    }

    @Test
    public void enterYourUsernameTextFontSizeTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontSize1 = driver.findElement(By.xpath("//input[@id='username']")).getCssValue("font-size");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontSize2 = driver.findElement(By.xpath("//input[@id='username']")).getCssValue("font-size");
        Assert.assertEquals(fontSize2, fontSize1);
    }

    @Test
    public void enterYourUsernameTextFontWeightTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontWeight1 = driver.findElement(By.xpath("//input[@id='username']")).getCssValue("font-weight");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontWeight2 = driver.findElement(By.xpath("//input[@id='username']")).getCssValue("font-weight");
        Assert.assertEquals(fontWeight2, fontWeight1);
    }

    @Test
    public void enterYourUsernameTextColorTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String color1 = driver.findElement(By.xpath("//input[@id='username']")).getCssValue("color");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String color2 = driver.findElement(By.xpath("//input[@id='username']")).getCssValue("color");
        Assert.assertEquals(color2, color1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Enter Your Password Place Holder
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void enterYourPasswordExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Boolean isPresent = driver.findElement(By.xpath("//input[@id='password']")).isDisplayed();
        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("enterYourUsername exist");
        }
    }

    @Test
    public void enterYourPasswordTextVerification() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String textValue2 = driver.findElement(By.xpath("//input[@id='password']")).getAttribute("placeholder");
        System.out.println(textValue2);
        Assert.assertEquals(textValue2, "Enter your password");
    }

    @Test
    public void enterYourPasswordPositionTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        Point location1 = driver.findElement(By.xpath("//input[@id='password']")).getLocation();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Point location2 = driver.findElement(By.xpath("//input[@id='password']")).getLocation();
        Assert.assertEquals(location2, location1);
    }

    @Test
    public void enterYourPasswordFontFamilyTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontFamily1 = driver.findElement(By.xpath("//input[@id='password']")).getCssValue("font-family");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontFamily2 = driver.findElement(By.xpath("//input[@id='password']")).getCssValue("font-family");
        Assert.assertEquals(fontFamily2, fontFamily1);
    }

    @Test
    public void enterYourPasswordTextFontSizeTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontSize1 = driver.findElement(By.xpath("//input[@id='password']")).getCssValue("font-size");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontSize2 = driver.findElement(By.xpath("//input[@id='password']")).getCssValue("font-size");
        Assert.assertEquals(fontSize2, fontSize1);
    }

    @Test
    public void enterYourPasswordTextFontWeightTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontWeight1 = driver.findElement(By.xpath("//input[@id='password']")).getCssValue("font-weight");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontWeight2 = driver.findElement(By.xpath("//input[@id='password']")).getCssValue("font-weight");
        Assert.assertEquals(fontWeight2, fontWeight1);
    }

    @Test
    public void enterYourPasswordTextColorTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String color1 = driver.findElement(By.xpath("//input[@id='password']")).getCssValue("color");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String color2 = driver.findElement(By.xpath("//input[@id='password']")).getCssValue("color");
        Assert.assertEquals(color2, color1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Male Circle icon
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void maleCircleIconExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Boolean isPresent = driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']")).isDisplayed();
        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("Male Circle exists");
        }
    }

    @Test
    public void maleCircleIconPositionTest() {
        // No such element error. This test will fail as driver is unable to locate the male circle icon
        driver.get("https://demo.applitools.com/hackathon.html");
        Point location1 = driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']")).getLocation();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Point location2 = driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']")).getLocation();
        Assert.assertEquals(location2, location1);
    }

    @Test
    public void maleCircleIconSizeTest() {
        // No such element error. This test will fail as driver is unable to locate the male circle icon
        driver.get("https://demo.applitools.com/hackathon.html");
        Dimension size1 = driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']")).getSize();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Dimension size2 = driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']")).getSize();
        Assert.assertEquals(size2, size1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Finger Print icon
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void fingerprintIconExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Boolean isPresent = driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']")).isDisplayed();
        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("Male Circle exists");
        }
    }

    @Test
    public void fingerprintIconPositionTest() {
        // No such element error. This test will fail as driver is unable to locat the finger print icon
        driver.get("https://demo.applitools.com/hackathon.html");
        Point location1 = driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']")).getLocation();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Point location2 = driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']")).getLocation();
        Assert.assertEquals(location2, location1);
    }

    @Test
    public void fingerprintIconSizeTest() {
        // No such element error. This test will fail as driver is unable to locat the finger print icon
        driver.get("https://demo.applitools.com/hackathon.html");
        Dimension size1 = driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']")).getSize();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Dimension size2 = driver.findElement(By.xpath("//div[@class='pre-icon os-icon os-icon-fingerprint']")).getSize();
        Assert.assertEquals(size2, size1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Login button
    // -----------------------------------------------------------------------------------------------------------------


    @Test
    public void loginButtonExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Boolean isPresent = driver.findElement(By.xpath("//button[@id='log-in']")).isDisplayed();
        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("Login Button exists");
        }
    }

    @Test
    public void loginButtonColorTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String color1 = driver.findElement(By.xpath("//button[@id='log-in']")).getCssValue("color");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String color2 = driver.findElement(By.xpath("//button[@id='log-in']")).getCssValue("color");
        Assert.assertEquals(color2, color1);
    }

    @Test
    public void loginButtonBorderTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String border1 = driver.findElement(By.xpath("//button[@id='log-in']")).getCssValue("border");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String border2 = driver.findElement(By.xpath("//button[@id='log-in']")).getCssValue("border");
        Assert.assertEquals(border2, border1);
    }

    @Test
    public void loginButtonSizeTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        Dimension size1 = driver.findElement(By.xpath("//button[@id='log-in']")).getSize();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Dimension size2 = driver.findElement(By.xpath("//button[@id='log-in']")).getSize();
        Assert.assertEquals(size2, size1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Login button text : "Log In"
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void loginButtonTextVerification(){
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Assert.assertEquals((driver.findElement(By.xpath("//button[@id='log-in']")).getText()), "Log In");
    }

    @Test
    public void loginButtonTextPositionTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String textValue2 = driver.findElement(By.xpath("//button[@id='log-in']")).getCssValue("text-align");
        Assert.assertEquals(textValue2, "center");
    }

    @Test
    public void loginButtonTextSizeTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String textValue2 = driver.findElement(By.xpath("//button[@id='log-in']")).getCssValue("font-size");
        Assert.assertEquals(textValue2, "14.4px");
    }

    @Test
    public void loginButtonTextWeightTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontweight = driver.findElement(By.xpath("//button[@id='log-in']")).getCssValue("font-weight");
        Assert.assertEquals(fontweight, "400");
    }

    @Test
    public void loginButtonTextColorTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String color = driver.findElement(By.xpath("//button[@id='log-in']")).getCssValue("color");
        Assert.assertEquals(color, "rgba(255, 255, 255, 1)");
    }

    @Test
    public void loginButtonfontFamilyTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontFamily1 = driver.findElement(By.xpath("//button[@id='log-in']")).getCssValue("font-family");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontFamily2 = driver.findElement(By.xpath("//button[@id='log-in']")).getCssValue("font-family");
        Assert.assertEquals(fontFamily2, fontFamily1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Checkbox
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void checkBoxExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Boolean isPresent = driver.findElement(By.xpath("//input[@class='form-check-input']")).isDisplayed();
        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("Checkbox exists");
        }
    }

    @Test
    public void checkBoxTopMarginTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String TopMargin1 = driver.findElement(By.xpath("//input[@class='form-check-input']")).getCssValue("margin-top");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String TopMargin2 = driver.findElement(By.xpath("//input[@class='form-check-input']")).getCssValue("margin-top");
        Assert.assertEquals(TopMargin2, TopMargin1);
    }

    @Test
    public void checkBoxLeftMarginTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String rightMargin1 = driver.findElement(By.xpath("//input[@class='form-check-input']")).getCssValue("margin-right");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String rightMargin2 = driver.findElement(By.xpath("//input[@class='form-check-input']")).getCssValue("margin-right");
        System.out.println(rightMargin2);
        Assert.assertEquals(rightMargin2, rightMargin1);
    }

    @Test
    public void checkBoxPaddingTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String padding1 = driver.findElement(By.xpath("//input[@class='form-check-input']")).getCssValue("padding");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String padding2 = driver.findElement(By.xpath("//input[@class='form-check-input']")).getCssValue("padding");
        Assert.assertEquals(padding2, padding1);
    }

    @Test
    public void checkBoxPositionTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        Point location1 = driver.findElement(By.xpath("//input[@class='form-check-input']")).getLocation();
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Point location2 = driver.findElement(By.xpath("//input[@class='form-check-input']")).getLocation();
        Assert.assertEquals(location2, location1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Checkbox label text : "Remember Me"
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void checkBoxLabelTextVerificationTest() {
        // Checking the correct text value for checkbox label

        driver.get("https://demo.applitools.com/hackathonV2.html");
        Assert.assertEquals((driver.findElement(By.xpath("//input[@class='form-check-input']")).getText()), "Remember ME");
    }

    @Test
    public void checkBoxLabelTextPositionTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String textValue2 = driver.findElement(By.xpath("//label[@class='form-check-label']")).getCssValue("text-align");
        System.out.println(textValue2);
        Assert.assertEquals(textValue2, "left");
    }

    @Test
    public void checkBoxLabelTextSizeTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String textValue2 = driver.findElement(By.xpath("//label[@class='form-check-label']")).getCssValue("font-size");
        Assert.assertEquals(textValue2, "14.4px");
    }

    @Test
    public void checkBoxLabelTextWeightTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontweight = driver.findElement(By.xpath("//label[@class='form-check-label']")).getCssValue("font-weight");
        Assert.assertEquals(fontweight, "400");
    }

    @Test
    public void checkBoxLabelTextColorTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String color = driver.findElement(By.xpath("//label[@class='form-check-label']")).getCssValue("color");
        Assert.assertEquals(color, "rgba(62, 75, 91, 1)");
    }

    @Test
    public void checkBoxLabelTextfontFamilyTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String fontFamily1 = driver.findElement(By.xpath("//label[@class='form-check-label']")).getCssValue("font-family");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String fontFamily2 = driver.findElement(By.xpath("//label[@class='form-check-label']")).getCssValue("font-family");
        Assert.assertEquals(fontFamily2, fontFamily1);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Social Media Icon: Twitter
    // -----------------------------------------------------------------------------------------------------------------
    @Test
    public void twitterExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Boolean isPresent = driver.findElement(By.xpath("//span[1]//img[1]")).isDisplayed();
        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("Twitter Icon exists");
        }
    }

    @Test
    public void twitterWidthTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String size1 = driver.findElement(By.xpath("//form//a[1]//img[1]")).getCssValue("width");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String size2 = driver.findElement(By.xpath("//span[1]//img[1]")).getCssValue("width");
        Assert.assertEquals(size2, size1);
    }

    @Test
    public void twitterPaddingTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String size1 = driver.findElement(By.xpath("//div[@class='buttons-w']//div[2]")).getCssValue("padding");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String size2 = driver.findElement(By.xpath("//div[@class='buttons-w']//div[2]")).getCssValue("padding");
        Assert.assertEquals(size2, size1);
    }
    // -----------------------------------------------------------------------------------------------------------------
    // Social Media Icon: Facebook
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void facebookExistTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        Boolean isPresent = driver.findElement(By.xpath("//span[2]//img[1]")).isDisplayed();
        if (isPresent == false) {
            Assert.fail();
        } else {
            System.out.println("Facebook Icon exists");
        }
    }

    @Test
    public void facebookWidthTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String size1 = driver.findElement(By.xpath("//a[2]//img[1]")).getCssValue("width");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String size2 = driver.findElement(By.xpath("//span[2]//img[1]")).getCssValue("width");
        Assert.assertEquals(size2, size1);
    }

    @Test
    public void facebookPaddingTest() {
        driver.get("https://demo.applitools.com/hackathon.html");
        String size1 = driver.findElement(By.xpath("//a[2]//img[1]")).getCssValue("padding");
        driver.get("https://demo.applitools.com/hackathonV2.html");
        String size2 = driver.findElement(By.xpath("//span[2]//img[1]")).getCssValue("padding");
        Assert.assertEquals(size2, size1);
    }
    // -----------------------------------------------------------------------------------------------------------------
    // Social Media Icon: LinkedIn
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void LinkedInExistTest() {
        // Checking if LinkedIn icon exists is not possible because there is no such an element in V2
    }

    @Test
    public void LinkedInWidthTest() {
        // Checking LinkedIn icon's width is not possible because there is no such an element in V2
    }

    @Test
    public void LinkedInPaddingTest() {
        // Checking LinkedIn icon's padding is not possible because there is no such an element in V2
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Data-Driven Test
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    @Test
    public void noUsernameNoPasswordTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        String errorValue1 = driver.findElement(By.xpath("//div[contains(@id,'random_id')]")).getText();
        String value1 = "Both Username and Password must be present";
        String value2 = "Please enter both username and password";
        if (errorValue1.equals(value2) | errorValue1.equals(value1)) {
            System.out.println("Error message is displayed correctly");
        } else {
            Assert.fail("There is an error in the validation message");
        }
    }

    @Test
    public void NoPasswordTest() {
        // THIS TEST WILL NOT FAIL BECAUSE THE ELEMENT AND THE TEXT IS THERE BUT ACTUALLY IT DOESN'T APPEAR SO USER
        // WON'T BE ABLE TO SEE IT AND TESTER WON'T BE ABLE TO KNOW IT THROUGH TRADITIONAL TESTS
        driver.get("https://demo.applitools.com/hackathonV2.html");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        String errorValue1 = driver.findElement(By.xpath("//div[contains(@id,'random_id')]")).getText();
        System.out.println(errorValue1);
        String value1 = "Password must be present";
        if (errorValue1.equals(value1)) {
            System.out.println("Error message is displayed correctly");
        } else {
            Assert.fail("There is an error in the validation message");
        }
    }

    @Test
    public void NoUsernameTest() {
        // THIS TEST WILL NOT FAIL BECAUSE THE TEXT IS PRESENT BUT ACTUALLY IT DOESN'T APPEAR CORRECTLY. SEE THE TEST
        // BELLOW WHICH WILL FAIL WHICH IS EFFICIENT THAN THIS ONE

        driver.get("https://demo.applitools.com/hackathonV2.html");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tester");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        String errorValue1 = driver.findElement(By.xpath("//div[contains(@id,'random_id')]")).getText();
        System.out.println(errorValue1);
        String value1 = "Username must be present";
        if (errorValue1.equals(value1)) {
            System.out.println("Error message is displayed correctly");
        } else {
            Assert.fail("There is an error in the validation message");
        }
    }

    @Test
    public void NoUsernameErrorBoxSizeTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tester");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        String errorValue1 = driver.findElement(By.xpath("//div[contains(@id,'random_id')]")).getCssValue("width");
        String value1 = "0";
        boolean notEqual = !errorValue1.equals(value1);
        if (notEqual == false) {
            System.out.println("Error message is displayed correctly");
        } else {
            Assert.fail("There is an error in the validation message (Styling issue)");
        }
    }

    @Test
    public void bothUsernamePasswordTest() {
        driver.get("https://demo.applitools.com/hackathonV2.html");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tester");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        String currentURL = driver.getCurrentUrl();
        String value1 = "https://demo.applitools.com/hackathonAppV2.html";
        boolean notEqual = !currentURL.equals(value1);
        if (notEqual == false) {
            System.out.println("User logged in successfully");
        } else {
            Assert.fail("There is an error while trying to login with correct username and password");
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Table Sort Test
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void ascendingOrder() {
        driver.get("https://demo.applitools.com/hackathonV2.html?showAd=true");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("TesterUsername");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TesterPassword");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();
        driver.findElement(By.xpath("//th[@id='amount']")).click();

        WebElement table = driver.findElement(By.xpath("//table[@id='transactionsTable']"));

        // Now get all the TR elements from the table
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
// And iterate over them, getting the cells
        Vector list = new Vector();
        Vector list2 = new Vector();
        Vector finalList = new Vector();
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            // Print the contents of each cell
            int i=0;

            for (WebElement cell : cells) {
                // System.out.println(cell.getText());
                list.add(cell.getText());
            }
        }
        int i=0;

        for (i =4; i <=list.size(); i++) {
            list2.add(list.get(i));
            i=i+4;
        }

        int j;
        for(j=0; j<=5; j++){
            if ((String.valueOf(list2.get(j))).substring(0,1).equals("-")){
                String m2 = String.valueOf(list2.get(j)).replaceAll("\\D+","");
                finalList.add(0 - (Float.parseFloat(m2))/100);
            }
            else {
                String m2 = String.valueOf(list2.get(j)).replaceAll("\\D+","");
                finalList.add(Float.parseFloat(m2)/100);
            }
        }

        boolean sorted = Ordering.natural().isOrdered(finalList);
        Assert.assertEquals(sorted, true);
    }

    @Test
    public void intactRows(){
        driver.get("https://demo.applitools.com/hackathonV2.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("TesterUsername");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TesterPassword");
        driver.findElement(By.xpath("//button[@id='log-in']")).click();

        WebElement table = driver.findElement(By.xpath("//table[@id='transactionsTable']"));

        // Now get all the TR elements from the table
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
// And iterate over them, getting the cells
        Vector listWithoutClicking = new Vector();
        Vector list2 = new Vector();
        Vector finalList = new Vector();
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            // Print the contents of each cell
            int i=0;

            for (WebElement cell : cells) {
                // System.out.println(cell.getText());
                listWithoutClicking.add(cell.getText());
            }
        }
        System.out.println(listWithoutClicking);

        for (int i =4; i <=listWithoutClicking.size(); i++) {
            list2.add(listWithoutClicking.get(i));
            i=i+4;
        }

        // Clicking on amount and retrieving the data

        driver.findElement(By.xpath("//th[@id='amount']")).click();
        WebElement table2 = driver.findElement(By.xpath("//table[@id='transactionsTable']"));
        // Now get all the TR elements from the table
        List<WebElement> allRows2 = table2.findElements(By.tagName("tr"));
        // And iterate over them, getting the cells
        Vector listWithClick = new Vector();

        for (WebElement row2 : allRows2) {
            List<WebElement> cells2 = row2.findElements(By.tagName("td"));
            // Print the contents of each cell

            for (WebElement cell2 : cells2) {
                // System.out.println(cell.getText());
                listWithClick.add(cell2.getText());
            }
        }
        System.out.println(listWithClick);
        int n;
        for (n=1; n<=29; n++) {
            for (int s=1; s<=29;s++){
                if (listWithClick.get(n).equals(listWithoutClicking.get(s))){
                    Assert.assertTrue(listWithClick.get(n-1).equals(listWithoutClicking.get(s-1)));
                    Assert.assertTrue(listWithClick.get(n+1).equals(listWithoutClicking.get(s+1)));
                    Assert.assertTrue(listWithClick.get(n+2).equals(listWithoutClicking.get(s+2)));
                    Assert.assertTrue(listWithClick.get(n+3).equals(listWithoutClicking.get(s+3)));
                }
                s = s+5;
            }
            n =n+5;
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Canvas Chart Test
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void chartDataTest() throws InterruptedException {
        driver.get("https://demo.applitools.com/hackathonChart.html");
        String value = (driver.findElement(By.xpath("//div[@class='element-wrapper compact pt-4']/script")).getAttribute("innerHTML"));
        driver.get("https://demo.applitools.com/hackathonChartV2.html");
        String value2 = (driver.findElement(By.xpath("//div[@class='element-wrapper compact pt-4']/script")).getAttribute("innerHTML"));
        Assert.assertEquals(value, value2);
    }

    @Test
    public void added2019DataTest(){
        // I am unable to write this test as the added data is added dynamically through a Javascript function.
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Dynamic Content Test
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------

    @Test
    public void adDisplayFlashSaleTest(){
        driver.get("https://demo.applitools.com/hackathonAppV2.html?showAd=true");
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flashSale']//img")).isDisplayed());
    }

    @Test
    public void adDisplayFlashSale2Test(){
        driver.get("https://demo.applitools.com/hackathonAppV2.html?showAd=true");
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flashSale2']//img")).isDisplayed());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
