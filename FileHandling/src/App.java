import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static String filename;
	static File file;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("A Text file will be created. Enter a filename to create:");
		filename = scan.nextLine();
		Path relativePath = Paths.get("src", filename);
		file = new File(relativePath.toString());
		createFileUsingFileClass();

		System.out.println("Enter number of fruits to write in File:");
		int num = scan.nextInt();
		List<String> list = new ArrayList<>(num);
		while (num >= 0) {
			list.add(scan.nextLine());
			num--;
		}

		// writing to file
		WriteFile write = new WriteFile();
		write.writeFileMethod(file, list);

		// reading from file
		System.out.println("The contents in file are:");
		write.readFileInList(file.toString());

		// appending in file
		System.out.println("Enter the replacing fruit:");
		String a = scan.nextLine();
		System.out.println("Enter the old fruit:");
		AppendFile append = new AppendFile();
		String b = scan.nextLine();
		append.modifyFile(file.toString(), a, b);
		System.out.println("Enter number of fruits to add to file:");
		int num1 = scan.nextInt();
		List<String> list1 = new ArrayList<>(num1);
		while (num1 >= 0) {
			list1.add(scan.nextLine());
			num1--;
		}
		append.addingMethod(file, list1);
		scan.close();
	}

	private static void createFileUsingFileClass() throws IOException {

		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}
	}
}
