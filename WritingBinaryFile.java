package javaConcept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingBinaryFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filename="binarytemp.txt";
		String byt="Hello Binary Files, I am Keshav Singh";
		byte[] buffer=byt.getBytes();
		try {
		FileOutputStream fileoutput;
		
			fileoutput = new FileOutputStream(filename);
			fileoutput.write(buffer);
			fileoutput.close();
			System.out.println("Wrote " + buffer.length + 
	                " bytes");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(
	                "Error writing file '"
	                + filename + "'");
		}
		
}
	}

