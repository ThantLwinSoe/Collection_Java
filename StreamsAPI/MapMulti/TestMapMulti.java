// let's talk about MapMulti
// MapMulti is used to two ways 
// we can use Map type and Flatmap type
// Here is Map Type

jshell> List<String> list = List.of("A","B","C","D")
list ==> [A, B, C, D]

jshell> var result = list.stream().
   ...> mapMultiToInt( (element, consumer) -> {
   ...>     consumer.accept(element.hashCode());}
   ...> )

jshell> result.boxed().toList()
$3 ==> [65, 66, 67, 68]


// Here is FlapMapType

jshell> var result = list.stream().mapMulti( (ele, consumer) -> 
   ...> {
   ...>     for(int i = 1; i <= ele ; i++){
   ...>         consumer.accept( "Hello" + i);}
   ...> })

jshell> result.toList()
$7 ==> [Hello1, Hello1, Hello2, Hello1, Hello2, Hello3, Hello1, Hello2, Hello3, Hello4]

