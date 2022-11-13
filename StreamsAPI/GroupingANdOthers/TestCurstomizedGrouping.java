// Let's talk about Customizing Group


jshell> Map<Registration.Type,Integer> results = Files.lines(Path.of("simple.txt")).
   ...> map( Registration::new).
   ...> collect(Collectors.groupingBy(Registration::getType,
   ...> Collectors.summingInt( a -> a.getFees())))
results ==> {Online=950000, Offline=710000}


jshell> results.size()
$3 ==> 2

jshell> results.keySet()
$4 ==> [Online, Offline]

jshell> var results = Files.lines(Path.of("simple.txt")).
   ...> map( Registration::new).
   ...> collect(Collectors.groupingBy(Registration::getType,
   ...> Collectors.summarizingInt( a -> a.getFees())))
results ==> {Online=IntSummaryStatistics{count=6, sum=950000, ... 77500.000000, max=300000}}

jshell> 
jshell> /vars results 
|    Map<Registration.Type,IntSummaryStatistics> results = {Online=IntSummaryStatistics{count=6, sum=950000, min=100000, average=158333.333333, max=350000}, Offline=IntSummaryStatistics{count=4, sum=710000, min=120000, average=177500.000000, max=300000}}

// we can do as we like 