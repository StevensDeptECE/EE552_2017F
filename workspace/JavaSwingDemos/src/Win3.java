import java.awt.*; // Font, Color, ...
import javax.swing.*; //JFrame JPanel

public class Win3 extends JFrame {
	public Win3(int w, int h, Color color) {
		super("test");
		setSize(w,h);
		Container c = getContentPane();
		c.setBackground(color);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new Win3(400,300, Color.RED);
		new Win3(500,200, Color.BLUE);
	}
}
