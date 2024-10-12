package DSquestion;

public class Prime {
	
	static void checkPrime(int num ) {
		int count =0;
		for (int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}
	}
	
	
	static void printPrime( int num) {
		for(int i=2; i<=num; i++) {
			boolean  isPrime= true;
			for(int j=2; j<=i/2; j++) {
			
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) System.out.println(i+" is Prime");
		}
		
	}
	
	public static void main(String[] args) {
		
		int num =12;
//		checkPrime(num);
		printPrime(num);
		
		
	}

}
