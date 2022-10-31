package Reusable_methods;


//package TestCases;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googlepagespdtest  extends Reusable{
	private static MissingCellPolicy xRow;
	public static WebDriver driver = null;
//	public static final String Path_TestData = System.getProperty("user.dir");
	public static final String Path_TestData = "D:\\Pagesped_v4\\";
	//public static final String Path_TestData = "F:\\Pagesped_v4\\";
	
//Global path>>	//D:\Pagesped_v4
	//D:\\SpeedTest\\
	//public static final String Path_TestData = "E:\\Speedtest\\";
	public static final String File_TestData = "Input.xlsx";
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static String MobileFID ;
	private static String MobileLCP ;
	private static String MobileCLS ;
	private static String MobileScore;
	private static String DesktopScore ;
	private static String DesktopFID ;
	private static String DesktopLCP ;
	private static String DesktopCLS;
	private static String DesktopFID1;
	private static String DesktopFID2;
	private static String DesktopFID3;
	private static String DesktopFID4;
	private static String DesktopFID5;
	private static String DesktopFID6;
	private static String DesktopFID7;
	private static String DesktopFID8;
	
	private static String  DesktopCLS1;
	private static String DesktopCLS2;
	private static String DesktopCLS3;
	private static String DesktopCLS4;
	private static String DesktopCLS5;
	private static String DesktopCLS6;
	private static String DesktopCLS7;
	private static String DesktopCLS8;
	private static String DesktopCLS9;
	
	
	private static String DesktopLCP1;
	private static String DesktopLCP2;
	private static String DesktopLCP3;
	private static String DesktopLCP4 ;
	private static String DesktopLCP5;
	private static String DesktopLCP6;
	private static String DesktopLCP7;
	private static String DesktopLCP8;
	private static String DesktopLCP9;
	
	private static String DesktopFCP1;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		String currentDirectory = "D:\\SpeedTest";
		//String currentDirectory = "F:\\Speedtest";
		System.out.println("data "+currentDirectory);
		System.setOut(new PrintStream(new FileOutputStream(currentDirectory+"\\consolelog.txt")));

		
//		setExcelFile(Path_TestData + File_TestData, "Sheet1");
//		System.out.println(Path_TestData + File_TestData);
////		setCellData("abc1", 3, 3);
//		String da = "'data1";
//		System.out.println(da);
//		setCellData(da, 3, 3);
	   System.setProperty("webdriver.chrome.driver", currentDirectory+"\\chromedriver.exe\\");
	   ChromeOptions options = new ChromeOptions();
	     options.addArguments(new String[] { "--test-type" });
	      options.setHeadless(true); 
	      WebDriver driver = new ChromeDriver(options);
	 //  WebDriver driver = new ChromeDriver();
	  // driver.manage().window().maximize();
	    //Headless
//	   ChromeOptions options = new ChromeOptions();
//         options.addArguments(new String[] { "--test-type" });
//          options.setHeadless(true); 
//          WebDriver driver = new ChromeDriver(options);
//----------*////
	   
	//    HtmlUnitDriver driver = new HtmlUnitDriver();
	//	HtmlUnitDriver driver = new HtmlUnitDriver();
	//	  WebDriver driver = new ChromeDriver();
//		   ChromeOptions options = new ChromeOptions();
//		   options.addArguments("enable-features=NetworkServiceInProcess");
		   //driver = new ChromeDriver(options);
		//  
