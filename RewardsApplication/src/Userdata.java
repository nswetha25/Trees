
public class Userdata {
	
	User users[]=new User[5];
	
	public Userdata() {
		users[0]=new User(1,"swetha","swetha",0);
		users[1]=new User(2,"Akhil","akhil",0);
		users[2]=new User(3,"deepthi","Deepthi",0);
		users[3]=new User(4,"sasi","Sasi",0);
		users[4]=new User(5,"vamsi","Vamsi",0);
		
		
	}
	public User[] getUsers() {
        return users;
    }

}
