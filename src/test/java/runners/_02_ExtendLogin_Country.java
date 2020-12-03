package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.Driver;

@CucumberOptions(
        features = {"src/test/java/featureFiles/_01_Login.feature","src/test/java/featureFiles/_02.1_Country.feature"},
        glue = {"stepDefinitions"},
        dryRun = false,
        plugin = {
        "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        }
)


public class _02_ExtendLogin_Country extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public static void beforeClass(String browser){
        Driver.threadBrowserName.set(browser);

    }

    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/test/java/xmlFiles/extendReportSet.xml");
        Reporter.setSystemInfo("User Name", "Cigdem Arslan");
        Reporter.setSystemInfo("Aplication Name", "BASQAR");
        Reporter.setSystemInfo("Operation System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber report");
    }

}
