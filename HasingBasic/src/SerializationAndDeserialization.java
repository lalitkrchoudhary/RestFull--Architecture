import java.io.*;
class Dog implements Serializable{
	int a=10;
	int b=20;
	
}


public class SerializationAndDeserialization  {
	
public static void main(String[] args) throws Exception {
	
	System.out.println("Started serilization");
	FileOutputStream fos = new FileOutputStream("data.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	Dog d = new Dog();
	oos.writeObject(d);
	System.out.println("Ended serialization");
	System.out.println();
	
	System.out.println("Started derilization");
	FileInputStream fis = new FileInputStream("data.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
    Dog dd = (Dog) ois.readObject();	
    System.out.println(dd.a +"--------->"+dd.b);
    System.out.println("Ended Deserialization");

	
}
}
