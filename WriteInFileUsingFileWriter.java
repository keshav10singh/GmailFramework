package javaConcept;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFileUsingFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="temp.txt";
		
		try {
			FileWriter filewriter=new FileWriter(fileName);
			BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
			bufferedwriter.write("Hello there,First line of text.");
			bufferedwriter.newLine();
			bufferedwriter.write("This is the Second line of text");
			bufferedwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(
	                "Error writing to file '"
	                + fileName + "'");
		}

	}

}
