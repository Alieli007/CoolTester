package CommonMethods;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class WrapClass {
	
	
	public static void click(WebElement webUI){
		webUI.click();
		 
	 }
	
	public static void sendKeys(WebElement webUI,String TextToSend){
		webUI.sendKeys(TextToSend);
		 
	 }
	
	public static String getText(WebElement webUI){
		return webUI.getText();
		 
	 }
	
	public static boolean verifyelementdisplayed(WebElement webUI){
		return webUI.isDisplayed();
		 
	 }

	
	public static void takescreenshot(WebDriver webdriver, String testCaseName){
		
		//toma el screenshot de la pagina sin formato
		File scrFile= ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		//Establecer ruta es guardar el screenshot.
		String screenshotpath= "./test-output/)executioResults)";
		//creamos el folder usando ruta especificada.
		
		FileHandler.createDir(new File(screenshotpath)); 
		try {
			FileHandler.copy(scrFile, new File(screenshotpath + File.separatorChar + testCaseName + ".png" ));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//toma el screenshot de la pagina sin formato
		 
	 }
	
	public static String getJsonValue(String jsonfile, String jsonkey){
		
		//
		 
	
		try {
			// se busca la ruta del archivo de las variables globales
			InputStream inputstream = new FileInputStream(GlobalVariables.EXT_DATA +jsonfile +".json" );
			JSONObject jsonObject= new JSONObject(new JSONTokener(inputstream));
			
			// leer datos.
			String JsonValue= jsonObject.getJSONObject(jsonfile).getString(jsonkey);
			
			return JsonValue;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		 
		
	 }
	
	public static String getcellData(String excelname, int row, int column){
		
		//
		 
	
		try {
			// se busca la ruta del archivo de las variables globales
			
			FileInputStream fis=new FileInputStream(GlobalVariables.EXT_DATA +excelname +".xlsx" );
			// consturir xlsx como objeto java.
			
			Workbook wb= new XSSFWorkbook(fis);
			Sheet Sheet = wb.getSheetAt(0);
			Row rowobj= Sheet.getRow(row);
			Cell cell= rowobj.getCell(column);
			String value= cell.getStringCellValue();
			return value;
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		 
		
	 }

}
