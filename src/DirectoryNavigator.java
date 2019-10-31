import java.io.File;

public class DirectoryNavigator {

	public static void main(String[] args) {
		//String filepath = args[0];
		String filepath = "c:/Users/redme";
		File file = new File(filepath);

		if(file.exists()) {
			printDirectory(file, 0);		
		}
	}

	private static void printDirectory(File folder, int tabs) {
		for (File file: folder.listFiles()) {
			for  (int i = 0; i < tabs ; i++)
				System.out.print("");
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				System.out.println("==== Directory: " + file.getName() + ": Contains: " + files.length + " Files ===");
				System.out.println();
				printDirectory(file, tabs+1);
			} else {
				System.out.print(file.getName());
			}
		}
	}
}