package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	
	public static  void browserSelect(String browserName) {
		
		if (browserName.startsWith("Chro")) {
			driver = new ChromeDriver();
		}
		else if (browserName.contains("Ed")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
	}
	
	public static void urlLoad(String url) {
		driver.get(url);

	}
	public static void maxBrowser() {
		driver.manage().window().maximize();
	}
	
	public static void enterValues(WebElement ele , String text) {
		ele.sendKeys(text);

	}
	
	public static  String titleGet() {
		String t = driver.getTitle();
		return t;

	}
	public static void btnClick(WebElement ele) {
		ele.click();	
	}
	//handling windows Method 
	public static void handlingWindows(int childWindowNos) {
		
		Set<String> allWindow = driver.getWindowHandles();
		List<String> list = new LinkedList<String>();
		list.addAll(allWindow);
		
		driver.switchTo().window(list.get(childWindowNos));	
	}
	
	public static void dropDownSelectByText(WebElement ele ,String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);

	}
	
	public static  void scrollDownJavaScript(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	
	public static void handlingAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	
	public static  String xlDatasGet(int rowNo , int cellNo) throws IOException {
			
		File f = new File("E:\\Eclipse Photon\\FlipKartProject\\XlSheetDatas\\ExcelDatasFlip.xlsx");
		FileInputStream fil = new  FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(fil);
		
		Sheet sheet = book.getSheetAt(0);
		String name ="";
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(rowNo);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				
				Cell cell = row.getCell(cellNo);
				
				int cellType = cell.getCellType();
				
				if (cellType==1) {
					name = cell.getStringCellValue();
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
					name = sim.format(date);
				}
				else {
					double d = cell.getNumericCellValue();
					long l =(long)d;
					name = String.valueOf(l);
					
				}
				
			}
		}
		
		return name;
	}
	
	
	
	
	
	
	
	
	
}