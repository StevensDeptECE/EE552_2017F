import testReview.A;
import java.io.*;
import java.util.zip.GZIPInputStream;


public class ReadSerial {
	//Serialization = turn objects into a stream of bytes 
	// write to disk
	// write to internet
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.ser");
			GZIPInputStream gis = new GZIPInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(gis);
			A a1 = (A)ois.readObject();
			System.out.println(a1);
			ois.close();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e2) {
			e2.printStackTrace();
		}finally {
			if (fis != null) {
				try {
					fis.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
