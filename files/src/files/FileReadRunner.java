package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

	public static void main(String[] args) {

		Path pathFileToRead = Paths.get("./resources/data.txt");
		try {
//			List<String> lines = Files.readAllLines(pathFileToRead);
//			System.out.println(lines);

			Files.lines(pathFileToRead).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
