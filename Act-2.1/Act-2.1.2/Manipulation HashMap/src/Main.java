import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		System.out.println(map);
		HashMap<String, String> map1=new HashMap<>();
		map1.put("Steve", "London");
		map1.put("John", "New York");
		map1.put("Rajeev", "Bengaluru");
		System.out.println(map1);
		System.out.println(map1.isEmpty());
		System.out.println(map1.size());
		System.out.println(map1.containsKey("Steve"));
		System.out.println(map1.get("Steve"));
		map1.put("Steve","Paris");
		System.out.println(map1);
		map1.remove("Steve");
		System.out.println(map1);
		map1.remove("John","New York");
		System.out.println(map1);
		

	}
	// {Steve=London, John=New York, Rajeev=Bengaluru}
	

}
