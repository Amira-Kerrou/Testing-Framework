package base;

import org.testng.annotations.BeforeSuite;
import pages.authentification.Authentification;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.openqa.selenium.remote.Browser.CHROME;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.yaml.snakeyaml.Yaml;
import lombok.Getter;
import static org.openqa.selenium.remote.Browser.CHROME;


public class BaseSetup {
    @Getter
    public enum Browsers {

        //Chrome Browser
        CHROME,

        //Edge browser.
        EDGE,

        //Firefox browser.
        FIREFOX,

        //Remote Grid / cloud Chrome browser.
        REMOTE_CHROME,

        //Remote Grid / cloud Firefox browser.
        REMOTE_FIREFOX,

    }

    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();
  //  public static   WebDriver driver;
    private static final Logger LOG = LogManager.getLogger("DriverManager.class");
    private static final String HUB_URL;
    static public Map<String, String> properties;

    static {
        try {
            properties = parseYamlFile("src/main/resources/appProperties.Yaml");
        } catch (Exception e) {
            LOG.error("Error", e);
        }
        if (properties != null) {
            HUB_URL = (String) properties.get("Hub-URL");
        } else {
            HUB_URL = null;
        }}
        @Parameters("browser")
        @BeforeClass(alwaysRun = true)
        public void setupTest(final String browser)  {
            createDriver(Browsers.valueOf(browser.toUpperCase()));
            getDriver().navigate().to("http://192.168.1.203:9002/login");
        }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (null != DRIVER.get()) {
            LOG.info("Closing the driver...");
            getDriver().quit();
            DRIVER.remove();
        }
    }

    private static void createDriver(final Browsers browser) {
        switch (browser) {
            case REMOTE_CHROME:
                setupRemoteChrome();
                break;
            case REMOTE_FIREFOX:
                setupRemoteFirefox();
                break;
            case CHROME:
            default:
                setupChromeDriver();
        }
        setupBrowserTimeouts();
    }

    private static void setupBrowserTimeouts() {
        LOG.info("Setting Browser Timeouts....");
        getDriver().manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(30));
        getDriver().manage()
                .timeouts()
                .pageLoadTimeout(Duration.ofSeconds(30));
        getDriver().manage()
                .timeouts()
                .scriptTimeout(Duration.ofSeconds(30));
    }

    private static void setupChromeDriver() {
        LOG.info("Setting up Chrome Driver....");
        final boolean isHeadless = Boolean.parseBoolean(
                Objects.requireNonNullElse(System.getProperty("headless"), "false"));
        final HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("safebrowsing.enabled", "true");
        chromePrefs.put("download.prompt_for_download", "false");
        chromePrefs.put("download.default_directory",
                String.valueOf(Paths.get(System.getProperty("user.home"), "Downloads")));

        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1050,600");
        if (isHeadless) {
            options.addArguments("--headless");
        }
        options.addArguments("--safebrowsing-disable-download-protection");
        options.setExperimentalOption("prefs", chromePrefs);
        setDriver(WebDriverManager.chromedriver()
                .capabilities(options)
                .create());
        LOG.info("Chrome Driver created successfully!");
    }

  /*  private static void setupRemoteChrome() {
        try {
            LOG.info("Setting up Remote Chrome Driver....");
            final DesiredCapabilities caps = new DesiredCapabilities();
            caps.setBrowserName(CHROME.browserName());
            DRIVER=new RemoteWebDriver(new URL(HUB_URL), caps);
            setDriver(DRIVER);
            LOG.info("Remote Chrome Driver created successfully!");
        } catch (final MalformedURLException e) {
            LOG.error("Error setting remote_chrome", e);
        }
    }
*/
    private static void setupRemoteChrome () {
        try {
            LOG.info ("Setting up Remote Chrome Driver....");
            final DesiredCapabilities caps = new DesiredCapabilities ();
            caps.setBrowserName (CHROME.browserName ());
            setDriver (new RemoteWebDriver (new URL (properties.get("Hub-URL")), caps));
            LOG.info ("Remote Chrome Driver created successfully!");
        } catch (final MalformedURLException e) {
            LOG.error ("Error setting remote_chrome", e);
        }
    }
    public static WebDriver getDriver () {
        return BaseSetup.DRIVER.get ();
    }

    private static void setupRemoteFirefox() {
        try {
            LOG.info("Setting up Remote Firefox Driver....");
            final DesiredCapabilities caps = new DesiredCapabilities();
            caps.setBrowserName("firefox");
            setDriver(new RemoteWebDriver(new URL(HUB_URL), caps));
            LOG.info("Remote Firefox Driver created successfully!");
        } catch (final MalformedURLException e) {
            LOG.error("Error setting remote_firefox", e);
        }
    }

    private static void setDriver(final WebDriver driver) {
        DRIVER.set(driver);
    }

    public static Map parseYamlFile(String path) {
        Yaml yaml = new Yaml();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            LOG.error(e.getMessage());
        }
        properties = yaml.load(inputStream);
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
        return properties;
    }

    /*public void startup() {
        Authentification authentification = new Authentification();
        authentification.login();
        System.out.println("login page displayed");}*/
}