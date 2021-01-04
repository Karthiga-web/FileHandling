
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author karthiga.ravic
 *
 */
public class ReadFile {

	public static void readFileInList(String fileName) {

		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Iterator<String> itr = lines.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}