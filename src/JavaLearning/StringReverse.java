package JavaLearning;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String outStr = "";
		char arr[] = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			outStr = outStr + arr[i];
		}
		System.out.println(outStr);
		//if(str.equalsIgnoreCase(outStr))
		//String R = new StringBuilder(A).reverse().toString();
	}
}