//		    
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   WebDriverWait wait = new WebDriverWait(driver, 80);
		   
		//	
		   setExcelFile(Path_TestData + File_TestData, "Report");
		   String getRowstrcount = getCellData(2, 11);
		   System.out.println("getRowstrcount "+getRowstrcount);
		   int getRowstrcountint = Integer.valueOf(getRowstrcount);

		   setExcelFile(Path_TestData + File_TestData, "Report");
		   String getRowcount = getCellData(2, 12);
		   System.out.println("getRowcount "+getRowcount);
		   int getRowcountint = Integer.valueOf(getRowcount);
		   
		   
			try {
           			long time=System.currentTimeMillis();	
				for (int i=getRowstrcountint;i<=getRowcountint;i++ )
					//FileOutputStream. close();5551
				{	
			//FileOutputStream. close();	
//					setExcelFile(Path_TestData + File_TestData, "Sheet1");
////					String getRun = getCellData(i, 0);

//					if (getRun.trim().equalsIgnoreCase("Yes")) {
			try {
				setExcelFile(Path_TestData + File_TestData, "Report");
			//	driver.navigate().to("getexcelurl");
				System.out.println("Browser launched");
				driver.get("https://pagespeed.web.dev/?utm_source=psi&utm_medium=redirect");
				Thread.sleep(3000);
				System.out.println("Browser launched succesfully");
				String getexcelurl = getCellData(i, 1);
				System.out.println(i  +  getexcelurl );
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//c-wiz[contains(@style, 'visibility: visible')]//input[@placeholder='Enter a web page URL']")));
				WebElement cc=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//c-wiz[not(contains(@style, 'visibility: invisible'))]//input[@placeholder='Enter a web page URL']")));
			//	cc.click();
				cc.sendKeys(getexcelurl.trim());
				Thread.sleep(1000);
				driver.findElement(By.xpath("//c-wiz[not(contains(@style, 'visibility: invisible'))]//span[text()='Analyze']")).click();
			//	JOptionPane.showConfirmDialog(null, null);
				Thread.sleep(1000);
			//	driver.findElement(By.xpath("(//span[text()='Ok, Got it.'])[2]")).click();
				//driver.findElement(By.xpath("")).click());
				//JOptionPane.showConfirmDialog(null, null);
				//JOptionPane.showConfirmDialog(null, null);)
			
				Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='mobile_tab']//div[text()='Performance']")));
				//JOptionPane.showConfirmDialog(null, null);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='lh-gauge__percentage'])[1]")));
				//Reusable.scrollTillElement("(//div[@class='lh-gauge__percentage'])[1]");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				Reusable.takeSnapShot(driver, currentDirectory+"\\Screenshot\\mobiletab"+i+".png");
				
				try {
				js.executeScript("window.scrollBy(0,350)", "(//*[@class='lh-gauge__percentage'])[3]");
			//scrollTillElement(("(//div[@class='lh-gauge__percentage'])[1]"));
				MobileScore = driver.findElement(By.xpath("//div[@aria-labelledby='mobile_tab']//div[@class='lh-gauge__percentage']")).getText();
				}catch(Exception e) {
					System.out.println("Exception is "+e);
				}

				try {
				js.executeScript("window.scrollBy(0,350)", "(//*[@class='lh-gauge__percentage'])[1]");
			//scrollTillElement(("(//div[@class='lh-gauge__percentage'])[1]"));
				MobileScore = driver.findElement(By.xpath("(//*[@class='lh-gauge__percentage'])[1]")).getText();
				}catch(Exception e) {
					System.out.println("Exception is "+e);
				}
				
				try {
					//Xpath
		//(//div[@aria-labelledby='desktop_tab']//div[@class='jWlLfe']//div[@role='tabpanel'][not(@style)]//div[@class="Zeyolc"]//span/span)[1]		
				setCellData(MobileScore, i, 2);
				// JOptionPane.showConfirmDialog(null, null);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First Input Delay (FID)'])[1]/following::span[1]/span")));
				Thread.sleep(1000);
				 MobileFID = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First Input Delay (FID)'])[1]/following::span[1]/span")).getText();
				 setCellData(MobileFID, i, 3);
				 System.out.println("mobFID is " + MobileFID);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Largest Contentful Paint (LCP)'])[1]/following::span[1]/span")));
				 Thread.sleep(1000);
				 MobileLCP = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Largest Contentful Paint (LCP)'])[1]/following::span[1]/span")).getText();
                 setCellData(MobileLCP , i, 4);
                 System.out.println("mobLcp is " + MobileLCP);
                // JOptionPane.showConfirmDialog(null, "wait");
                 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cumulative Layout Shift (CLS)'])[1]/following::span[1]/span")));
                 Thread.sleep(1000);
                 MobileCLS = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cumulative Layout Shift (CLS)'])[1]/following::span[1]/span")).getText();
                 setCellData(MobileCLS, i, 5);
                 System.out.println("mobcls is " +  MobileCLS);
				}catch(Exception e) {
					System.out.println("Exception is "+e);	
				}
                 //---Desktop tab------------------------------
          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='desktop_tab']"))) ;
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id='desktop_tab']")).click();
          wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//*[text()='Running performance analysis'])[1]")));
