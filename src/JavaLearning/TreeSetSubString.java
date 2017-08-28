package JavaLearning;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetSubString {
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        TreeSet ts = new TreeSet();
	        for(int i=0;i<s.length()-k+1;i++){
	            String str = s.substring(i, k+i);
	            System.out.println(str);
	            ts.add(str);
	        }
	        System.out.println("==========");
	        Iterator<String> itr = ts.iterator();
	        while( itr.hasNext() ){
	            System.out.println(itr.next());
	        }
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        return smallest + "\n" + largest;
	    }

	    public static void main(String[] args) {
	   
	    	
	        System.out.println(getSmallestAndLargest("welcometojava", 3));
	    }

}
