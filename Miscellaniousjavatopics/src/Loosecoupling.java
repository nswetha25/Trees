//In java generally if we want to display any method present in any calss there are 2 ways one is through composition means having the object created in another class'
//and then calling the method. Otherwise having inheritance . SO this makes them Tightly coupled to each other . Generally spring solves thie problem of tight
//coupling by making sure that deletion of one class will not affect other class by loose coupling. In java also we can do loose coupling which we will see int he below class

public class Loosecoupling {

	public static void main(String[] args) {
		
		//this is the traditional way to call a class and use that method and we call this method as Composition in java. 
//		Javacourse java=new Javacourse();
//		java.coursepurchase();
		
		//Here through constructor I am injecting the dependecy to the target class which is called constructor injection
		Coursepurchase cp=new Coursepurchase(new Pythoncoourse()); //see I am not going creating any objects inn java,puthon or sql course but I am extending the interface couse
		//But in Coursepurchase I am creating a reference to that interface and having the mthod that accepts these types of classes
		
		//I think I have to look this concept one more time
		
		
		
	}

}
