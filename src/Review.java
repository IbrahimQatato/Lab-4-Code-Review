import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		String pattern = args[0];
		File file = new File(args[1]);
		if (!file.exists()) {
			System.out.println("file doesn't exist make sure to inpute the correct "
					+ "arguments, <pattern> <file>");
			return;
		}
		Scanner sc;
		try {
			String line;
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				if (line.contains(pattern)) {
					System.out.println(line);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
