// Let's talk about CollectionsMethod
// We have mention Files data to List<Object> as priveously
// Here we go

List<Registration> list = Files.lines(Path.of("simple.txt")). // Stream<String>
					 map( stringStream -> new Registration(stringStream)). // Stream<Registration>
					 collect(Collections.toList()); // List<Registration>


// Here we have List<Registration>
jshell> List<Registration> list = Files.lines(Path.of("simple.txt")).
   ...> map( stringStream -> new Registration(stringStream)).toList()
list ==> [Registration {Aung Aung, 20210712, Online, Java  ... ine, Java Basic, 100000 }]

// So we want to find Only Online Course Students info
jshell> List<Registration> javaBasic = list.stream().
   ...> filter( rgObject -> rgObject.getType().toString().equals("Online")).
   ...> toList()
javaBasic ==> [Registration {Aung Aung, 20210712, Online, Java  ... ine, Java Basic, 100000 }]


javaBasic ==> [Registration {Aung Aung, 20210712, Online, Java Basic, 100000 }, 
Registration {Mu Mu, 20210821, Online, Spring, 150000 }, 
Registration {Hla Hla, 20211024, Online, Spring, 150000 }, 
Registration {Khine Khine, 20220120, Online, Java Basic, 100000 }, 
Registration {Ko Thant, 20210715, Online, Linux, 350000 }, 
Registration {Kyaw Zin, 20210930, Online, Java Basic, 100000 }]


// We need to more details info about Spring
jshell> List<Registration> springOnline = javaBasic.stream().
   ...> filter( rgObject -> rgObject.getCoure().equals("Spring")).toList()
springOnline ==> [Registration {Mu Mu, 20210821, Online, Spring, 1 ...  Online, Spring, 150000 }]

jshell> springOnline
springOnline ==> [Registration {Mu Mu, 20210821, Online, Spring, 150000 }, Registration {Hla Hla, 20211024, Online, Spring, 150000 }]

// Here we go
// So we can estimate about fees
jshell> var total = springOnline.stream().
   ...> mapToInt( ob -> ob.getFees()).boxed().collect(Collectors.summingInt( a -> a))
total ==> 300000

// Noted IntStream have only three Parameters
// if we use above method as collect(Colector<>)
// We need to change Stream<Integer> by using boxed()