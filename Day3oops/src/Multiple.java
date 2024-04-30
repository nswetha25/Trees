// Java does not support multiple inheritance where a child cant have more than one parent. In this case we cant extend Calcpro and calc at once but it supports multilevel
// inheritance that is the reason first we extends Calcpro and then in Calcpro we extend calc.
public class Multiple extends Calcpro{
	public void mul(int a,int b) {
		System.out.println(a*b);
	}

}
