//StreamAPI was introduced in Java 8
//Functional Programming - They make functions as a first class citizens
//object oriented prgm- In java objects are the first class citizens
//var=function(){}-- Javascript we do this func. pgming

//Mutation -good
//Thread- good
//Mutation+thread- bad (
//Generally multithreading is not done in banking application as they dont want to take risks but we can use that in Games as we dont consider this small glitch

//Why stream API came is initally when big data became famous we dont want all the data and we need to filter out the necessary ones and use it and this is not
//done in java and we depend on other lang like scala for this. ALso there are many frameworks like Map reduce, hadoop, spark. But after finding this problem java
//came with the powerful feature Stream API for this whichcan solve these problems.
//because we have to duplicate the data to perform some operations
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
public class StreamDemo1 {

	public static void main(String[] args) {
		//We are working with huge amount of data
		//Listen to his stream API introduciton lecture once.


List<Integer> lst=Arrays.asList(10,20,30,40,2);


//lst.forEach(n->System.out.println(n));
//lst.forEach(System.out::println);//we can also use this which give same result like above. THis is like funcitonal prgming

//I want to double all the values
//lst.forEach(n->System.out.println(n*2));//we are doubliing the value while printing it but we are not saving it anywhere to use for future purpose
//we can use list to double the value and thenprint it but we have one more way for this using streamAPI

//here we are creating the stream and filling the values from the list. Even If I change any value in the stream it will not affect bec it acts like a duplicate
Stream<Integer> stream1=lst.stream();

//stream1.sorted();// Here we get an exception that stream has already been used once we cant reuse the same one again
//To solve the above exception we can store this stream in to a new stream of integers.

Stream<Integer> stream2=stream1.sorted();//Everytime we perform a new operation we duplicate the value



//stream2.forEach(n->System.out.println(n*2));//Here we will have stream2 but stream1 data will be collected by GC we cant reuse it again once it is done its done

//Above doubling the value directly is not good as we are not storing anywhere so lets have it in another place and then use it

Stream<Integer> stream3=stream2.map(n->n*2);//Here map is a method where it takes the value and do some operations. so we are using stream which has sorted values and then doing the operation to store it in any stream

// stream3.forEach(System.out::println);

//Lets do the above map doubleing in another way using anonymous inner class

Function<Integer,Integer> func=new Function<Integer,Integer>(){
	public Integer apply(Integer x) {
		return x*2;
	}
};

Stream<Integer> stream4=stream3.map(func);

stream4.forEach(System.out::print);







	}

}
