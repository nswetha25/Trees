class Alien{
	
	private String nameq="swetha";
	
	public void disp(String name) {
		//this.name=name; if it has the same variable name then  using this keyword gives preference to the variable that we are passing and it stores in the 
		//oinstacne variable name
		 nameq=name;
		
	}
	public String getname() {
		return nameq;
	}
}
public class Practicethiskeyword {

	public static void main(String[] args) {
		
		Alien a=new Alien();
		a.disp("nade");
		System.out.println(a.getname());

	}

}
