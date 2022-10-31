package Reusable_methods;


import java.io.File;
//import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import Utilities.Utility;





public class Reusable {
	private static MissingCellPolicy xRow;
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	public static int timeInterval = 5;
	public static int Timeinsec=20;
	public static String actualValwithoutdollar=null;
	public static WebElement e;
	public static WebDriver driver;
	
	public static void initialiseWebdriver()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chromdrivr\\chromedriver.exe\\");
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	public static void LaunchURL(String url)
	{
		driver.get(url);
	}
	public static void Navigationback(String url)
	{
		driver.navigate().back();
	}
	
	public static void EnterText(String xpath,String data)
	{
		waitforelement(xpath,30);
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}
	public static String GetattributeText(String xpath,String att)
	{
		waitforelement(xpath,30);
		return driver.findElement(By.xpath(xpath)).getAttribute(att);
	}
	public static void pressEscapeKey()
	{
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	
	
	
	public static void ClickBtnjse(String xpath)
	{
		waitforelement(xpath,30);
		//driver.findElement(xpath).click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath(xpath)));
	}

	public static void ClickButton(String xpath)
	{
		//waitforelement(xpath,30);
		driver.findElement(By.xpath(xpath)).click();
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath(xpath)));
	}

	public static void Newsletrpopup(String xpath)
	{
		Actions action = new Actions(driver);
		 action.sendKeys(Keys.ESCAPE).build().perform();
		 try {
		 driver.findElement(By.xpath("//button[@alt='Close form']")).click();
		 }catch(Exception e)
		 {
			 System.out.println("popup not available");
		 }
	}
	
	public static void waitforelement(String xpath,long time)
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		
				
	}


	public static void waitforelementvisible(String xpath,long time)
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
				
	}

	public static void staticwait(long time) throws Throwable
	
	{
		Thread.sleep(time);
	}
	public static void verifydata(String actxpath,String expecteddata,int i,int j) throws Throwable
	{
		waitforelement(actxpath,30);
		String getactvalue  = driver.findElement(By.xpath(actxpath)).getText();
		String getexpvalue = expecteddata;
		System.out.println("The expected text :" + getexpvalue.trim().replace("\n", "").replace("\r", ""));
		System.out.println("The actual text :" + getactvalue.trim().replace("\n", "").replace("\r", ""));
		
		if(getactvalue.trim().replace("\n", "").replace("\r", "").equalsIgnoreCase(getexpvalue.trim().replace("\n", "").replace("\r", "")))
		{
			//setExcelFile(Cro_newcart.Path_TestData+Cro_newcart.File_TestData,Cro_newcart.Sheetname);
			//setCellData("Pass "+getactvalue.trim().replace("\n", "").replace("\r", ""),i,j,Cro_newcart.File_TestData);
			System.out.println("Pass");
		}
		else
		{
		//	setExcelFile(Cro_newcart.Path_TestData+Cro_newcart.File_TestData,Cro_newcart.Sheetname);
			//setCellData("Fail "+getactvalue.trim().replace("\n", "").replace("\r", ""),i,j,Cro_newcart.File_TestData);

			System.out.println("Fail");
		}
		
	}
	
	public static void mouseHover(String xpath) throws Throwable  {
		waitforelement(xpath,30);
		Actions act=new Actions(driver);
		WebElement el=driver.findElement(By.xpath(xpath));
		//JOptionPane.showConfirmDialog(null, null);
		staticwait(2000);
		act.moveToElement(el).build().perform();
		
	}
	
	public static void selectlistbyvisibletxt(String xpath,String value)
	{
		waitforelement(xpath,30);
		Select sel = new Select(driver.findElement(By.id(xpath)));
		sel.selectByVisibleText(value);;
	}

	public static void selectlistxpathbyvisibletxt(String xpath,String value)
	{
		waitforelement(xpath,30);
		Select sel = new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByVisibleText(value);;
	}

	public static void selectlistbyindex(String xpath,int value)
	{
		waitforelement(xpath,30);
		Select sel = new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByIndex(value);
	}

	public static void clearTextfield (String xpath) throws Throwable {
		waitforelement(xpath,30);
		Thread.sleep(2000);
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.BACK_SPACE);
		
	}
	
	public  static String getelementtext(String xpath)
	{
		waitforelement(xpath,30);
		String eletext = driver.findElement(By.xpath(xpath)).getText(); 
		return eletext;
		
	}
	public  static String getelementtext1(String xpath)
	{
		String eletext = xpath; 
		return eletext;
		
	}
	
	public static double roundDouble(double d, int places) {
		 
	    BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
	    bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
	    return bigDecimal.doubleValue();
	}
	public static void switchwindow()
	{        //Get handles of the windows
      String mainWindowHandle = driver.getWindowHandle();
      Set<String> allWindowHandles = driver.getWindowHandles();
      Iterator<String> iterator = allWindowHandles.iterator();

      // Here we will check if child window has other child windows and will fetch the heading of the child window
      while (iterator.hasNext()) {
          String ChildWindow = iterator.next();
              if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
              driver.switchTo().window(ChildWindow);
//              WebElement text = driver.findElement(By.xpath(xpath));
//               System.out.println("Heading of child window is " + text.getText());
          }

      }
	}
	
	public static void switchparent()
	{
		driver.switchTo().defaultContent();
	}
	public static void verytext(String exptext,String acttext,int i,int j) throws Exception
	{
		if(exptext.trim().equalsIgnoreCase(acttext.trim())) {
		//	setExcelFile(Homppg_CRO.Path_TestData+Homppg_CRO.File_TestData,Homppg_CRO.Sheetname);
			//setCellData("Pass "+acttext,i,j,Homppg_CRO.File_TestData);
			System.out.println("Pass");
		}
		else
		{
		//	setExcelFile(Homppg_CRO.Path_TestData+Homppg_CRO.File_TestData,Homppg_CRO.Sheetname);
			//setCellData("Fail "+acttext,i,j,Homppg_CRO.File_TestData);
			System.out.println("Fail");
		}
		
		
	}
	
	
	public static String getcurrentpage()
	{
		return driver.getCurrentUrl();
	}
	
	public static void closebrowser()
	{
		driver.close();
	}
	public static void mouseHover(WebElement tgt) {
		try {
			Actions act=new Actions(driver);
			act.moveToElement(tgt);
			act.build().perform();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void scrollTillElement(String xpath)
	{
		try {
			//waitforelement(xpath,30);
			//driver.findElement(xpath).click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].scrollIntoView(true)", xpath);
			js.executeScript("window.scrollBy(0,500)","");
			
		}
		catch(Exception e) {
			System.out.print("");
				e.printStackTrace();
			
		}
		
	}
	
	public static String getfirstletterword(String data)
	{
		String[] spltdata = data.split("");
		
		return spltdata[0];
	}
	
	public static void waitForLoaderToDisMiss2(WebDriver driver) {
		try {
			new WebDriverWait(driver, 100).until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("(//img[@alt='Loader'])[1]"))));
			}catch (Exception e) {
				System.out.println("Loader does not exist");
			}
		}
	
	public static void waitForLoaderToDisMiss(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 170);
			new WebDriverWait(driver, 150);
			wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@src='/static/images/store/3/loader/Loader-GIF-Animation.gif'] | //*[@src='/static/images/store/1/loader/Loader-GIF-Animation.gif']"), ""));
			
			
			
			}catch (Exception e) {
				System.out.println("Loader does not exist");
			}
	}
	public static void switchToFrame(String framename) {
  driver.switchTo().frame(framename);
  System.out.println("Enter into frame");
	}
	public static int getelementcount(String xpath)
	{
	List<WebElement> cnt = driver.findElements(By.xpath(xpath));
	System.out.println("actual item count is : " + cnt.size());
	return cnt.size();
		
	}
	
	public static String getAttributeText(String xpath,String name,int k) {
	    WebElement tempicon = driver.findElement(By.xpath("("+xpath+")["+k+"]"));
	    tempicon.click();
		String actualdata =tempicon.getAttribute(name);
		System.out.println("actualdata "+actualdata);
		return actualdata;
	}
	
	public static void defaultcontent() {
		driver.switchTo().defaultContent();
		}
	
	public static void cartimagevalidation(String actualdata) {
		 
		String cartsrc=driver.findElement(By.xpath("//img[@alt='Reference Image']")).getAttribute("src");
    System.out.println("Expected Datab  " + cartsrc);  
    if(actualdata.trim().equalsIgnoreCase(cartsrc.trim())) {
 // 	  Utility.setExcelFile(Path_TestData + File_TestData,"Input");
  //	  Utility.setCellData1("Pass",j,3,File_TestData);
  	 System.out.println("test" + "pass"); 
  	 
    }

	else {
	
		System.out.println("test" + "Fail");
		//Utility.setCellData(actualdata, timeInterval, Timeinsec, cartsrc);
	} 
	
	}
	
	public static void elementexists(String xpath,int i,int j,String acttext) throws Exception
	{
		try {
			driver.findElement(By.xpath(xpath));
			//setExcelFile(NewPDP.Path_TestData+NewPDP.File_TestData,NewPDP.Sheetname);
			//setCellData("Pass "+acttext,i,j,NewPDP.File_TestData);
			System.out.println("Pass");
			//pass
		}
		catch(Exception e)

	{
			 
		//	setExcelFile(NewPDP.Path_TestData+Homppg_CRO.File_TestData,NewPDP.Sheetname);
			//setCellData("NewPDP "+acttext,i,j,NewPDP.File_TestData);
			System.out.println("Fail");
			
	}
	}
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

//                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
      //       JOptionPane.showConfirmDialog(null, "takesnapshot");

    }

	//---excel methods
	public static void setCellData(String Result, int RowNum, int ColNum,String File_TestData) throws Exception {

		try {

			Row = ExcelWSheet.getRow(RowNum);

		//	Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
			Cell = Row.getCell(ColNum, xRow.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

			// Constant variables Test Data path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(OR.Path_TestData + File_TestData);

			ExcelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();

		} catch (Exception e) {

			throw (e);

		}
	}
	
	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}

	public static void setExcelFile(String Path, String SheetName) throws Exception {

		try {

			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e) {

			throw (e);

		}

	}
	

}



