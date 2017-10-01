package test1;

public class SphericalBody {
	private final static double G = 6.674E-11;
	public static final double π = 3.14159265358979;
	public static double 大 = 1e30;
	private String name;
	private double mass;
	
	private Vec3d loc; // location
	private Vec3d v; // velocity   // integrate accelerations to get velocity, integrate velocity to get position
}
