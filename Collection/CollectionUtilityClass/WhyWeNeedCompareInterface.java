
// Create Collection Object
Collection<Integer> obj = Set.of(1,2,3,4,5);

// Test Collections Utility Class
Collections.max(obj);

Collections.min(obj);

// Yes It is work correctly.
// Creat String Collection Object
Collection<String> obj2 = Set.of("A", "B", "C", "D");

Collections.max(obj2);
Collections.min(obj2);

// Yes it is working well.

// Creat Custrom Object in the Collection Object

Collection<Data> obj3 = Set.of(new Data("A"), new Data("B"), new Data("C"));
Collections.max(obj3);
Collectons.min(obj3);

// It will be Exception
// Custrom Object cannot be Compareable
// Custrom Object need to implement Comparable interface for the compare to

