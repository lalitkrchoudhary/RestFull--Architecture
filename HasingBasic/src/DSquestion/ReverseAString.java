package DSquestion;

public class ReverseAString {
	public static void main(String[] args) {
		String str1= "apple";
		String str2="";
		char ch;
		for(int i=0; i<str1.length(); i++) {
			ch=str1.charAt(i);
			str2= ch+str2;
			System.out.println(str2);
		}
		System.out.println("Reverse string is :: "+str2);
	}

}
