package niit.set3;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int numbers[] = new int[20];
		int n, search, flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to insert into an array: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+(i+1)+": ");
			numbers[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched in the array");
		search = sc.nextInt();		
		Arrays.sort(numbers);
		
		int lastIndex =(numbers.length); 
		int firstIndex = 0;
		int midIndex = (firstIndex+lastIndex)/2;
		
		while(firstIndex<=lastIndex) {
			if(numbers[midIndex]<search)
				firstIndex = midIndex+1;
			else if(numbers[midIndex]==search) {
				System.out.println("Element is found in the array");
				break;
			}
			else
				lastIndex = midIndex-1;
			midIndex = (firstIndex+lastIndex)/2;
		}
		if(firstIndex>lastIndex)
			System.out.println("Element is not found!");
	}

}
