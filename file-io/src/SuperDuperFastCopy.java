import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SuperDuperFastCopy {
	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		FileChannel inChannel  = null;
		FileChannel outChannel = null;
		try {
			inFile = new FileInputStream("C://Users//ZB538WC//Downloads//node-v18.17.1-x64.msi");	//22 MB approx
			outFile = new FileOutputStream("C://Users//ZB538WC//Downloads//src//node.msi");
			inChannel = inFile.getChannel();
			outChannel = outFile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocateDirect(1024*16);	// Creating 16KB common buffer at OS level
			long ms1 = System.currentTimeMillis();
			while(true) {
				int count = inChannel.read(buffer);
				if(count == -1) break;
				buffer.flip();	// placing cursor back to the start of the buffer
				outChannel.write(buffer);
				buffer.clear();
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in "+(ms2-ms1)+" ms");			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				inChannel.close();
				outChannel.close();			
				inFile.close();
				outFile.close();
			} catch(Exception e) { }
		}
	}
}
