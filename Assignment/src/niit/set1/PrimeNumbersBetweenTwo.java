package niit.set1;

public class PrimeNumbersBetweenTwo {
	public static void main(String[] args) {
		int lowerLimit=2,higherLimit=100, flag;
		System.out.println("Prime numbers between 2 and 100 are\n====================================\n");
		while(lowerLimit<higherLimit) {
			flag = 0;
			for(int i=2;i<=lowerLimit/2;++i) {
				if(lowerLimit%i==0) {
					flag=1;
					break;
				}
		}
		if(flag==0)
			System.out.println(lowerLimit+"\n");
		++lowerLimit;
	    }
	}
}
