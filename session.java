/* MOHAMMED ABDULLAH AL ISLAM PROJECT 2
 * ITSS 3312 - 003
 */
import java.util.concurrent.TimeUnit;

public class session {
		// updating User Score, code for Project 2 method.
	
		
		private static int uS; //Initializing Private variable uS. Only accessible via getter method
		
		// getResult method. The whole code is run in the main method as if it has been coded in the main method. Invoked by the session.getResult in the main method.
		public static void getResult(int userAns, int sysAns,  String[] listResult, int i, int s) {
			int userScore = s; // Current s value returning to userScore
			if (userAns == sysAns) { // If the user input and the system answer are equal, it will print out Correct on the screen
				System.out.println("Correct."); // If user is correct, this will print out.
				userScore++; // With correct answer, it will also increase the user's score.
				listResult[i] = "Correct. "; // Saving the outcome result to listResult in one of the location
				//listAns[i] = userAns; // Saving user answer to listAns in one of the location
				
			} 
			else {
				System.out.println("Incorrect"); // Else it will print Incorrect and not increase the user score.
				listResult[i] = "Incorrect. "; // Saving the outcome result to listResult in one of the location
				//listAns[i] = userAns; // Saving user answer to listAns in one of the location	
			}	
			uS = userScore; // Setting userScore to uS.
		}
		public static int getUserScore() {
			return uS;  // Returning a value to whichever method that calls it. Here session.getUserScore() is called by s in the main method to update it's value at the bottom.
		}
		
		//Session Summary Method
		public static void sessionSummary(int numProblem, int s, long endTime, long startTime, String name, String caseName, int[] list1, int[] list2, String[] mathOps, int[] listSysAns, int[] listAns, String[] listResult) { //Pulling all the data from main method
			
			// Time and Score calculation
			int percent = (int) ((s*100) / numProblem); // Calculation of the percentage the user scored. Answer will come out in percentage, not decimal.
			long totalTime = endTime - startTime; // Calculation of how long the program ran or how long it took the user to complete the game.
			double totalTimeinSeconds = (double) TimeUnit.MILLISECONDS.toSeconds(totalTime); // The time counted in milliseconds is converted to seconds.
			
			//  Session summary				
			System.out.println("\n" + "Session Summary" + "\n"); // Session Summary headline printed to the user
			System.out.println(numProblem + " problems, " + s + " correct"); // Prints the number of problems the user wanted to do and the number of answer they got correct.
			System.out.println("Score is " + Math.ceil(percent) + ", Time is " + Math.round(totalTimeinSeconds) + " seconds"); //Prints the score in percentage and the time it took the user.
			System.out.println("Session for " + name + " was " + caseName + " on " + java.time.LocalDate.now() + " at " + java.time.LocalTime.now()); // Prints the name of the user, the date and time the game was run.	
			
			// For-loop to print out 
			for(int i = 0; i < numProblem; i++) {
			System.out.println(list1[i] + mathOps[i] + list2[i] + " = " + listSysAns[i] + " A: " + listAns[i] + " " + listResult[i]); // Printing out the math problems for the session summary.
			}
			
			
		}
}		