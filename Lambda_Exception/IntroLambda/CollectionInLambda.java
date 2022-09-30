import java.util.*;
import java.util.function.*;
public class CollectionInLambda {
	static Set<Integer> set = set = Set.of(1,2,3,4,5);
	static {
		 
		set = new HashSet<>(set);
	}	
		

	public static void main(String[] args) {
		
		showData();
		System.out.println("*******");
		omiDataEven();
		
		set.forEach(a -> System.out.println(a));

		showMap();
	

	}
	public static void showMap(){
		var map = new HashMap<String,Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);

		map.forEach( (a,b) -> System.out.printf("%s : %d \n", a,b));
	}

	public static void omiDataEven() {
	
		set.removeIf(a -> a%2 ==0);

	}

	public static void showData(){


		set.forEach(a -> System.out.println(a));

	}


}