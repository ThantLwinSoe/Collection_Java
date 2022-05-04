import java.util.*;
import java.util.function.*;


public class SetLoop {

	public static void main(String [] args) {

		Set<Integer> obj = new HashSet<>();
		obj.add(1);
		obj.add(3);
		obj.add(6);
		obj.add(2);

		Iteration.forEach(obj);
		Iteration.forEachInternal(obj);


	}
}

class Iteration {

	static void forEach(Set<Integer> set) {

		for(int element : set) {
			System.out.println(element);
		}
	}

	static void forEachInternal(Set<Integer> set) {
		set.forEach(new Consumer<Integer>(){
			public void accept(Integer i){
				System.out.println(i);
			}
		});
	}
}