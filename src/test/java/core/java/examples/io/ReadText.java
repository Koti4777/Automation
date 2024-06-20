package core.java.examples.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = System.getProperty("user.dir")+"//resources//payloads//Notepad1.txt";
		String line;
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
