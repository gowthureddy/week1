package Question1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseBufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter ur name");
		String name = bufferedReader.readLine();
		
		System.out.println("Hello "+name+"!");
		bufferedReader.close();
		
	}

}
