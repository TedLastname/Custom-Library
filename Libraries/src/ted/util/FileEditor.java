package ted.util;

import java.io.IOException;
import java.io.FileWriter;

public class FileEditor {
	public static void write(String l, String s) throws IOException {
		FileWriter f = new FileWriter(l, true); // This makes a new file or uses the old one
		f.write(s+":"); // Actually writes the string to the file
		f.close(); // Closes the file, otherwise some bad stuff happens and gives an error
	}
	
	public static String read(String l) {
		return "Hey"; // I haven't even started this one, sorry
	}
}
