package Question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAndRead {

	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\user\\Desktop\\text.txt");
		fileWriter.write("Welcome to Java");
		fileWriter.close();
		
		FileReader fileReader  = new FileReader("C:\\Users\\user\\Desktop\\text.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int data;	
		while((data =  bufferedReader.read())!=-1) {
			System.out.print((char)data);
		}
		
	}

}
