import java.util.*;
import java.util.function.*;

public class Balance {

	public boolean check(String str) {

		char [] array = str.toCharArray();

		Deque<Character> stack = new ArrayDeque<>();

		for(char c : array) {

			if( c == '{' || c == '(' || c == '[') {
				
				stack.push(c);
				continue;
			}

			if(stack.isEmpty()){
				return false;
			}

			char open = stack.pop();

			if( (open == '(' && c !=')') 
				|| (open == '{' && c !='}')
				|| (open == '[' && c !=']')) {
				return false;
			}

		}
		return stack.isEmpty();
	}
}