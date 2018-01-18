package niit.set3;

import java.util.Scanner;

public class InsertElement {
	public static void main(String[] args) {
		int numbers[] = new int[20];
		int n, position, element;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to insert into an array: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+(i+1)+": ");
			numbers[i]=sc.nextInt();
		}
		System.out.print("Enter the position where you want to insert element: ");
		position = sc.nextInt();
		System.out.print("Enter the element you want to insert:");
		element = sc.nextInt();
		for(int i=(n-1);i>=(position-1);i--)
		{
			numbers[i+1] = numbers[i];
		}
		numbers[position-1] = element;
		System.out.print("After inserting:");
		for(int i=0;i<n; i++)
		{
			System.out.print(numbers[i]+",");
		}
		System.out.print(numbers[n]);
	}

}
