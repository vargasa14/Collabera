package inputScnr;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadNameAndSort {

	public static void main(String[] args) {
		Scanner scanner;

		try {

			scanner = new Scanner(new File("Data2.txt"));

			while (scanner.hasNextLine())
			{	
				String name = scanner.nextLine();
				System.out.println("Name1" + name);	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}