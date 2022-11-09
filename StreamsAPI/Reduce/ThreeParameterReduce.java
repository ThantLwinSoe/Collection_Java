// Let's talk about we have Product object 
// we don't want to use map method but we want to another type
// in this situration we use reduce method by three parameters

List<Product> list = Files.lines(Path.of("simple.txt")).
					 map( stringStream -> new Product(stringStream)).toList();
// here we got List<Product> object

int result = list.stream().reduce(0, 
			 (forResultType , listProduct) -> forResultType + listProduct.getPrice(), 
			 (resultInt , commingInt) -> resultInt + commingInt);
// finally we get value

// Here Collection
jshell> IntStream.rangeClosed(1,10).
   ...> collect( () -> new ArrayList<>(),
   ...> (result, ele) -> result.add(ele),
   ...> (list, ok) -> list.addAll(ok)) 
$1 ==> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

jshell> var t = IntStream.rangeClosed(1,10).
   ...> collect( () -> new ArrayList<>(),
   ...> (result, ele) -> result.add(ele),
   ...> (list, ok) -> list.addAll(ok))
t ==> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

jshell> t.getClass()
$3 ==> class java.util.ArrayList
 