package test1;

public class Vec3d {
	public double x,y,z;
	
	
	
	public static void main(String[] args) {
		Vec3d v = new Vec3d(0,0,0);
		Vec3d v2 = v.add(new Vec3d(10,5,0));
		double d = v2.dist(v);
		double dsq = v2.distsq(v);
		Vec3d v3 = v.mult(2);
		v.set(1,2,3);
		v.clear();
		
	}
}
