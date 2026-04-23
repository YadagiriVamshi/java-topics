package SecondHalf;

import java.io.FileReader;
import java.io.IOException;

public class Throws1 {
	public static void readFile() throws IOException {
		FileReader file=new FileReader("text.txt");
	}
	public static void main(String[] args) {
		try {
			readFile();
		}
		catch(IOException e) {
			System.out.println("ioexception");
		}
	}

}
