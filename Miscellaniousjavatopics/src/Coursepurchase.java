//Generally if I follow traditional approach where I have to call the coursepurchase method I have to create objects for all the classes and call it.If i do it
//my pgm is tightly coupled. But if I want to achieve loose coupling then i can use interface and follow this procedure but still in mani class we hve some dependecny
//as we are calling the parituclar class but in spring you dont even have that itseems. It is  100% loosely coupled


public class Coursepurchase {
	
	//this reference has the power to refer to javacourse,pythoncourse and sqlcourse
	private course course;
	
	public Coursepurchase(course course) {
		
		this.course=course;
		
	}
	
	public boolean buythecourse(int amount) {
		
//		Javacourse java=new Javacourse();
//		java.coursepurchase();
//		return true;
		
		//Now I have created an interface course.java where I have a abstract method and then I implemented this method in all the other classess. Now I can call
				//the methods generally with parent type reference Now for all the classes the parent type is course bec they all implements this course interface
		boolean type=course.coursepurchase();
		
		return type;
	}

}
