import java.util.HashSet;
import java.util.Set;

public class Hashing5 {
	
	static boolean zeroSumSubArray(int a[]) {
		Set<Integer> set = new HashSet<Integer>();
		int cs=0;
		set.add(cs);
		for(int e:a) {
			cs +=e;
			
			if(set.contains(cs)) return true;
			set.add(cs);
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, -10,2,3,4};
		System.out.println(zeroSumSubArray(a));
		

	}

}
