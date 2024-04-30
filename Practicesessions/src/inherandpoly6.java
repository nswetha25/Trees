// Here first if I dont specify anyting preference is always given to local so '11' is printed. But if I want to print value '9' then which is printing
//the existing instance class or current class variable, then we use 'this' keyword.Next if I want to get parent class/super clas variable 
//value then i should use super keyword
class p{
	int num=10;
}
class q extends p{
	int num=9;
	public void show() {
		int num=11;
		//System.out.println(num);
		//System.out.println(this.num);
		System.out.println(super.num);
	}
}

public class inherandpoly6 {

	public static void main(String[] args) {
		q obj=new q();
		obj.show();

	}

}
