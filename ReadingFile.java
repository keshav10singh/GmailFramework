package javaConcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
     
		
		String filename="‪‪C:\\Users\\Keshav.Singh\\Desktop\\mydoc2.txt";
		File testFile=new File(filename);
		Scanner in=new Scanner(testFile);
		in.nextLine();
		
		while(in.hasNextLine()) {
			String line=in.nextLine();
			System.out.println(line);
		}
		in.close();
	}

}
