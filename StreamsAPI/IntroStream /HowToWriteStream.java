// Before Stream API

// create list - 1,2,3,4
List<Integer> list = List.of(1,2,3,4);

// wanna add all integer
int total = 0;
// this will return all of the sum result
for(int ok : list){
	total += ok;
}



// After StreamAPI
// create list - 1,2,3,4
List<Integer> list = List.of(1,2,3,4);

// wanna add all integer
// creat stream type from list
Stream<Integer> strean = list.stream();

// change to IntStream Type from Stream
IntStream ok = stream.mapToInt( a -> a); // mapToInt(IntToFuntion interface) method have SAM of IntToFunction Interface 
// IntStream class have sum() method
ok.sum();