import java.util.*;
import java.util.function.*;


public class WhyWeUseIterator {

	public static void main(String [] args) {


		Collection<Integer> collection = new HashSet<>(Set.of(1,2,3,4,5,6));

		// This loop occoured java.util.ConcurrentModificationException
		// You not get remove
		
		// removeEven(collection);

		updateRemoveEven(collection);



	}

	static void removeEven(Collection<Integer> collection) {
		for (int i : collection) {
			if( i%2 == 0 ) {
				collection.remove(i);
			}
		}
	}

	static void updateRemoveEven(Collection<Integer> collection) {

		Iterator<Integer> iterator = collection.iterator();
		while(iterator.hasNext()) {
			Integer i = iterator.next();

			if(i%2 == 0){
				iterator.remove();
			} 
		}

		System.out.println(collection);

		// System.out.println("Iterator " + iterator);

	}

}