package JavaLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Array {

	
	

		

		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        String[] unsorted = new String[n];
		        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
		            unsorted[unsorted_i] = in.next();
		        }
		        // your code goes here
		        ArrayList<Long> arr = new ArrayList();
		         for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
		            arr.add( Long.parseLong(unsorted[unsorted_i])  );
		        }
		        Collections.sort(arr);
		        Iterator<Long> it = arr.iterator();
		        while(it.hasNext()){
		            System.out.println(it.next());
		        }
		    }

}

