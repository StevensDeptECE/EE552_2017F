import java.awt.*; // Font, Color, ...
import javax.swing.*; //JFrame JPanel

public class Win2 {
	public Win2() {
		JFrame f = new JFrame("test");
		f.setSize(800, 800);
		Container c = f.getContentPane();
		c.setBackground(Color.RED);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);		
	}
	
	public static void main(String[] args) {
		new Win2();
		new Win2();
	}
}
