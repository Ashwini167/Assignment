package niit.set3;

import java.util.Scanner;

public class SmalllestAndLargest {

	public static void main(String[] args) {
		int numbers[] = new int[20];
		int n,largest,smallest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+(i+1)+": ");
			numbers[i]=sc.nextInt();
		}
		largest = smallest = numbers[0];
		for(int i=0;i<n;i++) {
			if(numbers[i]<smallest)
				smallest = numbers[i];
			else if(numbers[i]>largest)
				largest = numbers[i];
		}
		System.out.println("The smallest number in the array is "+smallest);
		System.out.println("The largest number in the array is "+largest);
	}
}
