import java.awt.*; // Font, Color, ...
import javax.swing.*; //JFrame JPanel

public class FirstWin {
	public static void main(String[] args) {
		JFrame f = new JFrame("test");
		f.setSize(800, 800);
		Container c = f.getContentPane();
		c.setBackground(Color.RED);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
