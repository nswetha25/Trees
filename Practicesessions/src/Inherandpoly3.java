// Here I have shown multilevel inheritance to see how its printing. But if I had constructor it will be the first to print
class prac7{
	public void show() {
		System.out.println("showing prac6");
	}
}
class prac8 extends prac7{
	public void show() {
		System.out.println("showing prac7");
	}
}
class prac9 extends prac8{
	public void showing() {
		System.out.println("showing prac8");
	}
}
public class Inherandpoly3 {

	public static void main(String[] args) {
		
prac9 pp=new prac9();
pp.show();
prac7 pp1=new prac7();
pp1.show();
	}

}
