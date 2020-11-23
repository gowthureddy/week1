package Question6;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.MathContext;

public class PlayerDetails {

	static void OutputStream(String name,String team,int matchesPlayed) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\player.csv");
		fileOutputStream.write(name.getBytes());
		fileOutputStream.write(',');
		fileOutputStream.write(team.getBytes());
		fileOutputStream.write(',');
		fileOutputStream.write(String.valueOf(matchesPlayed).getBytes());
		
		fileOutputStream.close();
		
	}
}
