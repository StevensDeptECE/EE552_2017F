package edu.stevens.ee552.cad.components;

import java.awt.Graphics;

public class Circle extends Shape {
	private int width,height;
	
	public Circle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width; this.height = height;
	}
	public void draw(Graphics g) {
		g.fillOval(getX(), getY(), width, height);
	}
}
