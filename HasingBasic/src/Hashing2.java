import java.util.HashSet;
import java.util.Set;

class Hashing2{
	
	
	static int countDistictElement(int a[]) {
		
		Set<Integer> set = new HashSet<Integer>();
		for(int e: a) {
			set.add(e);
		}
		
		 System.out.println(set);
		return set.size();
	}
	
	public static void main(String[] args) {
		
		int[] a	= {1,1,1,2,4,3,3,4,5};
		System.out.println(countDistictElement(a));
	}
}