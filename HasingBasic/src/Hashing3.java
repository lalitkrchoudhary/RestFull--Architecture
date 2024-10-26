import java.util.HashMap;
import java.util.Map;

public class Hashing3 {
	
	static void FrequencyOfElements(int a[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int e:a) {
			if (map.containsKey(e)) {
				int temp = map.get(e);
				map.put(e, temp+1);
			}
			else {
				map.put(e,1);
			}
		}
		
		for(Map.Entry<Integer, Integer> m: map.entrySet()) {
			if(m.getValue()==1) {
				System.out.println(m.getKey());
			}
		}
		
		System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a	= {1,1,1,2,4,3,3,4,5};
		FrequencyOfElements(a);
	}

}
