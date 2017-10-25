package generics;


import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by binitanand on 23/10/17.
 */
public class Utility {

        public static String getFormatedDateTime(){
            SimpleDateFormat simpleDate = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
            return simpleDate.format(new Date());
        }

        public static String getScreenShot(String imageFolderPath){
            String imagePath=imageFolderPath+"/"+getFormatedDateTime()+".png";

            try{
                Dimension desktopSize=Toolkit.getDefaultToolkit().getScreenSize();
                BufferedImage image = new Robot().createScreenCapture(new Rectangle(desktopSize));
                ImageIO.write(image, "png", new File(imagePath));
            }
            catch(Exception e){
            }

            return imagePath;

        }
        public static String getPropertyValue(String filePath,String key)
        {
            String value="";
            Properties ppt=new Properties();
            try{
                ppt.load(new FileInputStream(filePath));
                value=ppt.getProperty(key);
            }
            catch(Exception e){
            }
            return value;
        }

        public static boolean verifyElementIsPresent(WebDriverWait wait,WebElement element) {
            try {
                wait.until(ExpectedConditions.visibilityOf(element));
                return true;
            } catch (Exception E) {
                return false;
            }
        }

        public static void moveToElement(WebDriver driver, WebElement element) {
            Actions ac = new Actions(driver);
            ac.moveToElement(element).perform();
        }

    }

