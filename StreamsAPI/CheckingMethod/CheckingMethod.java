// Let's talk about Checking method of stream API
// like a allMatch, anyMatch, noneMatch

Boolean test = IntStream.rangeClosed(5, 10). // IntStream (1 to 10)
			   allMatch( integerFromStream -> integerFromStream / 5 == 0); // This will return false 
// Becus of allMatch Method will check all ture of parameter predicate

Boolean test = IntStream.rangeClosed(5,10).
			   anyMatch( integerFromStream -> integerFromStream / 5 == 0); // This will true
// anyMatch Method only one true will true

Boolean test = IntStream.rangeClosed(1,4).
			   noneMatch( integerFormStream -> integerFromStream / 5 == 0); // This will ture 
// noneMatch method is the all of false will return false;			   