//          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='First Input Delay (FID)'])[3]")));
          try {
				js.executeScript("window.scrollBy(0,350)", "(//div[@class='lh-gauge__percentage'])[2]");
		//	scrollTillElement(("(//div[@class='lh-gauge__percentage'])[2]"));
				DesktopScore = driver.findElement(By.xpath("(//div[@class='lh-gauge__percentage'])[2]")).getText();
				 setCellData(DesktopScore , i, 6);
              
				}catch(Exception e) {
					System.out.println("Exception is "+e);
				}
				Reusable.takeSnapShot(driver, currentDirectory+"\\Screenshot\\Desktoptab"+i+".png");
				 try {
//						//js.executeScript("window.scrollBy(0,350)", "(//div[@class='lh-gauge__svg-wrapper'])[2]");
//					scrollTillElement(("(//div[@class='lh-gauge__percentage'])[2]"));
//						DesktopScore = driver.findElement(By.xpath("(//div[@class='lh-gauge__svg-wrapper'])[2]")).getText();
//						 setCellData(DesktopScore , i, 6);
//		              
//						}catch(Exception e) {
//							System.out.println("Exception is "+e);
//						}
//				try {
//				//JOptionPane.showConfirmDialog(null, null);
//				js.executeScript("window.scrollBy(0,550)", "(//*[@class='Ykn2A LR2yK'])[3]");
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First Input Delay (FID)'])[3]/following::span[3]")));
////				WebElement fidfld = driver.findElement(By.xpath("(//*[@class='Ykn2A LR2yK'])[3]|(//*[@class='Ykn2A LR2yK'])[2]| (.//*[normalize-space(text()) and normalize-space(.)='First Input Delay (FID)'])[7]/following::span[3]"));
//				try {
//				WebElement fidfld1 = driver.findElement(By.xpath("(//*[@class='Ykn2A LR2yK'])[3]"));
//				 DesktopFID1 = fidfld1.getText();
//				}catch(Exception e) 
//				{System.out.println("Exception is "+e);
//				}
//				try {
//				WebElement fidfld2 = driver.findElement(By.xpath("(//*[@class='Ykn2A LR2yK'])[2]"));
//				 DesktopFID2 = fidfld2.getText();
//				}catch(Exception e) {
//					System.out.println("Exception is "+e);
//				}
//				try {
//				WebElement fidfld3 = driver.findElement(By.xpath("(//span[@class='Ikrkjc VvwRrf AcNWOb'])[2]"));
//				 DesktopFID3 = fidfld3.getText();
//				}catch(Exception e) {
//					System.out.println("Exception is "+e);	
//				}
//				try {
//				WebElement fidfld4 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First Input Delay (FID)'])[7]/following::span[3]"));
//				DesktopFID4 = fidfld4.getText();
//				}catch(Exception e) {
//					System.out.println("Exception is "+e);
//				}
//				if(!DesktopFID1.equalsIgnoreCase("")) {
//				 setCellData( DesktopFID1.replace("First Input Delay (FID)", ""), i, 7);
//				 System.out.println(" DesktopFID1 " +   DesktopFID1);	
//				}else if(!DesktopFID2.equalsIgnoreCase("")) {
//					 setCellData( DesktopFID2.replace("First Input Delay (FID)", ""), i, 7);
//					 System.out.println(" DesktopFID2 " +   DesktopFID2);	
//				}
//				else if(!DesktopFID3.equalsIgnoreCase("")) {
//					 setCellData( DesktopFID3.replace("First Input Delay (FID)", ""), i, 7);
//					 System.out.println(" DesktopFID3 " +   DesktopFID3);	
//				}
//				else if(!DesktopFID4.equalsIgnoreCase("")) {
//					 setCellData( DesktopFID4.replace("First Input Delay (FID)", ""), i, 7);
//					 System.out.println(" DesktopFID4 " +   DesktopFID4);	
//				}else {
//					System.out.println("no element is available with data for FID");
//				}
//-------FID				
	     try {
		//WebElement fidfld1 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[2]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[2]/div[2]/div[1]/span/span"));
	 WebElement fidfld1 = driver.findElement(By.xpath("(//div[@aria-labelledby='desktop_tab']//a[.='First Input Delay (FID)']/following::span[1])[1]"));
		 DesktopFID1 = fidfld1.getText();
		    }catch(Exception e) 
			{
		    	DesktopFID1 = "";
		    	System.out.println("DesktopFID1 Exception is "+e);}


	     try {
		 WebElement fidfld2 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[3]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[2]/div[2]/div[1]/span/span"));
		 DesktopFID2 = fidfld2.getText();
		    }catch(Exception e) 
			{
		    	DesktopFID2 = "";
		    	System.out.println("DesktopFID2 Exception is "+e);}

	     try {
		 WebElement fidfld3 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[3]/span/div/div[3]/div/div[2]/div[2]/div[1]/span"));
		 DesktopFID3 = fidfld3.getText();
		    }catch(Exception e) 
			{
		    	DesktopFID3 = "";
		    	System.out.println("DesktopFID3 Exception is "+e);}

	     try {
		 WebElement fidfld4 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[3]/span/div/div[3]/div/div[2]/div[2]/div[1]/span/span"));
		 DesktopFID4 = fidfld4.getText();
		    }catch(Exception e) 
			{
		    	DesktopFID4 = "";
		    	System.out.println("DesktopFID4 Exception is "+e);}

	     try {
		 WebElement fidfld5 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[2]/div[2]/div[1]/span/span"));
		 DesktopFID5 = fidfld5.getText();
		    }catch(Exception e) 
			{
		    	DesktopFID5 = "";
		    	System.out.println("DesktopFID5 Exception is "+e);}

	     try {
		 WebElement fidfld6 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div[2]/div[2]/div/div[2]/span/div/div[3]/div/div[2]/div[2]/div[1]/span/span"));
		 DesktopFID6 = fidfld6.getText();
		    }catch(Exception e) 
			{
		    	DesktopFID6 = "";
		    	System.out.println("DesktopFID6 Exception is "+e);}

	     try {
		 WebElement fidfld7 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[2]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div[2]/div[2]/div/div[3]/span/div/div[3]/div/div[2]/div[2]/div[1]/span/span"));
		 DesktopFID7 = fidfld7.getText();
		 System.out.println("DesktopFID7 actvalue is "+DesktopFID7);
		    }catch(Exception e) 
			{
		    	
		    	DesktopFID7 = "";
		    	System.out.println("DesktopFID7 Exception is "+e);}
	     try {
			 WebElement fidfld8 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[2]/div[2]/div/div[2]/div[3]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[2]/div[2]/div[1]/span/span"));
			 DesktopFID8 = fidfld8.getText();
			 System.out.println("DesktopFID7 actvalue is "+ DesktopFID8);
			    }catch(Exception e) 
				{
			    	
			    	DesktopFID8 = "";
			    	System.out.println("DesktopFID7 Exception is "+e);}

			if(!DesktopFID1.equalsIgnoreCase("")) {
		 setCellData( DesktopFID1.trim(), i, 7);
		 System.out.println(" DesktopFID1 " +   DesktopFID1);	
		}else if(!DesktopFID2.equalsIgnoreCase("")) {
			 setCellData( DesktopFID2.trim(), i, 7);
			 System.out.println(" DesktopFID2 " +   DesktopFID2);	
		}
		else if(!DesktopFID3.equalsIgnoreCase("")) {
			 setCellData( DesktopFID3.trim(), i, 7);
			 System.out.println(" DesktopFID3 " +   DesktopFID3);	
		}
		else if(!DesktopFID4.equalsIgnoreCase("")) {
			 setCellData( DesktopFID4.trim(), i, 7);
			 System.out.println(" DesktopFID4 " +   DesktopFID4);	
		}else if(!DesktopFID5.equalsIgnoreCase("")) {
			 setCellData( DesktopFID5.trim(), i, 7);
			 System.out.println(" DesktopFID5 " +   DesktopFID5);	
		}else if(!DesktopFID6.equalsIgnoreCase("")) {
			 setCellData( DesktopFID6.trim(), i, 7);
			 System.out.println(" DesktopFID6 " +   DesktopFID6);	
		}else if(!DesktopFID7.equalsIgnoreCase("")) {
			 setCellData( DesktopFID7.trim(), i, 7);
			 System.out.println(" DesktopFID7 " +   DesktopFID7);	
		}else if(!DesktopFID8.equalsIgnoreCase("")) {
			 setCellData( DesktopFID8.trim(), i, 7);
			 System.out.println(" DesktopFID8 " +   DesktopFID8);	
		}
		else {
			System.out.println("no element is available with data for FID");
		}
					
//----LCP
		     try {
				 WebElement LCPfld1 = driver.findElement(By.xpath("(//div[@aria-labelledby='desktop_tab']//a[.='Largest Contentful Paint (LCP)']/following::span[1])[1]"));
			//	WebElement LCPfld1 = driver.findElement(By.xpath("(//div[@aria-labelledby='desktop_tab']//div[@class='jWlLfe']//div[@aria-labelledby='origin_tab']//a[.='Largest Contentful Paint (LCP)']/../following-sibling::div[@class='Zeyolc']/div/span/span)[1]"));
				 DesktopLCP1 = LCPfld1.getText();
				    }catch(Exception e) 
					{
				    	 DesktopLCP1 = "";
				    	System.out.println(" DesktopLCP1 Exception is "+e);}


			     try {
				 WebElement LCPfld2 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[5]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[3]/div[2]/div[1]/span/span"));
				 DesktopLCP2 = LCPfld2.getText();
				    }catch(Exception e) 
					{
				    	 DesktopLCP2 = "";
				    	System.out.println(" DesktopLCP2 Exception is "+e);}

			     try {
				 WebElement LCPfld3 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div[2]/div[2]/div/div[3]/span/div/div[3]/div/div[3]/div[2]/div[1]/span/span"));
				 DesktopLCP3 =  LCPfld3.getText();
				    }catch(Exception e) 
					{
				    	DesktopLCP3 = "";
				    	System.out.println("DesktopLCP3 Exception is "+e);}

			     try {
				 WebElement LCPfld4 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[3]/span/div/div[3]/div/div[3]/div[2]/div[1]/span/span"));
				 DesktopLCP4 = LCPfld4.getText();
				    }catch(Exception e) 
					{
				    	 DesktopLCP4 = "";
				    	System.out.println(" DesktopLCP4 Exception is "+e);}

			     try {
				 WebElement LCPfld5 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[3]/div[2]/div[1]/span/span"));
				 DesktopLCP5 =  LCPfld5.getText();
				    }catch(Exception e) 
					{
				    	 DesktopLCP5 = "";
				    	System.out.println(" DesktopLCP5 Exception is "+e);}

			     try {
				 WebElement LCPfld6 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div[2]/div[2]/div/div[2]/span/div/div[3]/div/div[3]/div[2]/div[1]/span/span"));
				 DesktopLCP6 = LCPfld6.getText();
				    }catch(Exception e) 
					{
				    	 DesktopLCP6 = "";
				    	System.out.println(" DesktopLCP6 Exception is "+e);}

			     try {
				 WebElement LCPfld7 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[2]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div[2]/div[2]/div/div[3]/span/div/div[3]/div/div[3]/div[2]/div[1]/span/span"));
				 DesktopLCP7 = LCPfld7.getText();
				 System.out.println("DesktopLCP7 actvalue is "+DesktopLCP7);
				    }catch(Exception e) 
					{
				    	DesktopLCP7 = "";
				    	System.out.println("DesktopLCP7 Exception is "+e);}
			     try {
					 WebElement LCPfld8 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[2]/div[2]/div/div[2]/div[3]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[3]/div[2]/div[1]/span/span"));
					 DesktopLCP8 = LCPfld8.getText();
					 System.out.println("DesktopLCP8 actvalue is "+DesktopLCP8);
					    }catch(Exception e) 
						{
					    	DesktopLCP8 = "";
					    	System.out.println("DesktopLCP8 Exception is "+e);}
			     
			     try {
					 WebElement LCPfld9 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Largest Contentful Paint (LCP)'])[3]/following::span[3]"));
					 DesktopLCP9 = LCPfld9.getText();
					 System.out.println("DesktopLCP9 actvalue is "+DesktopLCP9);
					    }catch(Exception e) 
						{
					    	DesktopLCP9 = "";
					    	System.out.println("DesktopLCP9 Exception is "+e);}


					if(!DesktopLCP1.equalsIgnoreCase("")) {
				 setCellData( DesktopLCP1.trim(), i, 8);
				 System.out.println(" DesktopLCP1 " +  DesktopLCP1);	
				}else if(!DesktopLCP2.equalsIgnoreCase("")) {
					 setCellData( DesktopLCP2.trim(), i, 8);
					 System.out.println(" DesktopLCP2 " +   DesktopLCP2);	
				}
				else if(!DesktopLCP3.equalsIgnoreCase("")) {
					 setCellData(DesktopLCP3.trim(), i, 8);
					 System.out.println(" DesktopLCP3 " +   DesktopLCP3);	
				}
				else if(!DesktopLCP4.equalsIgnoreCase("")) {
					 setCellData( DesktopLCP4.trim(), i, 8);
					 System.out.println(" DesktopLCP4 " +   DesktopLCP4);	
				}else if(!DesktopLCP5.equalsIgnoreCase("")) {
					 setCellData( DesktopLCP5.trim(), i, 8);
					 System.out.println(" DesktopLCP5 " +  DesktopLCP5);	
				}else if(!DesktopLCP6.equalsIgnoreCase("")) {
					 setCellData( DesktopLCP6.trim(), i, 8);
					 System.out.println(" DesktopLCP6 " +   DesktopLCP6);	
				}else if(!DesktopLCP7.equalsIgnoreCase("")) {
					 setCellData( DesktopLCP7.trim(), i, 8);
					 System.out.println(" DesktopLCP7 " +  DesktopLCP7);
				}else if(!DesktopLCP8.equalsIgnoreCase("")) {
					 setCellData( DesktopLCP8.trim(), i, 8);
					 System.out.println(" DesktopLCP8 " +  DesktopLCP8);
				}
				else if(!DesktopLCP9.equalsIgnoreCase("")) {
					 setCellData( DesktopLCP9.trim(), i, 8);
					 System.out.println(" DesktopLCP9 " +  DesktopLCP9);
				}
				else {
					System.out.println("no element is available with data for LCP");
				}
		
//--CLS
				     try {
						 WebElement CLSfld1 = driver.findElement(By.xpath("(//div[@aria-labelledby='desktop_tab']//a[.='Cumulative Layout Shift (CLS)']/following::span[2])[1]"));
						// WebElement CLSfld1 = driver.findElement(By.xpath("(//div[@aria-labelledby='desktop_tab']//div[@class='jWlLfe']//div[@aria-labelledby='origin_tab']//a[.='Cumulative Layout Shift (CLS)']/../following-sibling::div[@class='Zeyolc']/div/span/span)[1]"));
						    }catch(Exception e) 
							{
						    	DesktopCLS1 = "";
						    	System.out.println("DesktopCLS1 Exception is "+e);}


					     try {
						 WebElement CLSfld2 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[2]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[4]/div[2]/div[1]/span/span"));
						 DesktopCLS2 = CLSfld2.getText();
						    }catch(Exception e) 
							{
						    	DesktopCLS2 = "";
						    	System.out.println("DesktopCLS2 Exception is "+e);}

					     try {
						 WebElement CLSfld3 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[3]/span/div/div[3]/div/div[3]/div[2]/div[1]/span"));
						 DesktopCLS3 = CLSfld3.getText();
						    }catch(Exception e) 
							{
						    	DesktopCLS3 = "";
						    	System.out.println("DesktopCLS3 Exception is "+e);}

					     try {
						 WebElement CLSfld4 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[3]/span/div/div[3]/div/div[3]/div[2]/div[1]/span/span"));
						 DesktopCLS4 = CLSfld4.getText();
						    }catch(Exception e) 
							{
						    	DesktopCLS4 = "";
						    	System.out.println("DesktopCLS4 Exception is "+e);}

					     try {
						 WebElement CLSfld5 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[3]/div[2]/div[1]/span/span"));
						 DesktopCLS5 = CLSfld5.getText();
						    }catch(Exception e) 
							{
						    	DesktopCLS5 = "";
						    	System.out.println("DesktopCLS5 Exception is "+e);}

					     try {
						 WebElement CLSfld6 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[3]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div[2]/div[2]/div/div[2]/span/div/div[3]/div/div[3]/div[2]/div[1]/span/span"));
						 DesktopCLS6 = CLSfld6.getText();
						    }catch(Exception e) 
							{
						    	DesktopCLS6 = "";
						    	System.out.println("DesktopCLS6 Exception is "+e);}

					     try {
						 WebElement CLSfld7 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[2]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[4]/div[2]/div[1]/span/span"));
						 DesktopCLS7 = CLSfld7.getText();
						 System.out.println("DesktopCLS7 actvalue is "+DesktopCLS7);
						    }catch(Exception e) 
							{
						    	DesktopCLS7 = "";
						    	System.out.println("DesktopCLS7 Exception is "+e);}
					     
					     try {
							 WebElement CLSfld8 = driver.findElement(By.xpath("(//*[@class='Ykn2A R8R4sb'])[1] |//*[@id='yDmH0d']/c-wiz[2]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[4]/div[2]/div[1]/span/span"));
							 DesktopCLS8 = CLSfld8.getText();
							 System.out.println("DesktopCLS8 actvalue is "+DesktopCLS8);
							    }catch(Exception e) 
								{
							    	DesktopCLS8 = "";
							    	System.out.println("DesktopCLS8 Exception is "+e);}
					     try {
							 WebElement CLSfld9 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cumulative Layout Shift (CLS)'])[3]/following::span[3]"));
							 DesktopCLS9 = CLSfld9.getText();
							 System.out.println("DesktopCLS9 actvalue is "+DesktopCLS9);
							    }catch(Exception e) 
								{
							    	DesktopCLS9 = "";
							    	System.out.println("DesktopCLS9 Exception is "+e);}

							if(!DesktopCLS1.equalsIgnoreCase("")) {
						 setCellData( DesktopCLS1.trim(), i, 9);
						 System.out.println("DesktopCLS1 " +   DesktopFID1);	
						}else if(!DesktopCLS2.equalsIgnoreCase("")) {
							 setCellData( DesktopCLS2.trim(), i, 9);
							 System.out.println("  DesktopCLS2 " +    DesktopCLS2);	
						}
						else if(!DesktopCLS3.equalsIgnoreCase("")) {
							 setCellData( DesktopCLS3.trim(), i, 9);
							 System.out.println(" DesktopCLS3 " +   DesktopCLS3);	
						}
						else if(!DesktopCLS4.equalsIgnoreCase("")) {
							 setCellData( DesktopCLS4.trim(), i, 9);
							 System.out.println(" DesktopCLS4 " +   DesktopCLS4);	
						}else if(!DesktopCLS5.equalsIgnoreCase("")) {
							 setCellData( DesktopCLS5.trim(), i, 9);
							 System.out.println(" DesktopCLS5 " +   DesktopCLS5);	
						}else if(!DesktopCLS6.equalsIgnoreCase("")) {
							 setCellData( DesktopCLS6.trim(), i, 9);
							 System.out.println(" DesktopCLS6 " +  DesktopCLS6);	
						}else if(!DesktopCLS7.equalsIgnoreCase("")) {
							 setCellData( DesktopCLS7.trim(), i, 9);
							 System.out.println("DesktopCLS7 " +   DesktopCLS7);	
						}	 else if(!DesktopCLS8.equalsIgnoreCase("")) {
							 setCellData( DesktopCLS8.trim(), i, 9);
							 System.out.println("DesktopCLS8 " +   DesktopCLS8);	
				}
							
				 	 else if(!DesktopCLS9.equalsIgnoreCase("")) {
					 setCellData( DesktopCLS9.trim(), i, 9);
					 System.out.println("DesktopCLS9 " +   DesktopCLS9);	
		}
							
						else {
							System.out.println("no element is available with data for FID");
						}
					
			
	//FCP

//						     try {
//							//	 WebElement CLSfld1 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz[2]/div[2]/div/div[2]/div[4]/div[3]/span/c-wiz/div[1]/div[1]/div/div[2]/div/div[2]/span/div/div[3]/div/div[4]/div[2]/div[1]/span/span"));
//								 WebElement FCPfld1 = driver.findElement(By.xpath("(//div[@aria-labelledby='desktop_tab']//div[@class='jWlLfe']//div[@role='tabpanel'][not(@style)]//a[.='First Contentful Paint (FCP)']/../following-sibling::div[@class='Zeyolc']/div/span/span)[1]"));
//								 DesktopFCP1 = FCPfld1.getText();
//								    }catch(Exception e) 
//									{
//								    	DesktopFCP1 = "";
//								    	System.out.println("DesktopCLS1 Exception is "+e);}
//
//						     if(!DesktopFCP1.equalsIgnoreCase("")) {
//								 setCellData(  DesktopFCP1.trim(), i, 7);
//								 System.out.println("  DesktopFCP1 " +    DesktopFCP1);	
//						     }
//						     else {
//									System.out.println("no element is available with data for FCP");
//								}
//				setCellData( DesktopFID2.replace("First Input Delay (FID)", ""), i, 7);
//				}catch(Exception e) {
//					//throw (e);
//						System.out.println("Exception is "+e);
//				}
				 
				// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Largest Contentful Paint (LCP)'])[3]/following::span[3]")));
				//try {
				Thread.sleep(2000);
//				// DesktopLCP = driver.findElement(By.xpath("(//*[@class='GCCtZc'])[3]/div[@class='d8Sw5c'][3]")).getText();
				try {
//					Thread.sleep(2000);
//					if(!DesktopLCP.equalsIgnoreCase(""))
//					{
//		
//				DesktopLCP = driver.findElement(By.xpath("(//*[@class='Ykn2A YznLle'])[3]| (//*[@class='CI5NGd'])[7]")).getText();
//                
//				
//				setCellData(DesktopLCP.replace("Largest Contentful Paint (LCP)", "") , i, 8);
//                 System.out.println("DesktopLcp is " + DesktopLCP);
//                // JOptionPane.showConfirmDialog(null, "wait");
//				} else 
//				{
//					DesktopLCP = driver.findElement(By.xpath("(//*[@class='Ykn2A YznLle'])[3]")).getText();
//					setCellData(DesktopLCP.replace("Largest Contentful Paint (LCP)", "") , i, 8);
//	                 System.out.println("DesktopLcp is " + DesktopLCP);
//	           
//				}
//				
//				
//				
//				}catch(Exception e) {
//					System.out.println("Exception is "+e);
//				}
//				
//				
//				
//				
//               //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cumulative Layout Shift (CLS)'])[3]/following::span[3]")));
//              //   try {
//			//	DesktopCLS = driver.findElement(By.xpath("(//*[@class='GCCtZc'])[3]/div[@class='d8Sw5c'][4]")).getText();
//				try {
//					 Thread.sleep(3000);
//				DesktopCLS = driver.findElement(By.xpath("(//*[@class='Ykn2A YznLle'])[4] |//*[@class='Ykn2A YznLle']")).getText();
//                 Thread.sleep(3000);
//                if (!DesktopCLS.equalsIgnoreCase(""))
//                {
//                	setCellData(DesktopCLS.replace("Cumulative Layout Shift (CLS)", ""), i, 9);
//                 System.out.println("Desktopcls is " +  DesktopCLS); 
//                }else
//                {
//                	DesktopCLS = driver.findElement(By.xpath("(//*[@class='Ykn2A R8R4sb'])[4]| (//*[@class='Ykn2A R8R4sb'])[3]")).getText();
//                	setCellData(DesktopCLS.replace("Cumulative Layout Shift (CLS)", ""), i, 9);
//                    System.out.println("Desktopcls is " +  DesktopCLS); 
//                }
//                try {
//    				
//    				DesktopCLS = driver.findElement(By.xpath("(//*[@class='Ykn2A YznLle'])[5]")).getText();
//    				setCellData(DesktopCLS.replace("Cumulative Layout Shift (CLS)", ""), i, 9);
//                    System.out.println("Desktopcls is " +  DesktopCLS); 
//    				}catch(Exception e) {
//    					System.out.println("Exception is "+e);
//    				}

//    				try {
//    			
//    				DesktopScore = driver.findElement(By.xpath("(//div[@class='lh-gauge__percentage'])[2]")).getText();
//    				setCellData(DesktopScore, i, 6);
//    				Thread.sleep(5000);
//
					
    				}catch(Exception e) {}
                 
				}catch(Exception e) {
//				throw (e);
					System.out.println("Exception is "+e);
				}
			}catch(Exception e) {}
				System.out.println("TIme taken in secs: " + i  +" "+(System.currentTimeMillis()-time)/1000);
				System.out.println("speed test Terminated");
			//	System.out.println("Exception is "+e);
		//--------------------------------------------------------				
			}
				}catch(Exception e) {
					System.out.println("Exception is "+e);
//						
					}
		//	FileOutputStream. close();
		
						}
	

