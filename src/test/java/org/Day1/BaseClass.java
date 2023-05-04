package org.Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Select s;

	public static void openChromeBrowser() { // 1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void openEdgeBrowser() { // 2
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void openFirefoxBrowser() { // 3
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void closeCurrentTab() { // 4

		driver.close();
	}
	
	public static void closeBrower() { // 5

		driver.quit();
	}
	
	public void dateAndTime() {
		Date d = new Date();
		System.out.println(d);
		}

	public static void fetchTitle() { // 6
		String titleName = driver.getTitle();
		System.out.println(titleName);
	}

	public static void fetchUrl() { // 7
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void maxWindow() { // 8
		driver.manage().window().maximize();
	}

	public static void toReload() { // 9
		driver.navigate().refresh();
	}

	public static void launchUrl(String url) { // 10
		driver.get(url);
	}

	public static void holdExecution(int millis) throws InterruptedException { // 11
		Thread.sleep(millis);
	}

	public static void fillTextBox(WebElement element, String input) { // 12
		element.sendKeys(input);
	}

	public static void toClickButton(WebElement element) { // 13
		element.click();
	}

	public static void moveCursor(WebElement targetelement) { // 14
		a = new Actions(driver);
		a.moveToElement(targetelement);
	}

	public static void dropDown(WebElement source, WebElement target) { // 15
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void handleSimpleAlert() { // 16
		Alert ac = driver.switchTo().alert();
		ac.accept();
	}

	public static void cancelConfirmAlert() { // 17
		driver.switchTo().alert().dismiss();
	}

	private void promptAlert(String Value) { // 18
		driver.switchTo().alert().sendKeys(Value);
	}

	private void promptAlertText() { // 19
		driver.switchTo().alert().getText();
	}

	public static void copy() throws AWTException { // 20
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void paste() throws AWTException { // 21
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void tab() throws AWTException { // 22
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void copyAll() throws AWTException { // 23
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}

	public static void save() throws AWTException { // 24
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_S);
	}

	public static void enter() throws AWTException { // 25
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void cut() throws AWTException { // 26
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}

	public static void keyDown() throws AWTException { // 27
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void keyUp() throws AWTException { // 28
		r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	public static void pageDown() throws AWTException { // 29
		r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}

	public static void pageUp() throws AWTException { // 30
		r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	public static void takeScreenshot(WebDriver driver, String pathname) throws IOException { // 31
		TakesScreenshot tc = (TakesScreenshot) driver;
		File sc = tc.getScreenshotAs(OutputType.FILE);
		File fpath = new File(pathname);
		FileUtils.copyFile(sc, fpath);
	}

	public static void jscommand(String script, Object args) { // 32
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, args);
	}

	public static void selectIndex(WebElement element, int index) { // 33
		s = new Select(element);
		s.selectByIndex(index);
	}

	public void selectVisibleText(WebElement element, String text) { // 34
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void selectValue(WebElement element, String value) { // 35
		s = new Select(element);
		s.selectByValue(value);
	}

	public static void deselectValue(WebElement element, String value) { // 36
		s = new Select(element);
		s.deselectByValue(value);
	}

	public void deselectIndex(WebElement element, int index) { // 37
		s = new Select(element);
		s.deselectByIndex(index);

	}

	public static void deselectVisibleText(WebElement element, String text) { // 38
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void swtichWindow(String name) { // 39
		driver.switchTo().window(name);
	}

	public static void switchFramesIndex(int index) { // 40
		driver.switchTo().frame(index);

	}

	public static void switchFramesName(String nameOrId) { // 41
		driver.switchTo().frame(nameOrId);
	}

	public static void switchFramesElement(WebElement frameElement) { // 42
		driver.switchTo().frame(frameElement);
	}

	public static void switchParentFrame() { // 43
		driver.switchTo().parentFrame();
	}

	public static void navigateRefresh() {// 44
		driver.navigate().refresh();
	}

	public static void navigateUrl(String url) { // 45
		driver.navigate().to(url);
	}

	public static void navigateBack() { // 46
		driver.navigate().back();
	}

	public static void navigateForward() { // 47
		driver.navigate().forward();
	}

	public static String toReadDataFromExcel(String Sheetname, int rw, int ce) throws IOException {   //48
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\FrameWorkApril\\PersonalDetails\\Personal Information.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fis);
		Sheet s1 = bk.getSheet(Sheetname);
		Row r1 = s1.getRow(rw);
		Cell c1 = r1.getCell(ce);
		int ct = c1.getCellType();
		
		String input;
		
		if (ct==1) {
			input = c1.getStringCellValue();
		}
			else if (DateUtil.isCellDateFormatted(c1)) {
				
			Date da = c1.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("MMM DD,YYYY");
			input = sim.format(da);			
			
		} else {
			double dl = c1.getNumericCellValue();
			long l = (long)dl;
			input = String.valueOf(l);

		}
		return input;
		
	}

	
	
	public static void toWriteExcel(String Sheetname, int rw, int cw, String value) throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\FrameWorkApril\\PersonalDetails\\Personal Information.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fis);
		Sheet s1 = bk.getSheet(Sheetname);
		Row r1 = s1.getRow(rw);
		Cell c1 = r1.createCell(cw);
		c1.setCellValue(value);
		FileOutputStream fout = new FileOutputStream(f);
		bk.write(fout);

	}
	
	
	
	
	
	
}
