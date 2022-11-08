// Let's talk about reduce method of Stream API
// reduce have three overload method
// Here two methods
// let's say we have IntStream and use sum method
// Here we go

int result = IntStream.rangeClosed(1,10).sum();

// result = 55
// Ok, Let's see the reduce(non identify)

OptionalInt result = IntStream.rangeClosed(1,10).
					 reduce((intStr1,intStr2) -> intStr1 + intStr2);
// result is OptionalInt Type with value 55

// Now Identitfy parameter added

int result = IntStream.rangeClosed(1,10).
			 reduce(1, (intStr1,intStr2) -> intStr1 + intStr2);
// will result = 56 becaus of identify is 1 will added result   
// we can customize as you like just like mult div
int result = IntStream.rangeClosed(1,10).
			 reduce(1, (intStr1,intStr2) -> intStr1 * intStr2);

int result = IntStream.rangeClosed(1,10).
			 reduce(1, (intStr1,intStr2) -> intStr1 - intStr2);			 
