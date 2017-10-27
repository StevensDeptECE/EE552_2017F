package edu.stevens.ee552.cad.components;
import java.awt.*;

public abstract class Shape {
	private int x, y;
	public Shape(int x, int y) { this.x = x; this.y = y; }
	public abstract void draw(Graphics g);
	public int getX() { return x; }
	public int getY() { return y; }
}
