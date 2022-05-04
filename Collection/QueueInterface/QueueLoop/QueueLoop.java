import java.util.*;
import java.util.function.*;




public class QueueLoop {

	public static void main(String [] args) {

		Queue<String> queue = new ArrayDeque(Set.of("Hello","Thant","Lwin","Soe","Angular","TypeScript"));

		QueueIteration.forEachInternal(queue);
		QueueIteration.forEachExternal(queue);
		QueueIteration.loop(queue, true);
		QueueIteration.loop(queue,false);

	}
}

class QueueIteration {

	public static void forEachInternal(Queue<String> str) {
		str.forEach( new Consumer<>(){
			public void accept(String data) {
				System.out.println(data);
			}
		}); 
	}

	public static void forEachExternal(Queue<String> str) {
		for(String obj : str) {
			System.out.println(obj);
		}
	}

	public static void loop(Queue<String> str, boolean first) {

		Deque<String> deque = new ArrayDeque<>(str);

		while(!deque.isEmpty()){

			if(first) {
				System.out.println(deque.pollFirst());
			} else {
				System.out.println(deque.pollLast());
			}

		}

	}
}