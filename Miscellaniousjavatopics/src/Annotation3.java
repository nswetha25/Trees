//Lets have our own annotation. Annotation works based on the mechanism of @interface. Then a msg will reach to compiler that this is not a normal compiler but a
//annotation type is being created.
//we cant have everyannotation work everywhere we have to code that in such a way where this annotaiton can be placed
//where this ann can be used and till what time this power shold it have like till compile time or run time. For this we nned to have meta annotations that is 
//info about the annotations. 
//All the genral purpose annotations are part of lang package adn they need not be imported seperately but metaannotation is part of annotation type in lang paage which needs 
//to be imported seperately.
//@autowired we can apply this to field or method - so this is one of the target type

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;

//whenever we create annotation we have to specify two things Target and Retention . Target says to which places placing our annotation is valid and Retention says
//till what time this is valid till compile or runtime

//@Target(ElementType.TYPE) // Here type means this can be applied to interace ro class but if I use .Method then it theows error for thie annotation as it is being
//used before class
//If have to use differnt target places see below
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.LOCAL_VARIABLE,ElementType.TYPE,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)//This annotation has a file till JVM
@interface Cricketplayer{
	//we need to have something here right
	String country();
	
	int age();
}
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@interface runsscored{
	//If id ont want to give inside the annotation whereever it is placed then I cna give the values here only
	String country() default "Ind";
	
	
}
//we have to specify inside it what we have defined int he interface
@Cricketplayer(country="India",age=22)
class cricket{
	@Cricketplayer(country="India",age=30)
	@runsscored
	int runs;
	//@Cricketplayer // I cann not apply to constructo as I didnot speicfy in the target
	public cricket() {
		System.out.println("virat best");
	}

	
	public void setRuns( @Cricketplayer(country="India",age=30) int runs) {
		this.runs=runs;
		@Cricketplayer(country="India",age=32)
		int innings=333;
	}
	@Cricketplayer(country="India",age=34)
	public int getRuns() {
		return runs;
	}
	
}
public class Annotation3 {

	public static void main(String[] args) {
		
		cricket c=new cricket();
		c.setRuns(100);
		//NBelow is how to fetch the data present in annotation
		//by default the parent of all the annotations is Annotation
		Class cl=c.getClass();
		//In collection type all data is stordin objects so if I want to store in any specific form i have to type cast it right
		
		Annotation an= (Annotation) cl.getAnnotation(Cricketplayer.class);
		//Now I get the parent type annotation 
		Cricketplayer cp=(Cricketplayer)an;
		int age=cp.age();
		System.out.println(age);
		
		

	}

}
