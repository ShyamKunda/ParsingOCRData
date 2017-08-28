package JavaLearning;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
	
	public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        // Write your code here.
			String[] allTokens = input.split("[ !,?._'@]+");
			System.out.println(allTokens.length);
			for(String x : allTokens){
				System.out.println(x);
			}
	        scan.close();

	}
	
}