//		Thread.sleep(10000);
		
		///--launch url and verify price
		
		
		
		
		
		
	public static void waitForLoaderToDisMiss(WebDriver driver) {
		try {
		new WebDriverWait(driver, 50).until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='loading-mask' or @class='loader']"))));
		}catch (Exception e) {
			System.out.println("Big Loader does not exist");
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
	public static void waitForLoaderToDisMiss2(WebDriver driver) {
		try {
			new WebDriverWait(driver, 50).until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='fotorama__spinner fotorama__spinner--show']"))));
			}catch (Exception e) {
				System.out.println(" side Loader does not exist");
			}
		}
	
		public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {

			try {
				
				Row = ExcelWSheet.getRow(RowNum);
				Cell = Row.getCell(ColNum, xRow.RETURN_BLANK_AS_NULL);

			//	Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

				if (Cell == null) {

					Cell = Row.createCell(ColNum);

					Cell.setCellValue(Result);

				} else {

					Cell.setCellValue(Result);

				}
				
				

				// Constant variables Test Data path and Test Data file name

				FileOutputStream fileOut = new FileOutputStream(Path_TestData + File_TestData);

				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();

			} catch (Exception e) {

				throw (e);

			}

		}

		// This method is to read the test data from the Excel cell, in this we are
		// passing parameters as Row num and Col num

		public static String getCellData(int RowNum, int ColNum) throws Exception {

			try {

				Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

				String CellData = Cell.getStringCellValue();

				return CellData;

			} catch (Exception e) {

				return "";

			}

		}

		// This method is to set the File path and to open the Excel file, Pass Excel
		// Path and Sheetname as Arguments to this method

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

		}}





