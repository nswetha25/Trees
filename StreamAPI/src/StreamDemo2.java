//Understand this collection is a place where u r storing the data whereas using stream u r maing it easy to work with that data 
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		List<Integer> lst=Arrays.asList(25,20,30,40,2);
		Stream<Integer> stream1=lst.stream();
		
		Stream<Integer> stream2=stream1.sorted();
		//we want only the numerb which are even number
		
		//To convert the below code in to lambda expression
		
//		Predicate<Integer> p= new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer x) {
////				if(x%2==0)
////					return true;
////				else
////					return false;
//				
//				//Instead of above logic we can simpley write
//				
//				return x%2==0;
//			}
//			
//		};
		
		//Predicate<Integer> p=x->x%2==0; This is lambda expresision but instead of doing this we can directly paste it below
		
		//Stream<Integer> stream3=stream2.filter(p);//Here filter is a interface which has a predicate
		
		Stream<Integer> stream3=stream2.filter(x->x%2==0);
		
		Stream<Integer> stream4=stream3.map(n->n*2);
		
		stream4.forEach(System.out::println);
		
		System.out.println("**************");
		
		//Cant we acheive the same thign using lists ? Yes we can but we have to manally do GC and it creates overhead. But with streams it is easy once a stream
		//is being using in another stream the previojs stream is collected by GC. Stream helps u to improve the performace at run time
		
		//So now as we have many diff streams getting created and its a lot of code so we can write like this belo
		
		List<Integer> lst2=Arrays.asList(5,20,40,80,90);
		
		lst2.stream().sorted().filter(x->x%2==0).map(x->x*2).forEach(System.out::println);//But remember list will have the same original values that is immutability but
		//stream will not have the previous values from list it performs all the operations and then give the final result
		

		
	}

}
