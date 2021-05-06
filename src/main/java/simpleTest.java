import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

        driver.findElement(By.name("Dziewięć")).click();
        driver.findElement(By.name("Plus")).click();
        driver.findElement(By.name("Dziewięć")).click();
        driver.findElement(By.name("Pomnóż przez")).click();
        driver.findElement(By.name("Dziewięć")).click();
        driver.findElement(By.name("Równa się")).click();

        WebElement ChildWindow = driver.findElementById("CalculatorResults");
        String Element1 = ChildWindow.getAttribute("Name")/*.findElement(By.id("TextContainer"))*/;
        //String name = Element1.getAttribute("Name");
        System.out.println(Element1);

        //String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
        //System.out.println(output);
        //driver.findElement(By.id("Close")).click();

        //Assert.assertEquals("Wyświetlana wartość to 9", output);
    }
}