package Question4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLines {

	public static void main(String[] args) throws IOException {
		
		String line;
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\newText.txt"));
		for(int i=0;i<3;i++) {
			line = bufferedReader.readLine();
			System.out.println(line);
		}
		bufferedReader.close();
	}

}
