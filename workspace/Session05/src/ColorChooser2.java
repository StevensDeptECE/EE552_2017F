import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;

public class ColorChooser2 extends JFrame {
	private JPanel p;
	private JSlider[] rgb = new JSlider[3];
	
	public ColorChooser2() {
		super("Color Chooser"); // JFrame.<init>
		setSize(700,500);
		Container c = getContentPane();
		c.setBackground(Color.RED);
		c.setLayout(new GridLayout(1, 4, 5,5));
		ChangeListener cl = new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				Color c = new Color(rgb[0].getValue(), rgb[1].getValue(), rgb[2].getValue());  
				p.setBackground(c);
			}
		};
		
		for (int i = 0; i < 3; i++) {
			c.add(rgb[i] = new JSlider(SwingConstants.VERTICAL, 0, 255, 0));
			rgb[i].addChangeListener(cl);
		}
		p = new JPanel();
		p.setBackground(Color.PINK);
		c.add(p);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ColorChooser2();
		
	}
}
