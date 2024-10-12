package DSquestion;

public class SquareRoot {
	
	public static void sqrt(int num) {
		int ans=1;
		for(int i=1; i<=num; i++) {
			if(i*i<=num) {
				ans=i;
			}
			else {
				break;
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		sqrt(num);

	}

}
