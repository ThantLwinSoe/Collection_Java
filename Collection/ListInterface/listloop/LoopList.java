import java.util.*;
import java.util.function.*;


public class Looplist {

	public static void main(String [] args) {

		List<Integer> ok = List.of(1,2,3,4,7,8,9);
		Iteration.forEachInternal(ok);
		Iteration.forEachExternal(ok);
		Iteration.LegaceyFor(ok);

	}
}

class Iteration {

	public static void forEachInternal(List<Integer> list) {
		list.forEach(new Consumer<>(){
			public void accept(Integer data){
				System.out.println(data);
			}
		});
	}

	public static void forEachExternal(List<Integer> list) {
		for(var data : list) {
			System.out.println(data);
		}
	}

	public static void LegaceyFor(List<Integer> list) {
		for(int i= 0 ; i < list.size() ; i ++) {

			System.out.println(list.get(i));
		}
	}
}