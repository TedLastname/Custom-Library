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
		// TODO Literally just do anything. There's nothing.
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
