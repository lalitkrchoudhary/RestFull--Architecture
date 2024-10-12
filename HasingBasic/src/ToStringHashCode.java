import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Students{
	int age;
	int roll;
	String name;
	
	public Students(int age, int roll, String name) {
		this.age=age;
		this.roll=roll;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Students [age=" + age + ", roll=" + roll + ", name=" + name + "]";
	}

	//equals method checking true or false
    public boolean equals(Object that) {
    	Students s = (Students) that;
		return this.roll == s.roll;
    	
    }
  
    //after overriding the equals method we have to override the hashCode also for unique print of result
    public int hashCode() {
    	return this.roll;
    }
	
	
}

public class ToStringHashCode {
	
	public static void main(String[] args) {
		Students s1 =new Students(42,1,"lalit");
		Students s2 = new Students(42,1,"aman");
		
		System.out.println(s1.equals(s2));
		
		Set<Students> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		
		System.out.println(set);
	}

}
