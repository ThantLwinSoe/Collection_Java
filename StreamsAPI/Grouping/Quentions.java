


jshell> Map<String,Registration> hm = list.stream().
   ...> collect(Collectors.groupingBy( a -> a.getName()))
|  Error:
|  incompatible types: inference variable R has incompatible bounds
|      equality constraints: java.util.Map<K,java.util.List<T>>
|      lower bounds: java.util.Map<java.lang.String,Registration>,java.lang.Object
|  Map<String,Registration> hm = list.stream().
|                                ^-------------...



jshell> HashMap<String,Registration> hm = list.stream().
   ...> collect(Collectors.groupingBy( a -> a.getName()))
|  Error:
|  incompatible types: inference variable R has incompatible bounds
|      equality constraints: java.util.Map<K,java.util.List<T>>
|      lower bounds: java.util.HashMap<java.lang.String,Registration>,java.lang.Object
|  HashMap<String,Registration> hm = list.stream().
|                                    ^-------------...


jshell> HashMap<String,Registration[][]> hm = list.stream().
   ...> collect(Collectors.groupingBy( a -> a.getName()))
|  Error:
|  incompatible types: inference variable R has incompatible bounds
|      equality constraints: java.util.Map<K,java.util.List<T>>
|      lower bounds: java.util.HashMap<java.lang.String,Registration[][]>,java.lang.Object
|  HashMap<String,Registration[][]> hm = list.stream().
|                                        ^-------------

jshell> HashMap<String,ArrayList<Registration>> hm = list.stream().
   ...> collect(Collectors.groupingBy( a -> a.getName()))
|  Error:
|  incompatible types: inference variable R has incompatible bounds
|      equality constraints: java.util.Map<K,java.util.List<T>>
|      lower bounds: java.util.HashMap<java.lang.String,java.util.ArrayList<Registration>>,java.lang.Object
|  HashMap<String,ArrayList<Registration>> hm = list.stream().
|                                              ^-------------...

jshell> HashMap<String,List<Registration>> hm = list.stream().
   ...> collect(Collectors.groupingBy( a -> a.getName()))
|  Error:
|  incompatible types: inference variable R has incompatible bounds
|      equality constraints: java.util.Map<K,java.util.List<T>>
|      lower bounds: java.util.HashMap<java.lang.String,java.util.List<Registration>>,java.lang.Object
|  HashMap<String,List<Registration>> hm = list.stream().
|               




jshell> var hm = list.stream().
   ...> collect(Collectors.groupingBy( a -> a.getName()))
hm ==> {Ko Thant=[Registration {Ko Thant, 20210715, Onli ... ne, Java Basic, 300000 }]}

jshell> 

// Yes Here is Type Buddy 

jshell> Map<String,List<Registration>> h = list.stream().
   ...> collect(Collectors.groupingBy( a -> a.getName()))
h ==> {Ko Thant=[Registration {Ko Thant, 20210715, Onli ... ne, Java Basic, 300000 }]}
|    update replaced variable show, reset to null


// This is down Type Nested Grouping
jshell> var t = list.stream().ngByConcurrent(   
   ...> collect(Collectors.groupingBy(a->a.getName() , Collectors.groupingBy( a-> a.getType())))
t ==> {Ko Thant={Online=[Registration {Ko Thant, 202107 ... e, Java Basic, 300000 }]}}

// with Type