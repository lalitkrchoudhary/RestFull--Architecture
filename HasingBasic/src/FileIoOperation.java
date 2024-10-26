import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIoOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		File f = new File("abc.txt");
//		if(!f.exists()) {
//			
//			f.createNewFile();
//		}
//		else {
//			System.out.println("file already exist");
//		}

		//Q> check how many file or etc are present in the given dir
//		File f = new File("/home/lalit/workspace-spring-rest");
//		int count =0;
//		String[] data =f.list();
//		System.out.println(data);
//		for(String e:data) {
//			count++;
//			System.out.println(e);
//		}
//		System.out.println("Total file is present is :: "+count);
//		
		
		//Note:::BufferWriter use with FileWriter and BufferReader is used with FileReader
		//For writing in file
//		BufferedWriter bw = new BufferedWriter(new FileWriter("read.txt"));
//		bw.write(12);
//		bw.newLine();
//		bw.write("Hello i am lalit");
//		bw.newLine();
//		char [] ch = {'a','b','c'};
//		bw.write(ch);
//		bw.newLine();
//	    
//		bw.flush();
//		bw.close();
		
		
		//BufferReader for reding the existing file
//		BufferedReader br = new BufferedReader(new FileReader("read.txt"));
//		String line= br.readLine();
//		while(line!=null) {
//			System.out.println(line);
//			line=br.readLine();
//		}
		
		
		//PrintWrite is more useful
		//This is most enchance Writer to write text data to the file
		//By using FIleWriter and BufferWriter we can write only character data to the file but by Using PrintWriter we can write any type of data to the file.
//		FileWriter fw = new FileWriter("cricket.txt");
//		PrintWriter out = new PrintWriter(fw);
//		out.println(123);
//		out.println("I am not lalit");
//		out.println('M');
//		out.println(false);
//		out.println(53.4);
//		out.flush();
//		out.close();
		
		
		
		
		
		
		
	}

}
 