//There is a enum class abd by default all enums are extending that class which has diff methods . that is th reason we can use ordinal method which returns the
//index of that element present. Means those methods ppresent in enum class are getting inheritted in this enum

enum week{
	//lets create constants for this group week. Recommended to give in capitla letters as per standard. THEY BELong to week data type. so we are acheiving our own data type
	// they are groupd constants. 
	
	MON, TUE, WED, THU,FRI,SAT,SUN;
	
	
	
}
public class enum1 {
	
	enum RESULT{
		
		PASS, FAIL, NR;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		week w=week.MON;
		System.out.println(w);
		System.out.println(week.THU.ordinal());//Gives index
		System.out.println(week.values());//if I want to fetch the values in an array I need to go through loop and fetch them . Here this will give just the address
		week[] wk=week.values();
		
		for(week wek:wk){
			System.out.println(wek+" "+wek.ordinal());
			
		}
		
		

	}

}
