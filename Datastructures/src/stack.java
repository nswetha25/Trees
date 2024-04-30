import java.util.Stack;
public class stack {
//code will work if I have add and remove in stack as the stack will extend vector compon which has these methods impleemnted. But its good practice to use push and pop
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(8);
		st.add(9);
		System.out.println(st.remove(0));
		
		st.push(10);
		st.add(23);
		System.out.println(st.pop());
		st.add(34);
		System.out.println(st);
		System.out.println(st.peek());

	}

}
