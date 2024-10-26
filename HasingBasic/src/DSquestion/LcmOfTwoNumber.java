package DSquestion;

public class LcmOfTwoNumber {
	
	public static void main(String[] args) {
		int n1=2;
		int n2=3;
		int lcm=0;
		
		lcm =(n1>n2)?n1:n2;
		
//		if(a>b) {
//			lcm =a;
//		}
//		else {
//			lcm=b;
//		}
	
		while(true) {
			if(lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.println(lcm);
				
				break;
			}
			lcm++;
		}
	}

}
