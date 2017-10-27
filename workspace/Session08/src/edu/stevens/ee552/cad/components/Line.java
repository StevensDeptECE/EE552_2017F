package edu.stevens.ee552.cad.components;

import java.awt.Graphics;

public class Line extends Shape {
	private int x2,y2;
	
	public Line(int x, int y, int x2, int y2) {
		super(x,y);
		this.x2 = x2; this.y2 = y2;
	}
	public void draw(Graphics g) {
		g.drawLine(getX(), getY(), x2, y2);
	}
}
