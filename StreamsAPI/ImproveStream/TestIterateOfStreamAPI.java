// Let's talk about iterate method
// there are two overloading method
// 2 parameter iterate must be break with limit method
// and 3 parameter iterate method have predicate Conditions

// Here first 
// Very Important things must be noted
// there two parameters have fist one is seed that means we wanna change item
// Secound things is UnaryOperator 
// But UnaryOperator's SAM method is apply not identity
// that identity method is static 
jshell> Stream.iterate(100, a -> a -10 ).limit(10).toList()
$6 ==> [100, 90, 80, 70, 60, 50, 40, 30, 20, 10]


// Here we have check with the predicate function

jshell> 
jshell> Stream.iterate(100, a -> a> 50 ,a -> a -10 ).toList()
$7 ==> [100, 90, 80, 70, 60]
