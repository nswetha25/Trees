class Dog{
	private String name;
	private int age;
	private int cost;
	Dog(String nm,int ag,int cs){
		name=nm;
		age=ag;
		cost=cs;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getCost() {
//		return cost;
//	}
//	public void setCost(int cost) {
//		this.cost = cost;
//	}

		
	}
	


public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Dog d=new Dog("Swetha",28,34);
     System.out.println(d.getname());
     System.out.println(d.getage());
     
     


	}

}
