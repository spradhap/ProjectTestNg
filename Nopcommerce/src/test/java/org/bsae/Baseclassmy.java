package org.bsae;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassmy {
	
	
	public static WebDriver driver;
	
	 // TO CALL GetDriver 
		public static void getDriver(String browserType) {

			switch (browserType) {
			case "chrome":
//				System.setProperty("webdriver.chrome.driver",
//						"C:\\Users\\pradhap\\eclipse-workspace\\Nopcommerce\\driver\\chromedriver.exe");
				  WebDriverManager.chromedriver().setup();  
				driver = new ChromeDriver();

				break;
				
			case "edge":
//	              System.setProperty("webdriver.edge.driver",
//	            		  "C:\\Users\\pradhap\\eclipse-workspace\\Nopcommerce\\driver\\msedgedriver.exe");
				 WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			break;
			
			default:
				
				break;
			}

		}
	  
		// TO Call GetURL 
		public static void getUrl(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}

		// TO CALL Textsendkeys using java 
		public static void textSendbyJava(WebElement element, String keysToSend) {
			element.sendKeys(keysToSend);
		}

		//TO CALL TakesScreenShot 
		public static void screenCapture(String name) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			File targetFile = new File("C:\\GYM\\New folder\\" + name + ".png");

			FileUtils.copyFile(sourceFile, targetFile); // Throw IOException

		}

		//// TO CALL Textsendkeys using javaScript 
		public static void textSendByJS(String keysToSend, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + keysToSend + "')", element);

		}
		
	    ///// TO CALL Click using javaScript 
		public static void clickbyJS(String click, WebElement element) {
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].click()", element);
		}
	      
		    // TO CALL getAttribute using javaScript 
		public static void getAttributeJS(String keytoprint, WebElement element) {
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("return arguments[0].getAttribute('value','" + keytoprint + "')", element);

		}
		  //TO CALL Scrolldown using javaScript 

		public static void scrolldownjs(String textvalue, WebElement element) {
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].scrollIntroview(ture)" + textvalue + "", element);

		}

		//TO CALL Scrollup using javaScript 
		private static void scrollupjs(String textvalue, WebElement element) {
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("arguments[0].scrollIntroview(flase)" + textvalue + "", element);

		}

		//TO CALL tourl using Navigate 
		public static void navigatetourl(String url) {
			driver.navigate().to(url);
		}
		
		////TO CALL forword using Navigate

		public static void navigateforward() {
			driver.navigate().forward();

		}
		
		//TO CALL back using Navigate

		public static void navigateback() {
			driver.navigate().back();
		}

		//TO CALL refresh using Navigate
		public static void navigaterefersh() {
			driver.navigate().refresh();

		}
		
	    ////TO CALL alert using simplealertaccept
		public static void simplealertaccept() {
			Alert alert = driver.switchTo().alert();
			alert.accept();

		}
		
	      ////TO CALL alert using simplealertdissmiss
		public static void simplealertdissmiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		}
	    ////TO CALL alert using confrimalertdissmiss

		public static void confirmalertdismiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		}

	      ///TO CALL alert using confirmalertaccept
		public static void confirmalertaccept() {
			Alert alert1 = driver.switchTo().alert();
			alert1.accept();
		}
		
		//////TO CALL alert using promptalert text and accept

		public static void promptalert(String text, WebElement element) {
			Alert alert2 = driver.switchTo().alert();
			alert2.sendKeys(text);
			alert2.accept();

		}

	    ////TO CALL movetoelement using Actions
		public static void action(WebElement element) {
			Actions lee = new Actions(driver);
			lee.moveToElement(element).build().perform();

		}
		
	    ////TO CALL drag and drop using Actions

		public static void draganddrop(WebElement element, WebElement element1) {
			Actions act = new Actions(driver);
			act.dragAndDrop(element, element1).build().perform();

		}
		
	    ////TO CALL clickandhold using Actions

		public static void clickandhold(WebElement element, WebElement element1) {
			Actions act1 = new Actions(driver);
			act1.clickAndHold(element).moveToElement(element1).release().perform();
		}
		
	    ////TO CALL doubleclick  using Actions

		public static void doubleclick(WebElement element) {
			Actions act2 = new Actions(driver);
			act2.doubleClick(element).build().perform();
			act2.contextClick(element).build().perform();
		}
		
	    ////TO CALL Robot method

		public static void robot(WebElement element) throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_P);
			
		}
		
		// to call robot keypress 
		public static void keypress (int keycode) {
			try {
				Robot r1 = new Robot();
				r1.keyPress(keycode);
			} catch (AWTException e) {
				
				e.printStackTrace();
			}
			
		}
		
		// to call robot keyrelese 
		
		public static  void keyrelease(int keycode) {
			try {
				Robot r2 = new Robot();
				r2.keyRelease(keycode);
			} catch (AWTException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	    ////TO CALL selectbyvisibletext using select

		public static void selectbyvisibletext(WebElement element, String text) {

			Select s = new Select(element);
			s.selectByVisibleText(text);

		}
		
	     ////TO CALL selectbyvalue using select

		public static void selectbyvalue(WebElement element, String textto) {

			Select s1 = new Select(element);
			s1.selectByValue(textto);

		}
		
	   ////TO CALL selectbyindex using select

		public static void selectbyindex(WebElement element, int Index ) {

			Select s2 = new Select(element);
			s2.selectByIndex(Index);
			

		}
		
	  ////TO CALL selectbyindexgetoptions using select

		public static void selectbyindexgetoptions(WebElement element) {

			Select s3 = new Select(element);

			List<WebElement> options = s3.getOptions();
			for (int i = 0; i < options.size(); i++) {
				WebElement webElement = options.get(i);
				String text = webElement.getText();
				System.out.println(text);

			}

		}
		
		///TO CALL selectgetallselect using select

		public static void selectgetallselect(WebElement element) {
			Select s4 = new Select(element);

			List<WebElement> allSelectedOptions = s4.getAllSelectedOptions();

			for (int i = 0; i < allSelectedOptions.size(); i++) {
				WebElement webElement1 = allSelectedOptions.get(i);
				String text1 = webElement1.getText();
				System.out.println(text1);

			}

		}
		
		///TO CALL selectfirstselection using select


		public static void selectfirstselection(WebElement element) {

			Select s5 = new Select(element);

			WebElement firstSelectedOption = s5.getFirstSelectedOption();
			String text3 = firstSelectedOption.getText();
			System.out.println(text3);
		}
		
		///TO CALL Windowshandling methods

		public static void windowshandling() {

			String parent = driver.getWindowHandle();
			System.out.println("parentwindowid" + parent);

			Set<String> allwindows = driver.getWindowHandles();
			System.out.println("allwindowsid" + allwindows);

			for (String x : allwindows) {
				if (!parent.equals(x)) {
					System.out.println("frist child windowsid" + x);
					driver.switchTo().window(x);
				}

			}

		}
		
		
		/// Windows Handling
		public static void windowhandle(WebElement element, WebElement element1) {
			String windowHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			for (String x : windowHandles) {
				if (!windowHandle.equals(x)) {

				}
				driver.switchTo().window(x);
			}
		}
		
		///TO CALL frames
		public static void frames(WebElement element) {

			driver.switchTo().frame(element);

		}

		
		///TO CALL Threadsleep

		public static void threadsleep(int value)  {
			try {
				Thread.sleep(value);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}
		///TO CALL close
		public static void closethetab () {
			driver.close();

		}
		
		///TO CALL quit
		public static void Quitallthewindows() {
			driver.quit();

		} 
		
		
		///TO CALL getText
		public static void gettext(WebElement element,String value ) {
			String text = element.getText();
	        System.out.println(text);
			
		
	        
		}
		
		// to call sendkeys
		public static void sendkeys(WebElement element, String value) {
			element.sendKeys(value);
		}
		// to call click 
		public static void click(WebElement element) {
			
			element.click();
		}
		///TO CALL getAttribute
		
		public static void getAttribute(WebElement element,String value) {
			
			String attribute = element.getAttribute(value);
	        System.out.println(attribute);
			
			
		}
		
		/// TO CALL excelread
		public static String excelRead(int rownum,int cellnum) throws IOException {
			
			File filepath = new File("D:\\nopcommerce.xlsx");
			
			FileInputStream stream = new FileInputStream(filepath);
			
			Workbook book = new XSSFWorkbook(stream); 
			
			Sheet sheet = book.getSheet("sheet1");
			
			Row row = sheet.getRow(rownum);
			
			Cell cell = row.getCell(cellnum);
			
			CellType cellType = cell.getCellType();
			String value = null;
			switch (cellType) {
			case STRING:
				
				 value = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
					value = simple.format(dateCellValue);
					
				} else {
					
					double numericCellValue = cell.getNumericCellValue();
					BigDecimal valueof = BigDecimal.valueOf(numericCellValue);
					value = valueof.toString();

				}
				break;
			default:
				
				System.out.println("none");
				break;
			}
			
			return value;
			
			
			
			

		}
		
	
	

}
