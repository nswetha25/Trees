class Dog1{
	private String name;
	private int age;
	private int cost;
	
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public int getcost()
	{
		return cost;
	}
	Dog1(){
		//super();
		System.out.println("cons");
	}
	Dog1(String name,int age,int cost){
		
		//this();
		
		this.name=name;
		this.age=age;
		this.cost=cost;
	}
	
}
public class constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dog1 d1=new Dog1("Sheru",20,345);
		Dog1 d1=new Dog1();
		System.out.println(d1.getname());
		System.out.println(d1.getage());
		System.out.println(d1.getcost());
		Dog1 d2=new Dog1("Swetha",23,4555);
		System.out.println(d2.getname());
		System.out.println(d2.getage());
		System.out.println(d2.getcost());
		Dog1 d3=new Dog1();
		System.out.println(d3.getname());
		System.out.println(d3.getage());
		System.out.println(d3.getcost());

	}
 
}
