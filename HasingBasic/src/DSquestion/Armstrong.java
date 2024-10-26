package DSquestion;

//111.555.333

public class Armstrong {
	

	public static void main(String[] args) {
		
		int n=153;
		int temp = n;
		int r, sum=0;
		
		while(n>0) {
			r=n%10;
			System.out.println("this is r : "+r);
			n=n/10;
			System.out.println("this is n : "+n);
			sum = sum + r*r*r;
			System.out.println("this is sum : "+sum);
		}
		if(temp ==sum) 
			System.out.println("The number is armstrong");
		else
			System.out.println("Not a armstrong");
		
	}

}
