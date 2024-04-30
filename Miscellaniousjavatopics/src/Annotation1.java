//Functional interface-so we can use lambda expression. so that the future user will have an understanding that this is an functional interface and if we touch this
//the code written using lambda expre will get affected.
//But if I add another method the compiler will not throw any error but lambda expression will get affected.But to avoid this and making the compiler throw error
// we can use annotation '@FunctionalInterface it will make sure no one tries to add another method. 

@FunctionalInterface
interface test{
	void learn();
	
	
}

//THis is the comments only for developer level not for complier level .

class plane{
	
	public void flightheight() {
		System.out.println("plabe fligs");
	}
	
}

class autoplane extends plane{
	
	
	//If i dont use override there are high chances that we many miss some spellings and when we call the method then it gives the other one which is not 
	//expected.If i dont want this to happen then I will embed to the compiler that I am planning to override some method present in parent class. If I dont have
	//this then we get confused
	@Override
	public void flightheight() {
		System.out.println("cargo plane fligs");
	}
	
	
}
public class Annotation1 {

	public static void main(String[] args) {
		
		plane p=new autoplane();
		p.flightheight();

	}

}
