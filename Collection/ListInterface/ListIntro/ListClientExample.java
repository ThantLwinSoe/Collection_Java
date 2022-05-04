import java.util.*;

public class ListClientExample {

	private List list;

	public ListClientExample() {

		list = new LinkedList();
	}

	private List getList(){

		return list;
	}

	public static void main(String [] args) {

		ListClientExample otherList = new ListClientExample();
		List ok = otherList.getList();
		System.out.println(ok);
	}

}