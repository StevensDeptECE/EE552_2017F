import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWin2 extends JFrame {
	private JPanel p;
	public MyWin2(String title, Color bg, int w, int h) {
		super(title);
		Container c = getContentPane();
		c.setBackground(bg);
		setSize(w, h);
		JButton b = new JButton("ok");
		b.setVisible(true);
		c.add(BorderLayout.NORTH, b);
		b.addActionListener(new A());
		p = new JPanel();
		p.setBackground(new Color(155, 0,155));
		c.add(BorderLayout.SOUTH, p);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyWin2("Test1", Color.RED, 400, 200);
	}
	
	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("yo");
			p.setBackground(Color.WHITE);
		}
	}

}








