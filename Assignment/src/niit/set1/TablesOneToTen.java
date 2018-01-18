package niit.set1;

public class TablesOneToTen {
	void displayTable(int n) {
		System.out.println("The table for "+n+" is \n=======================\n");
		for(int i=1;i<=10;i++)
			System.out.println(n+" x "+i+" = "+(n*i)+"\n");
	}
	public static void main(String[] args) {
		TablesOneToTen obj = new TablesOneToTen();
		System.out.println("Tables from 1 to 10\n===================================\n");
		for(int i=1;i<=10;i++)
			obj.displayTable(i);
	}
}
