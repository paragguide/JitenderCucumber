package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Page;

public class ScreenShot extends Page
{
     public static void takeScreenShot(String scrshot) throws Exception
     {
    	 String path = System.getProperty("user.dir")+"\\src\\test\\java\\screenshot\\"+scrshot+".jpg";
     
    	 TakesScreenshot ts = (TakesScreenshot)driver;
         File tmp = ts.getScreenshotAs(OutputType.FILE); // stores screenshot in tmp location
     
         FileUtils.copyFile(tmp, new File(path));
     }
}
