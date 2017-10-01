import java.awt.*; // Font, Color, ...
import javax.swing.*; //JFrame JPanel
import java.awt.event.*;

public class Win4 extends JFrame {
	public Win4(int w, int h, Color color) {
		super("test");
		setSize(w,h);
		Container c = getContentPane();
		c.setBackground(color);
		JButton b = new JButton("ok");
		c.add(BorderLayout.NORTH, b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok");
			}
		});
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new Win4(400,500, Color.BLACK);
	}
}
