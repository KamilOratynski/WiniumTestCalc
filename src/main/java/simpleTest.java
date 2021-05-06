import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class simpleTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WiniumDriver driver;
        String appPath = "C:/windows/system32/calc.exe";
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath(appPath);
        option.setDebugConnectToRunningApp(false);
        option.setLaunchDelay(2);
        driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        Thread.sleep(5000);

        driver.findElement(By.name("Siedem")).click();
        driver.findElement(By.name("Plus")).click();
        driver.findElement(By.name("Dwa")).click();
        driver.findElement(By.name("Równa się")).click();

        String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
        System.out.println(output);
        driver.findElement(By.id("Close")).click();

        Assert.assertEquals("Wyświetlana wartość to 9", output);
    }
}