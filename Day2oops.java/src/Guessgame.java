import java.util.*;
class Guesser{
	int guessnumber;
	public int guessthenum() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Guess the number");
		guessnumber=scan.nextInt();
		return guessnumber;
	}
}
class Player{
	int guessthenumber;
	//int count;
	public int guessthenum() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the choice");
		guessthenumber=scan.nextInt();
		//count++;
		return guessthenumber;
	}
}
class Empire{
	int guessernumber;
	int playernumber1;
	int playernumber2;
	int playernumber3;
	int player1score;
	int player2score;
	int player3score;
	void collectguessernumber(){
		Guesser g=new Guesser();
		guessernumber=g.guessthenum();
	}
	public void collectplayernumber(){
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		playernumber1=p1.guessthenum();
		playernumber2=p2.guessthenum();
		playernumber3=p3.guessthenum();
		}
	public void comparenumber(){
		//Used if else loops
	
		if(guessernumber==playernumber1) {
			if(guessernumber==playernumber2 && guessernumber==playernumber3) {
				System.out.println("All three won the game");
				player1score += 1;
				player2score+=1;
				player3score+=1;
			}
			else if(guessernumber==playernumber2) {
				System.out.println("Player1 and player 2 won the game");
				player1score += 1;
				player2score+=1;
			}
			else if(guessernumber==playernumber3) {
				System.out.println("Player1 and player 3 won the game");
				player1score += 1;
				player3score+=1;
			}
			else {
		System.out.println("Player1 won the game");
		player1score+=1;
		}
	}
		else if(guessernumber==playernumber2) {
			if(guessernumber==playernumber3) {
		System.out.println("player2 and player 3won the game");
		player2score+=1;
		player3score+=1;
		}
			else {
				System.out.println("Player2 won the game");
				player2score+=1;
			}
		}
	else if(guessernumber==playernumber3) {
		System.out.println("player 3 won the game");
		player3score+=1;
	}
		else {
			System.out.println("None of them won the game");
	}
		
	}
	
	
		
			
			
}

public class Guessgame {

	public static void main(String[] args) {
		Empire em=new Empire();
		for(int i=0;i<5;i++) {
		em.collectguessernumber();
		em.collectplayernumber();
		em.comparenumber();
		}
		System.out.println("player1 :"+em.player1score);
		System.out.println("player2 :"+em.player2score);
		System.out.println("player3 :"+em.player3score);

	

}
}
