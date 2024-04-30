import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// create a quiz (5 questions)
		// create 5 questions
		// create question from user 
		// Lets introduce to have a class QuestionService which is responsible to create those 5 questions- create, get,delete
		// Once after creating the questions we need to store those qns. Right now lets store in an arrya
		QuestionService qs=new QuestionService();
		//qs.displayQuestions();
		qs.playquiz();
		
//		// I wrote the below code just to see the result array what user has entered I mean all the answers fro all the questions
//		String[] userSelections = qs.getSelection();
//
//        // Print the values stored in the selection array
//        for (String selection : userSelections) {
//            System.out.println(selection);
//        }
		//Setting up the timer below
		
		Timer timer=new Timer();
		
		CountDownLatch latch = new CountDownLatch(1);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time's up!");
                qs.printScore();
                latch.countDown(); // Release the latch
                timer.cancel(); // Terminate the timer
            }
        }, 20 * 1000); // 20 seconds * 1000 milliseconds

        // Wait for the timer to expire or for the user to complete the quiz
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}