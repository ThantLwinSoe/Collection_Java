import java.util.*;
import java.util.function.*;


public class TestRemoveIf {

	private static Set<String> str;
	private static Set<Integer> obj;

	public static void main(String [] args) {

		
		str = new HashSet<>();
		str.add("Hello");
		str.add("Java");

		obj = new HashSet<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);

		System.out.println(obj);

		Predicate<Integer> oo = new Predicate<>(){
			public boolean test(Integer data){
				return data % 2 !=0;
			}
		};

		obj.removeIf(oo);

		System.out.println(obj);

	}

	
}