package JavaLearning;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1= sc.next();
		String str2= sc.next();
		System.out.println(str1);
		System.out.println(str2);
		char arrStr1[] = str1.replaceAll("[//s]", "").toCharArray();
		char arrStr2[] = str2.replaceAll("[//s]", "").toCharArray();
		Arrays.sort(arrStr1);
		Arrays.sort(arrStr2);
		String sortedString1 = new String(arrStr1);
		String sortedString2 = new String(arrStr2);
		if(sortedString1.equalsIgnoreCase(sortedString2)){
			System.out.println("Anagrams");
		}
			
		else{
			System.out.println("Not Anagrams");
		}
			
		
		
		
	}
}
