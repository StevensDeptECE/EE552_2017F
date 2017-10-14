import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWin3 extends JFrame {
	private JPanel p;
	public MyWin3(String title, Color bg, int w, int h) {
		super(title);
		Container c = getContentPane();
		c.setBackground(bg);
		c.setSize(w, h);
		JButton b = new JButton("ok");
		b.setVisible(true);
		c.add(BorderLayout.NORTH, b);
		b.addActionListener(		
				new ActionListener() { // MyWin$1
					public void actionPerformed(ActionEvent e) {
						System.out.println("yo");
						p.setBackground(Color.WHITE);
					}
				}
		);
		p = new JPanel();
		p.setBackground(new Color(155, 0,155));
		c.add(BorderLayout.SOUTH, p);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWin3("Test1", Color.RED, 400, 200);
	}
}








