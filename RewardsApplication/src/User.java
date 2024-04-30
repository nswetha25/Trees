import java.util.ArrayList;
import java.util.List;

public class User {
	
	private int id;
	private String name;
	private String password;
	private int points;
	private List<String> giftcards;
	public User(int id,String name,String password, int points) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.points=points;
		this.giftcards=new ArrayList<>();
		//System.out.println("data is getting stored :"+id);
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public List<String> getGiftcards() {
		return giftcards;
	}
	public void setGiftcards(List<String> giftcards) {
		this.giftcards = giftcards;
	}
	
	//Here for every transaction the points will be updated
	public void addPoints(int points) {
		this.points +=points;
		
	}
	
	//User can redeem the gift cards and we will store those redeemed ones for future purpose to see to which gift cards he redeemed
	public void redeemgiftcards(String code) {
		giftcards.add(code);
	}
	
	
	

}
