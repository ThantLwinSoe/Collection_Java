import java.util.*;

public class MapIntro {

	public static void main(String [] args) {

		var obj = new IntroMap();
		Map<Integer, String> uu = new HashMap<>();
		obj.defaultMap(uu);

		System.out.println(uu);
		
		uu.put(8, "Okay Buudy");

		System.out.println(uu);



	}

}

class IntroMap {

	public Boolean defaultMap(Map<Integer, String> map) {

		for(Integer i = 10; i>0 ; i--) {
			map.put(i, i.toString());
			
		}

		return true;
	}
}