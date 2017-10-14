import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;

public class ColorChooser extends JFrame {
	private JPanel p;
	
	
	public ColorChooser() {
		super("Color Chooser"); // JFrame.<init>
		setSize(700,500);
		Container c = getContentPane();
		c.setBackground(Color.RED);
		c.setLayout(new GridLayout(1, 4, 5,5));
		JSlider s;
		c.add(s = new JSlider(SwingConstants.VERTICAL, 0, 255, 0));
		s.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						JSlider slider = (JSlider)e.getSource();
						System.out.println("r=" + slider.getValue());
					}
				}
		);
		c.add(s = new JSlider(SwingConstants.VERTICAL, 0, 255, 0));
		s.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						JSlider slider = (JSlider)e.getSource();
						System.out.println("g=" + slider.getValue());
					}
				}
		);
		c.add(s = new JSlider(SwingConstants.VERTICAL, 0, 255, 0));
		s.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						JSlider slider = (JSlider)e.getSource();
						System.out.println("b=" + slider.getValue());
					}
				}
		);
		p = new JPanel();
		p.setBackground(Color.PINK);
		c.add(p);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ColorChooser();
		
	}
}
