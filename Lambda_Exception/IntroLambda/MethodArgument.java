// Simple Single Method

public void write(String str) {
	System.out.println(str);
} 

// Lambda V1

(String str) -> {
	System.out.println(str);
}

// Lambda V2 omission the data type is Ok

(str) -> {
	System.out.println(str);
}

// Lambda V3 omission the data type and () but it has only one parameter

str -> {
	System.out.println(str);
}

// Lambda V4 it has only single code if two we insert {}

(str) -> System.out.println(str);

// Two parameter 
public int add(int i , int j) {
	return i+j;
}

// Lambda V1
(int i, int j) -> {
	return i+j;
}

// Lambda V2 Omission data type
(i,j) -> {
	return i+j;
}