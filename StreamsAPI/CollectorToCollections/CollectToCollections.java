// Let's talk about Collect to collections
// Assume we have one list<Registration>
// we have mention about change form as previously

// Here list

jshell> List<Registration> list = Files.lines(Path.of("simple.txt")).
   ...> map( a -> new Registration(a)).toList()
list ==> [Registration {Aung Aung, 20210712, Online, Java  ... ine, Java Basic, 100000 }]

// so we filter the Java Basic Course
jshell> var filter = list.stream().filter( a -> a.getCoure().equals("Java Basic")).toList()
filter ==> [Registration {Aung Aung, 20210712, Online, Java  ... ine, Java Basic, 100000 }]

// So we need to change Only Name and Fees for Java Basic 
// So we use map

jshell> Map<String,Integer> map = filter.stream().
   ...> collect(Collectors.toMap( a -> a.getName(), a -> a.getFees())
   ...> )
map ==> {Aung Aung=100000, Khine Khine=100000, Nilar=300000, Kyaw Zin=100000}


// again we want to change value by object

jshell> Map<String,Registration> ok = filter.stream().
   ...> collect(Collectors.toMap( a -> a.getName(), a -> a))
ok ==> {Aung Aung=Registration {Aung Aung, 20210712, Onl ... ine, Java Basic, 100000 }}

jshell> ok
ok ==> {Aung Aung=Registration {Aung Aung, 20210712, Online, Java Basic, 100000 }, 
Khine Khine=Registration {Khine Khine, 20220120, Online, Java Basic, 100000 }, 
Nilar=Registration {Nilar, 20210712, Offline, Java Basic, 300000 }, 
Kyaw Zin=Registration {Kyaw Zin, 20210930, Online, Java Basic, 100000 }}


// That's 
