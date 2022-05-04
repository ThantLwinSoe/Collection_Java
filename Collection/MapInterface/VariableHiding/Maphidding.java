class Maphidding {

	private Map<Integer, String> map;

	// this namp is hidding because of none of initiate
	private Map<Integer, String> nmap;


	Maphidding() {
		this.map = new HashMap<>();
	}

	boolean add(int i, String str) {
		map.put(i,str);

		return true;
	}
}