import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @author karthiga.ravic
 *
 */
public class WriteFile extends ReadFile {
	public static void writeFileMethod(File file, List<String> list) throws IOException {
		// Write Content
		FileWriter writer = new FileWriter(file);
		int i = 0;
		while (i < list.size()) {
			writer.write(list.get(i) + "\n");
			i++;
		}
		writer.close();
	}
}
