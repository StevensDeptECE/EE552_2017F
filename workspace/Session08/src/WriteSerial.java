import testReview.A;
import java.io.*;
import java.util.zip.GZIPOutputStream;

class A implements Serializable {
	private int x;
	public A(int x) { this.x = x; }
	public String toString() { return x + ""; }
}
public class WriteSerial {
	//Serialization = turn objects into a stream of bytes 
	// write to disk
	// write to internet
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test.ser");
			GZIPOutputStream gos = new GZIPOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(gos);
//			int []x = {1, 2, 3};
//			oos.writeObject(x);
			A a1 = new A(5);
			oos.writeObject(a1);
//			oos.writeInt(99);
			oos.close();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
