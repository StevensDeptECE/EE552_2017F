import java.util.*;
public class BuildList {
	public static void build1(int n) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(i);
		}
	}

	public static void build2(int n) {
		ArrayList<Integer> a = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			a.add(i);
		}
	}

	public static void build3(int n) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(i);
		}
	}

	public static void main(String[] args) {
	  int n = Integer.parseInt(args[0]);
		build2(n);
		
	}
}
