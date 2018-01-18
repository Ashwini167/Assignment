package niit.set3;

import java.util.Scanner;

public class DeleteElementWithIndex {
	public static void main(String[] args) {
		int numbers[] = new int[20];
		int n, deleteIndex;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to insert into an array: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+(i+1)+": ");
			numbers[i]=sc.nextInt();
		}
		System.out.print("Enter the index from which you need to delete the element: ");
		deleteIndex = sc.nextInt();
		
		for(int i=deleteIndex;i<n-1;i++) {
			numbers[i]=numbers[i+1];
		}
		System.out.print("\n Now the New Array is :\n");
		for(int i=0; i<(n-1); i++)
		{
			System.out.print(numbers[i]+ " ");
		}
	}
}
