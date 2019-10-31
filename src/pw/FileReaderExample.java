package pw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args)  throws IOException {
		//set up files and stream
		File inFile = new File ("Data2.txt");
		try {
			FileReader fileReader = new FileReader(inFile);
			BufferedReader buffReader = new BufferedReader(fileReader);
			String str;

			str = buffReader.readLine();
			while(str!=null) {
				System.out.println(str);
				str = buffReader.readLine();
			}
			buffReader.close();
		} catch	(FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException: "+ e.getMessage());
		}	
	}
}