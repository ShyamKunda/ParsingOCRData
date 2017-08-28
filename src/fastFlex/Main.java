package fastFlex;

import java.io.IOException;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException{
		//ReadingData newData = new ReadingData();
//		//Hashtable<String,String> outputTable = newData.getLines();

//		for (String s : words){
//        	Pattern p = Pattern.compile("\\|[0-9|]*");
//        	Matcher m = p.matcher(s);
//            System.out.println(m.replaceAll(" ").replaceAll("~", ""));
//        	//System.out.println(s);
//        }
//		userInterface window = new userInterface();
//		window.window(outputTable);
		userInterfaceNew window = new userInterfaceNew();
		window.listenToActions();
	}
}
