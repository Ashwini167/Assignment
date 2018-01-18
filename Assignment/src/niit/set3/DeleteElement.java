package niit.set3;
import java.util.Scanner;

public class DeleteElement {
	public static void main(String[] args) {
		int numbers[] = new int[20];
		int n, delete, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to insert into an array: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+(i+1)+": ");
			numbers[i]=sc.nextInt();
		}

		System.out.print("Enter an element delete : ");
		delete = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			if(numbers[i] == delete)
			{
				for(int j=i; j<(n-1); j++)
				{
					numbers[j] = numbers[j+1];
				}
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.print("Element Not Found..!!");
		}
		else
		{
			System.out.print("Element Deleted Successfully..!!");
			System.out.print("\nNow the New Array is :\n");
			for(int i=0; i<(n-1); i++)
			{
				System.out.print(numbers[i]+ " ");
			}
		}
	}

}
