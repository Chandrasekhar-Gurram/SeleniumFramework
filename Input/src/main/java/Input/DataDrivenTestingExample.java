package Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DataDrivenTestingExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		DataDrivenTestingExample obj=new DataDrivenTestingExample();
		//obj.creatingXlFile();
		obj.takingTheDataFromTheXLFile();

	}
	public void creatingXlFile() throws FileNotFoundException, IOException
	{
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet ws=wb.createSheet("FirstSheet");
		HSSFRow wr=ws.createRow(0);
		HSSFCell wc=wr.createCell(0);
		wc.setCellValue("Chandu");
		wb.write(new FileOutputStream("SimpleFile.xls"));
		wb.close();
	}
	public void takingTheDataFromTheXLFile() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\project training\\Input\\SimpleFile.xls");
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet ws=wb.getSheet("FirstSheet");
		HSSFRow wr=ws.getRow(0);
		HSSFCell wc=wr.getCell(0);
		String value=wc.getStringCellValue();
		System.out.println(value);
		wb.close();
	}

}
