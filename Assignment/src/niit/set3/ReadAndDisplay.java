package niit.set3;

import java.util.Scanner;

public class ReadAndDisplay {
	public static void main(String[] args) {
		int numbers[] = new int[20];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to insert into an array: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+(i+1)+": ");
			numbers[i]=sc.nextInt();
		}
		System.out.println("The array elements are: ");
		for(int i=0;i<n;i++)
			System.out.println(numbers[i]);
	}

}
