import java.util.*;

public class PlayWithLists {
	public static void veryveryBad(int n) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		// 1 + 2 + 3 + ... n = O(n^2)
		for (int i = 0; i < n; i++)
			a.add(0,i);
	}
	public void veryveryBad2(int n) {
		String s = "a";
		s = s + "b";
		for (int i = 0; i < n; i++)
			s = s + "c";
	}
	
	public String fastStrings(int n) {
		StringBuilder b = new StringBuilder(6*n);
		// 01234567891011121314...99100101102...
		// 100000 ... 999999
		for (int i = 0; i < n; i++)
			b.append(i);
		return b.toString();
	}
	static class Person {
		private String  firstName, lastName;
		public Person(String fName, String lName) {
			firstName = fName; lastName = lName;
		}
		public String toString() {
			return firstName + ", " + lastName;
		}
	}
	public static void linkedLists() {
		LinkedList<Person> people = new LinkedList<Person>();
		people.add(new Person("Dov", "Kruger"));
		people.add(0, new Person("Yu-Dong", "Yao"));
		// this way of walking through a list  is slow!!
		for (int i = 0; i < people.size(); i++)
			System.out.println(people.get(i));
	
		for (Iterator<Person> it = people.iterator(); it.hasNext(); ) {
			Person p = it.next();
		    System.out.println(p);
		}
	}
		

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			a.add(i); // autoboxing
		for (int i = 0; i < a.size(); i++)
			System.out.println(a.get(i));
		for (Integer x : a) {
			System.out.println(x);			
		}
		veryveryBad(1000000);
		linkedLists();
		
	}
}
