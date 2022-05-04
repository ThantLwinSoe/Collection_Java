

/* We want to use the Custrom Object at the Collections.max() method 
 * But We can not use without override compareTo Method 
 * Because max() method source code had used compareTo()
 * So we need to override compareTo()
 * That it bro
 */ 
// Creat Custrom Class 

class Data implements Comparable<Data> {

	private String value;

	Data(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	public int compareTo(Data other) {
		if(null != other) {
			return this.value.compareTo(other.value);
		}

		return 1;
	}
}

/* Now We have OverrideMethod()
 */

Collection<String> ok = Set.of(new Data("A"), new Data("B"), new Data("C"));
// It is work well
Collectons.max(ok);
Collections.min(ok); 