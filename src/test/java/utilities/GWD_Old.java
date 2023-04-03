package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD_Old {
    private static WebDriver driver;
    public static WebDriver getDriver() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (driver == null) {
             driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
