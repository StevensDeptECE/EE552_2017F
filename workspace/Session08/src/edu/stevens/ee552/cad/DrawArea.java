package edu.stevens.ee552.cad;
import edu.stevens.ee552.cad.components.Shape;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import edu.stevens.ee552.cad.components.Line;

public class DrawArea extends JPanel {
	private ArrayList<Shape> shapes;
	public DrawArea() {
		shapes = new ArrayList<>(1024);
		setBackground(Color.BLUE);
		MyMouseListener ml = new MyMouseListener();
		addMouseListener(ml);
		addMouseMotionListener(ml);
	}
	public void paint(Graphics g) {
		super.paint(g);
//for (int i = 0; i < shapes.size(); i++)
	//shapes.get(i).draw(g);
		for (Shape s : shapes) {
			s.draw(g);
		}
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener {
		private int x,y;
		private int lastx, lasty;
		@Override
		public void mouseClicked(MouseEvent arg0) {
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX(); y = e.getY();
			lastx = x; lasty = y;
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Graphics g = getGraphics();
			Line line;
			shapes.add(line =new Line(x,y, e.getX(), e.getY()));
			line.draw(g);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g = getGraphics();
			g.setXORMode(Color.WHITE);
			g.drawLine(x, y, lastx,lasty);
			g.drawLine(x, y, lastx = e.getX(), lasty=e.getY());
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}
		
	}

}
