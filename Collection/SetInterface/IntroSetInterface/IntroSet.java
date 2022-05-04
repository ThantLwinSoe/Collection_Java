import java.util.*;

public class IntroSet {

	public static void main(String [] args) {

		// Hashset 
		Set<String> str = new HashSet<>();

		// Treeset 
		Set<String> str2 = new TreeSet<>();

		// LinkdedHashSet 
		Set<String> str3 = new LinkedHashSet<>();

		str.add("Hello");
		str.add("Java");
		str.add("Everyone");

		System.out.println(str);

		str2.add("a");
		str2.add("K");
		str2.add("U");
		str2.add("B");

		System.out.println(str2);

	}
}

