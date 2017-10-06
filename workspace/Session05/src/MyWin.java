import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWin extends JFrame {
	public MyWin(String title, Color bg, int w, int h) {
		super(title);
		Container c = getContentPane();
		c.setBackground(bg);
		setSize(w, h);
		JButton b = new JButton("ok");
		b.setVisible(true);
		c.add(BorderLayout.NORTH, b);
		b.addActionListener(new A());
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyWin("Test1", Color.RED, 400, 200);
		new MyWin("Test2", Color.GREEN, 300, 100);
		
	}
}

class A implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("yo");
	}
}







