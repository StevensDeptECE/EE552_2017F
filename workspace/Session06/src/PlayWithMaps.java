import java.util.*;
public class PlayWithMaps {
	public static void main(String[] args) {
		HashMap<String, Double> prices = new HashMap<>();
		prices.put("AAPL", 156.99);
		prices.put("IBM", 147.10);

		
		System.out.println(prices.get("AAPL"));
		for (HashMap.Entry<String, Double> entry : prices.entrySet())
		{
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		

		Iterator<HashMap.Entry<String, Double>> it = prices.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Double> pair = it.next();
			System.out.println(pair.getKey() + "," + pair.getValue());
		}

		for (Iterator<HashMap.Entry<String, Double>> it2 = prices.entrySet().iterator();
				it2.hasNext(); ) {
			Map.Entry<String, Double> pair = it2.next();
			System.out.println(pair.getKey() + "," + pair.getValue());
		}

		prices.forEach((k, v) -> System.out.println(k + ","  + v));
		//https://stackoverflow.com/questions/46898/how-to-efficiently-iterate-over-each-entry-in-a-map
		
		String[] symbols = (String[]) prices.keySet().toArray();
		for (String s : symbols) {
			System.out.println(s + " ==> " + prices.get(s));
		}
		
	}
}








