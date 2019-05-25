package selenium.test.project.Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class CustomScreenshot {

    //tworzenie metody do screenshotow
    public void makeScreenshot(WebDriver driver, String fileName){
               File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File(new CustomPath().getProjectPath() + BaseProperties.SCREENSHOT_PATH + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
