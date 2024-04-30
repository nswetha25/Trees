// To practice inner class first understand the concepts. Having a class inside another class is generally called inner class. But there are 3 types in it
//First is Member inner class where we have a class that is directly present inside a class and we access it either by creating objecting inside the parent
//class or by creating object inside main method but with parentclass.childclass objrefer=onjectoofparentclass.new childclass
//Next is Static innerclass which means having static keywrd before class. we cannot have static for the main class as we saw in previous lectures
//But we can have static for inner class it is basically considered as a static member for the outer class.To access it there is no necessary for the parent
//class object. we can directly access it using parentclass.childclass objeref=new parentlcass.childclass
//Third type is anonymous inner class which means instead of creating a new class to just extend the functionalaity of anothe class we can directly 
//create an anonymous class while creating the object. But one drawback is we cannot have any extra methods apart from the methods present in the
//parent class.

//MemberInner class
class practice35{
	public void show() {
		practice36 p36=new practice36();
		p36.show();
		p36.disp();
		System.out.println("parent memberinner class");
	}
	public void showing() {
		System.out.println("parent class showing");
	}
	class practice36{
		public void show() {
			System.out.println("child memberinner class");
		}
		public void disp() {
			System.out.println("displaying child");
		}
	}
}
public class Innerclasspractice {

	public static void main(String[] args) {
		practice35 p35=new practice35();
		p35.show();
		p35.showing();
		practice35.practice36 p356=p35.new practice36();
		p356.show();
		p356.disp();
		
		
		

	}

}
