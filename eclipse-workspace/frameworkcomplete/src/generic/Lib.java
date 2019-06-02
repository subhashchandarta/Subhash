package generic;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib implements IAutoConstant{
	
	public static Workbook wb;
	
	public static String getProperty(String CONFIG_PATH, String key) throws FileNotFoundException, IOException
	{
		String property="";
		Properties prop = new Properties();
		prop.load(new FileInputStream(CONFIG_PATH));
		property = prop.getProperty(key);
		return property;
	}
	
	public static int getRowCount(String EXCEL_PATH, String sheet) throws EncryptedDocumentException, FileNotFoundException, IOException, InvalidFormatException
	{
		int rowCount = 0;
		wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
	
	public static String getCellValue(String EXCEL_PATH, String sheet, int row, int column) throws EncryptedDocumentException, FileNotFoundException, IOException, InvalidFormatException
	{
		String value="";
		wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		value = wb.getSheet(sheet).getRow(row).getCell(column).toString();
		return value;
	}
}
