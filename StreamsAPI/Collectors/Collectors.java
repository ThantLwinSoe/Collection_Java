// How to know collect argument accpect Collectors
// To ask Saya 

jshell> list.stream().collect(Collectors.summingDouble( a -> a))
$5 ==> 66.22

jshell> list.stream().collect(Collect
Collection    Collections   Collector     Collectors    
jshell> list.stream().collect(Collect


// Why collect() method can use Colletors like that 

// Accumulate names into a List
 List<String> list = people.stream()
   .map(Person::getName)
   .collect(Collectors.toList());

 // Accumulate names into a TreeSet
 Set<String> set = people.stream()
   .map(Person::getName)
   .collect(Collectors.toCollection(TreeSet::new));
