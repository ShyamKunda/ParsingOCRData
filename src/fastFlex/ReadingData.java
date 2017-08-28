package fastFlex;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 
/**
 * A dirty simple program that reads an Excel file.
 * @author www.codejava.net
 *
 */
public class ReadingData {
	
	private Workbook workbook;
	private int index;
	private String bankName;
	private String accountName;
	private String openingBalance;
	private boolean blnAcctNum = true;
	private boolean blnOpenBalance=true;
	private boolean blnClosingBalance=true;
	private String closingBalance;
	private boolean blnTotalDeposits=true;

	public Hashtable<String,String> getLines(String excelFilePath) throws IOException {
		Hashtable<String,String> outputTable=new Hashtable<String,String>();  
		    
		long startTime = System.currentTimeMillis();
		Pattern p ;
    	Matcher m ;
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));         
        workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Row row = firstSheet.getRow(1);
        String data = row.getCell(4).getStringCellValue();
        //StringBuilder data=new StringBuilder(row.getCell(4).getStringCellValue());  
//        System.out.println(data);
//        String sb = "Bank|105|157~of|269|64~America.|341|435;P.O.|120|52~Box|180|49~15284|238|74;";
        String[] words = data.split(";");
        p = Pattern.compile("\\|[0-9|]*[~;]");
    	m = p.matcher(data);
    	String wholeString = m.replaceAll(" ").toUpperCase();
    	if(wholeString.contains("BANK OF AMERICA")){
    		bankName = "Bank of America";
    		System.out.print("----------Field 1------: ");
    		System.out.println("Bank Name : Bank of America");
    		outputTable.put("bankName", "BANK OF AMERICA");
    	}
       
       int x = 1;
       for (String s : words){
        	p = Pattern.compile("\\|[0-9|]*");
        	m = p.matcher(s);
            //System.out.println(m.replaceAll(" ").replaceAll("~", ""));
        	//System.out.println(s);
        	String line = m.replaceAll(" ").replaceAll("~", "");
        	//System.out.println(line);
        	if(blnAcctNum ){
        	index = line.indexOf("Account number");
        	if(index>=0){
        		System.out.print("----------Field 6------: ");
        		accountName = line.substring(index);
        		System.out.println("Account number: " + accountName.split(":")[1] );
        		outputTable.put("accountNumber", accountName.split(":")[1]);
        		blnAcctNum = false;
        		continue;
        	}}
        	if(blnOpenBalance){ 
        	index =  line.indexOf("Beginning balance");
        	if(index>=0){
        		System.out.print("----------Field 8------: ");
        		int subIndex = line.indexOf("$", index);
        		openingBalance = line.substring(subIndex+1);
        		System.out.println("openingBalance: " + openingBalance.split(" ")[0] );
        		outputTable.put("beginningBalance",openingBalance.split(" ")[0]);
        		blnOpenBalance = false;
        		continue;
        		
        	}}
        	
        	if(blnClosingBalance){ 
            	index = line.indexOf("Ending balance");
            	if(index>=0){
            		System.out.print("----------Field 9------: ");
            		int subIndex = line.indexOf("$", index);
            		closingBalance = line.substring(subIndex+1);
            		System.out.println("closingBalance: " + closingBalance.split(" ")[0] );
            		outputTable.put("closingBalance", closingBalance.split(" ")[0]);
            		blnClosingBalance = false;
            		continue;
            	}} 
        	if(blnTotalDeposits){ 
            	index =  line.indexOf("Deposits and other credits");
            	if(index>=0){
            		System.out.print("----------Field 10-----: ");
            		System.out.println("Total Deposits: " + line.split(" ")[4] );
            		outputTable.put("totalDeposits", line.split(" ")[4]);
            		blnTotalDeposits = false;
            		continue;
            	}}
        	
        	
        }       
       
        long endTime = System.currentTimeMillis();
        System.out.println("Took "+(endTime - startTime) + " ms");
        return outputTable ;
	}
 
}

//Iterator<Row> iterator = firstSheet.iterator();
//
//while (iterator.hasNext()) {
// Row nextRow = iterator.next();
// Iterator<Cell> cellIterator = nextRow.cellIterator();
//  
// while (cellIterator.hasNext()) {
//     Cell cell = cellIterator.next();
//      
//             System.out.print(cell.getStringCellValue());
//
//     System.out.print(" - ");
// }
// System.out.println();
//}
//String[] a= {"tube is", "are", "fun"};
//System.out.println(Arrays.asList(a).contains(".*tube.*"));
//workbook.close();
//inputStream.close();
