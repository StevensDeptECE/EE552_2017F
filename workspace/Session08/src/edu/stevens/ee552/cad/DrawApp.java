package edu.stevens.ee552.cad;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import edu.stevens.ee552.cad.components.*;

public class DrawApp extends JFrame {
	private boolean dirty;
	private DrawArea da;
	private void buildToolbar(Container c) {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 1));
		JButton b;
		dirty = true;
		p.add(b=new JButton("line"));
                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        da.setMode(new LineMode());
                    }
                });
		p.add(b=new ModalButton("ellipse", da, new CircleMode()));
                
		p.add(b=new JButton("rect"));
		c.add(p, BorderLayout.WEST);
	}

	private void handleEvents() {
		addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				int result = JOptionPane.showConfirmDialog(DrawApp.this, "Quit?",
				        "alert", JOptionPane.OK_CANCEL_OPTION);
				System.out.println(result);
				if (result == 0)
					System.exit(0);
				setVisible(true);
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	public void save() {
		
		dirty=false;
	}
	public DrawApp( ) {
		Container c = getContentPane();
		da = new DrawArea();
		buildToolbar(c);
		handleEvents();
		c.add(da, BorderLayout.CENTER);
		setSize(700,400);
		setVisible(true);
	}
}
