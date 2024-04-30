import java.util.*;
public class QuestionService {
	//Below line is same as Question q1,q2,q3,q4,q5. But we are creating actual objects below in constructor
	Question questions[]=new Question[10]; // Creating an array for questions class of size 5. But here we just created array of question references. 
	//For each question we have to create object
	static int count=0;
	public QuestionService() {
		questions[0]=new Question(1,"size of integer datatype","2 bytes","4 bytes","8 bytes","16  bytes","4 bytes");
		questions[1]=new Question(2,"size of double datatype","2 bytes","4 bytes","8 bytes","16  bytes","8 bytes");
		questions[2]=new Question(3,"size of float datatype","2 bytes","4 bytes","8 bytes","16  bytes","4 bytes");
		questions[3]=new Question(4,"size of char datatype","2 bytes","4 bytes","2 bytes","16  bytes","2 bytes");
		questions[4]=new Question(5,"size of byte datatype","1 bytes","4 bytes","8 bytes","16  bytes","1 bytes");
		questions[0]=new Question(6,"Is array an object?","yes","No","sometimes","Not sure","yes");
		questions[1]=new Question(7,"Default value of boolean","false","true","0","1","false");
		questions[2]=new Question(8,"Instance variables are stored where?","Stack","Heap","SCP","Memory","Heap");
		questions[3]=new Question(9,"Local varaibales stored?","stack","heap","scp","memory","stack");
		questions[4]=new Question(10,"where the obj is created?","stack","heap","memory","nowhere","heap");
	}
	
	//Below we are creating one more array to store the answers for all the questions entered by the user to compare it with the original answers
	String selection[]=new String[5];
	
//	//Below method is just to send the result that user has selected to main method
//	
//	public String[] getSelection() {
//		return selection;
//	}
	//Generally when ever you try to print an object in this case ques behind the scene it uses toString method if I dont call any method after that
	public void displayQuestions() {
		for(int i=0;i<5;i++) {
		//to display random questions
			Question ques = getRandomQuestion();

			//Instead of printing like this manually I can use the toString method present in the object class to override it
		System.out.println(ques.getQuestion());
		System.out.println(ques.getOpt1());
		System.out.println(ques.getOpt2());
		System.out.println(ques.getOpt3());
		System.out.println(ques.getOpt4());
		
		//System.out.println(ques.toString());
		
		}
		
		}
		// How user plays the quiz
	public void playquiz() {
		int i=0;
		int count=0;
		for(Question q:questions) {
			System.out.println("Question :"+(i+1));
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			Scanner sc=new Scanner(System.in);
			//we can even skip the question
			System.out.println("Enter your answer or skip the quiz ");
			//selection[i]=sc.nextLine();
			String userresponse= sc.nextLine().trim();
			if(userresponse.isEmpty()) {
				System.out.println("Skipped the question");
			}
			else {
				selection[i]=userresponse;
				
				// Compare the user's answer with the correct answer
				if(q.getAnswer().equals(userresponse)) {
					 System.out.println("Correct!");
					 count++;
				}
				else {
					System.out.println("Incorrect!");
					count=count-2;
				}
				 System.out.println("Score so far: " + count);
				
			}
			
			
			
		}
		System.out.println("Do you want to play again? (yes/no)");
        Scanner playAgainScanner = new Scanner(System.in);
        String playAgainResponse = playAgainScanner.nextLine().trim().toLowerCase();

        if (playAgainResponse.equals("yes")) {
            playquiz(); // Recursive call to play the quiz again with new questions
        } else {
            // If the user does not want to play again, print the final score
            System.out.println("Final Score: " + count);
        }
    }
	
	
	public void printScore() {
		int count = 0;

	    for (int i = 0; i < questions.length; i++) {
	        Question ques = questions[i];
	        String answer = ques.getAnswer();
	        String selectedOne = selection[i];

	        System.out.println("Question " + (i + 1) + ": " + ques.getQuestion());
	        System.out.println("Your answer: " + selectedOne);

	        if (answer.equals(selectedOne)) {
	        	//System.out.println("correct answer");
	            count++;
	           // System.out.println("Correct! Score right now: " + count);
	        } 
	        else 
	        {
	            // To add negative marking
	            count = count - 2;
	            //System.out.println("Incorrect! Score right now: " + count);
	        }

	        // To see real-time score after every question
	        System.out.println();
	    }

	    System.out.println("Final Score: " + count);
	    
	}
	    //This is used to select random questions from the questions list
	    private Question getRandomQuestion() {
	        Random random = new Random();
	        int randomIndex = random.nextInt(questions.length);
	        return questions[randomIndex];
	}
}
	
	

