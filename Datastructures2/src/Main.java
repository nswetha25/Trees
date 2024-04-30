
public class Main {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(20);
		st.push(50);
		st.push(40);
		st.pop();
		st.push(40);
		st.push(40);
		
		st.push(40);
		st.pop();
		System.out.println("peek :"+st.peek());
		st.disp();

	}

}
