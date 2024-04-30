
// Encapsulatioon - Binding of variables and methods
class Alien{
	private int age=40;
	private String name="Hello";
	private String besttech="Java";
//	public String getName() {
//		return name;
//	}
//	public String seth(String techs) {
//		besttech= techs;
//		return besttech;
//	}
//	public void seth(String besttech) {
//		this.besttech=besttech;
//		//return besttech;
//	}
//	public String setvalue()
//	{
//		return besttech;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBesttech() {
		return besttech;
	}
	public void setBesttech(String besttech) {
		this.besttech = besttech;
	}
	
	
}
public class Accessspecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Alien a=new Alien();
String name=a.getName();
System.out.println(name);
//a.tech="Python";
//System.out.println(a.besttech);
//a.seth("world");
//System.out.println(a.setvalue());
//System.out.println(a.besttech);
	}

}
