import java.util.*;


public class BotChat {




}

class Bot {

	private Map<String, String> word;

	Bot() {
		word = new HashMap<>();
		word.put("name", "Mr.Thant");
		word.put("Hello", "Hello");
	}

	public String talk(String str) {


		str = word.get(str);
		
		return str; 

	}
}