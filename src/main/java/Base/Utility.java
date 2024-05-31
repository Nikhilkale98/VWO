package Base;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

import Configuration.configuration;

public class Utility {
	static WebDriver driver;
    public static String testdata(int rowindex,int colindex) throws EncryptedDocumentException, IOException {
    	FileInputStream file=new FileInputStream(configuration.excelsheetpath);
    	Sheet sh = WorkbookFactory.create(file).getSheet("Book1");
    	String value=sh.getRow(rowindex).getCell(colindex).getStringCellValue();
    	return value;
    	
    	}
  
    public static void Capturesceenshot() throws WebDriverException, IOException {
    	File sorce = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File f=new File(configuration.screenshotpath +"_image.jpg");
    	FileHandler.copy(sorce, f);
    	
    	
    	
    }
    }

