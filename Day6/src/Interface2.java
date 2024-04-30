// here object is not acting as a parrent class so there is no diamond prolem which means multiple inheritance is possible through interfaces
interface calc1{
	void add();
	void sub();
}
interface calc2{
	void mul();
	void div();
	
}
interface calc4{
	void disp();
}
class calc3 implements calc1,calc2,calc4{
	public void add() {
		
	}
	public void sub() {
		
	}
	public void mul() {
		
	}
	public void div() {
		
	}
	public void disp() {
		
	}
}
class calc5 implements calc1{
	public void add() {
		
	}
	public void sub() {
		
	}
}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
