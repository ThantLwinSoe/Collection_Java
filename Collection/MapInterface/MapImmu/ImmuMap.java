import java.util.*;

public class ImmuMap {

	public static void main(String [] args) {

	}
}

class MapImmu {

	private Map<Integer,String> okMap;

	boolean doImmu(Map<Integer,String> map) {

		if(map.isEmpty()) {
			okMap = Map.of(1,"One",2 , "Two", 3, "Three", 4, "Four");
		}else{
			okMap = Map.copyOf(map);
		}
		
		return true;
	}

	boolean doMuu(Map<Integer, String> map){

		okMap = new HashMap<>(okMap);

		return true;
	}

	Map<Integer, String> get(){
		return okMap;
	}
}