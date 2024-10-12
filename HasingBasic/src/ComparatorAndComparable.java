import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// now student get the power to compare itself now not require any comparator
class Student implements Comparable<Student>{
	Integer age;
	String add;
	String name;
	
	public Student(Integer age, String add, String name) {
		this.age=age;
		this.add=add;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", add=" + add + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student that) {
		if(this.age%10 > that.age%10) return 1;
		else return -1;
	}
	
	
	
}

public class ComparatorAndComparable {
	
	

	public static void main(String[] args) {
	
		
		
		  //just overide the method of sort for using own short using comparator
//		  Comparator com =new Comparator<Integer>() {
//		  
//		  @Override 
//		  public int compare(Integer i, Integer j) 
//		  { 
//			  if(i%10 > j%10) return 1; //1 means swap and -1 means not swap 
//		  
//		  else return -1 ; 
//		  }
//		  
//		  
//		  };
		
		
//		//Sorting based on age using comparotor
//		Comparator<Student> com = new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student i, Student j) {
//				if(i.age > j.age) return 1;
//				else return -1;
//			}
//		};
		 
		
		
		// TODO Auto-generated method stub
		List<Student> std = new ArrayList<Student>();
		
		/*
		 * list.add(45); list.add(23); list.add(42); list.add(21); list.add(30);
		 */	
		std.add(new Student(34,"naregi","lalit"));
		std.add(new Student(23,"naregi","lalit"));
		std.add(new Student(24,"naregi","kumar"));
		std.add(new Student(11,"naregi","lalit"));
		std.add(new Student(10,"naregi","lalit"));
		std.add(new Student(31,"naregi","lalit"));

		
		
		//Collections.sort(std,com); // for using comparator we have to use two parameter 
		
		Collections.sort(std); //now student own have the compare power so we donts have to pass two parameter

		for(Student e : std)
		{
			System.out.println(e);
		}
		
		

	}

}
