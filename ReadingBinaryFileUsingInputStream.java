package javaConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingBinaryFileUsingInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("Test1.txt");
		byte[] buffer=new byte[1000];
		try {
			FileInputStream inputStream=new FileInputStream(file);
			// read fills buffer with data and returns
            // the number of bytes read (which of course
            // may be less than the buffer size, but
            // it will never be more).
			
			int total=0;
			int nRead=0;
			
			while((nRead=inputStream.read(buffer))!=-1) {
				// Convert to String so we can display it.
                // Of course you wouldn't want to do this with
                // a 'real' binary file.
				
				System.out.println(new String(buffer));
				total +=nRead;
			}
			
			inputStream.close();
			System.out.println("Read"+total+"bytes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to open file"+file+" ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error reading the file"+file+" ");
		}
	}

}
