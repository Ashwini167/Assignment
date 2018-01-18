package niit.set1;

import java.util.Scanner;

public class TableOneNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //to take user input
		int var1;
		System.out.println("Enter the number for which table is to be generated: ");
		var1 = sc.nextInt();
		System.out.println("The table is \n");
		for(int i=1;i<=10;i++)
			System.out.println(var1+" x "+i+" = "+(var1*i)+"\n");		
	}
}
