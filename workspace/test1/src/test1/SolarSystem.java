package test1;
import java.io.*;
import java.util.*;
// SolarSystem.r.   
public class SolarSystem {
	public static Random r = new Random(0); 
	public static void main(String[] args) {
		System.out.println("hello");
		try {
			int i = r.nextInt();
			int die = r.nextInt(6)+1;
			double x = r.nextGaussian();
			FileReader fr = new FileReader("solarsystem.dat");
			Scanner s = new Scanner(fr);
			for (int i=0; i < 10; i++) {
				System.out.print(s.next() + "\t");
			}

			while (s.hasNext()) {
				String name = s.next();
				String orbiting = s.next();
				double mass = s.nextDouble();
				double diam = s.nextDouble();
				System.out.println();
				
			}
		
		
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
