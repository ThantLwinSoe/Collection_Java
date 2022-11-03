// Let's talk about FlapMap Method of Stream API
// we have one list, we want to change data by the list data
// this situration we can use flapmap
// Here we go 

List<Integer> list = List.of(1,2,3,4);

// first 1 turn, we want to generate one random
// and secound 2 turn, we want to generate two random and so on
// so we use flapMap

List<Interger> resultList = list.stream(). // change Stream<Integer>
							flapMap( thisIsIntStream -> Stream.generate(Math :: random).Limits(thisIsIntStream)). // Stream<Double> Bcus random
							map(thisIsDoubleStream -> (int) (thisIsDoubleStream * 100)). // Stream<int>
							toList(); // List<Integer>

// yes That is it!!!

