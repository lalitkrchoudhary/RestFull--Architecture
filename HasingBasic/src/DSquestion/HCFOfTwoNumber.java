package DSquestion;

public class HCFOfTwoNumber {
	public static void main(String[] args) {
		int num1=2;
		int num2=3;
		
		int hcf= (num1>num2)?num2:num1;
		
		while(true) {
			if(num1%hcf==0 && num2%hcf==0 ) {
				System.out.println(hcf);
				break;
			}
			hcf--;
		}
	}

}
