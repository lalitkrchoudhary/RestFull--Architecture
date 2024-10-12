import java.util.HashSet;
import java.util.Set;

public class Hashing4 {
	
	
	static boolean pariWithGivenSum(int a[], int sum) {
		
		Set<Integer> set = new HashSet<Integer>();
		for(int e:a) {
			int comp = sum-e;
			if(set.contains(comp)) return true;
			set.add(e);
		}
		
	return false;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,1,3,2};
		int sum = 3;
		System.out.println(pariWithGivenSum(a,sum));
		
	}

}
