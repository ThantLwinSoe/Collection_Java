



collect(Supplier<R> supplier, 
        BiConsumer<R,? super T> accumulator,
        BiConsumer<R,R> combiner);




jshell> String str = "Hello MoeMoe"
str ==> "Hello MoeMoe"


jshell> var t = str.lines().collect( () -> new StringBuilder(), // create type
   ...> (builder , ele) -> builder.append(ele), // operate 1
   ...> (result , builder) -> builder.reverse()); // operate 2 did not work
t ==> Hello MoeMoe


jshell> var t = str.lines().collect( () -> new StringBuilder(),
   ...> (builder , ele) -> builder.append(ele),
   ...> (result , builder) -> 
   ...>     result.append(builder.append("How are you?"))) // operate 2 did not work
t ==> Hello MoeMoe
