package Question5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\newFile.txt"));
		int data;
		int count=0;
		int max=0;
		String string="";
		String finalString="";
		while((data = bufferedReader.read())!=-1) {
			if((char)data!=' ') {
				count++;
				string += (char)data;
			}
			else{
				if(max<count) {
					max=count;
					finalString = string;
				}
				string ="";
				count=0;
			}
		}
		System.out.println("Longest Word in a file: "+finalString);
	}

}
