package niit.set3;

import java.util.Scanner;

public class LinearSearch {

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
		for(int i=0;i<n;i++) {
			if(numbers[i]==search)
				flag = 1;
		}
		if(flag==1)
			System.out.println("The number "+search+" is found in the array");
		else
			System.out.println("The number "+search+" is not found in the array");
	}

}
