class Registration {

	private String name;
	private String date;
	private Type type;
	private String course;
	private int fees;

	Registration(String str) {
		var array = str.split("\t");
		this.name = array[0];
		this.date = array[1];
		this.type = Type.valueOf(array[2]);
		this.course = array[3];
		this.fees = Integer.parseInt(array[4]);
	}

	public String getName() {
		return this.name;
	}

	public String getDate() {
		return this.date;
	}

	public Type getType() {
		return this.type;
	}

	public String getCoure() {
		return this.course;
	}

	public int getFees() {
		return this.fees;
	}

	public String toString() {
		return String.format("Registration {%s, %s, %s, %s, %d }", name,date,type,course,fees);
	}

	public enum Type {
		Online,Offline;
	}
}