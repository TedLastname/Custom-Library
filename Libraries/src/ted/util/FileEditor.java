package ted.util;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileEditor {
	public static void write(String l, String s) throws IOException {
		FileWriter f = new FileWriter(l, true); // This makes a new file or uses the old one
		f.write(s+":"); // Actually writes the string to the file
		f.close(); // Closes the file, otherwise some bad stuff happens and gives an error
	}
	
	public static String read(String l) {
		try {
			BufferedReader read = new BufferedReader(new FileReader(l));
			// put all of the lines into an ArrayList and return that
			// TODO change return type to ArrayList when done
			read.close();
			return "Reading isn't ready yet!";
		} catch (Exception e) {
			System.out.println("An Error occurred in reading the file at " + "\"" + l + "\"");
			return "";
		}
	}
	
	public static void edit(String o, String n) {
		// TODO make editing work. That'd be good.
		// I'm going to use this for a text adventure, so I want to
		// store some variables.  I'll need to edit them when I save,
		// things like the inventory and all that, so I'll use the
		// read() function and I suppose I'll have to find some way
		// to edit without taking everything and copying it and writing with
		// the new value.  I'm not looking forward to it.
		// The adventure is really just like a coding exercise, so I   
		// probably won't release it.
	}
}
