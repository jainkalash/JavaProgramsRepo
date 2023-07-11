package files;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get(".");
//		Files.list(currentDirectory).forEach(System.out::println);
//      Output is: .\.classpath
//		           .\.project
//		           .\.settings
//		           .\bin
//		           .\resources
//		           .\src

//		Files.walk(currentDirectory, 4).forEach(System.out::println);
//      Output is: .\.settings\org.eclipse.jdt.core.prefs
//		           .\bin
//		           .\bin\files
//		           .\bin\files\DirectoryScanRunner.class
//		           .\resources
//		           .\src
//		           .\src\files
//		           .\src\files\DirectoryScanRunner.java


//		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
//		Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);
//      Output is: .\src\files\DirectoryScanRunner.java

//		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");
//		Files.find(currentDirectory, 4, matcher).forEach(System.out::println);
//		;
//      Output is: .\src\files\DirectoryScanRunner.java
	}

}
