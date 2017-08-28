package JavaLearning;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallengeSorting {

	public static int[] getIntegers(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of arr elements:");
		int length = scan.nextInt();
		int[] arr = new int[length];
		for(int i=0;i<length;i++){
			arr[i] = scan.nextInt();
		}
		
		return arr;
	}
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + "  ");
		}
		System.out.println("");
	}
	public static int[] sortIntegers(int[] arr){
		
		int[] newArr = Arrays.copyOf(arr, arr.length);
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length ;j++){
				if (arr[j]>arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			//printArray(arr);
		}
		return arr;
	}
	
	public static void main(String[] args){
		
		int[] arr = getIntegers() ;
		System.out.println("Input array");
		printArray(arr);
		System.out.println("output array after sorting");
		int[] newarr = sortIntegers(arr);
		printArray(arr);
		//printArray(sortIntegers(arr));
		
	}
}
