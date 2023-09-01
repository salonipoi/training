import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		try {
			inFile = new FileInputStream("C://Users//ZB538WC//Downloads//node-v18.17.1-x64.msi");	//22 MB approx
			outFile = new FileOutputStream("C://Users//ZB538WC//Downloads//src//node.msi");
			System.out.println("Copying file...");
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while(true) {
				ch = inFile.read();	// reading a byte from the stream
				if(ch == -1) break;
				outFile.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in " + (ms2-ms1) + " ms");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inFile.close();
				outFile.close();
			} catch(Exception e) { 
				e.printStackTrace();
			}
		}
	}
}
