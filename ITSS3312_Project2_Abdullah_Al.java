/*The project is a flash card where the user begins with typing their name in. 
 * After that they select what kind of Mathematical operation they would like to do, 
 * including Addition, Subtraction, Multiplication and Division. 
 * They can only select one operation per run of the program. After that, it will ask the user for the 
 * highest and lowest number of factors they would like to be involved in the math problems. Following that, 
 * they will be asked to input the number of problems they would like to solve.
 * It will then directly process the information and output a question to the user. 
 * If the user is correct, it will print out “Correct”, else it will say “Incorrect”. 
 * After going through the number of problems (iterations) that the user wanted, it will go the Session Summary 
 * where it will state the number of problems done, the number of correct answer, a score, the amount of time taken to complete 
 * the game along with the User’s name, the type of operation they did, and the date and time.
 * 
 * 
 * ------ANALYSIS------
 * The way this project works is complex. Instead of having one (1) class for the whole project, we have three (3). The driver method known as MohammedAbdullahAlIslam_Project2, and two other classes of Problem and Session.
 * The function of the Driver class is to take all user inputs about their name, number of problems, math operation, user answer, maximum range and minimum range. After getting these info, the math questions are generated out
 * to the user. But not everything occurs in the driver class or main method.
 * 
 * Problem class is being used for multiple functions. First of all, it is used to generate random value 1 and random value 2 and then returned to the main method when called upon. When we go into the Switch cases, more methods of 
 * Problems class are invoked from Addition, Subtraction, Multiplication or Division depending on user input. 
 * 
 * These values are called by the main method and then the user inputs their value. At the same time, all the information that are returned from the problem method are saved in different arrays to store values of random1, random2,
 * user answer among others.
 * 
 * All the values including user's answer, system's answer, values of various arrays are sent to the session class. In the session class, the userAns, sysAns and listResult are used to determine whether the user gave a correct or incorrect
 * answer, and then returns the result to the user while at the same time increasing userScore if the user is correct. The getUserScore setter is used to return the information back to whichever method calls upon it.
 * Finally the session summary method uses all the data from the various variables to output a summary of how many problems the user did; how many were right or wrong; the score; the time it took to complete the game; the number of problems
 * the user wanted to do and finally all the math problems are printed below by showing what the user had input, what the right answer was and whether each answers were Correct or Incorrect.
 * 
 * -----DESIGN-----
 * Designing took up 1/3 of the total time of the whole project. During design, I had to make sure where I would be putting each section of the code. This also included making sure that the driver class was able to call upon codes;
 * data from one class could be and would be transferred properly. The way the code flowed was also put into the design. Different iteration of the program was made, and then simplified over each iteration by using better coding or 
 * removing bulky and unused codes.
 * 
 * ______DRIVER CLASS______
 *  name : String
 *  ops : String
 *  caseName : String
 *  maxRange : int
 *  minRange : int
 *  numProblem : int
 *  sysAns : int
 *  userAns : int
 *  list1 : int array
 *  list2 : int array
 *  listAns : int array
 *  listResult : String
 *  listSysAns : int
 *  s : int
 *  mathOps : String
 *  
 * 	startTime : long
 * 
 * 		for-loop
 * 			rand1 : int
 * 			rand2 : int
 * 		  switch
 * 
 * 	 userResult
 * 		
 *  endTime : long
 * 
 * Session Summary
 * 
 * ***********************************************
 * 
 *  _____PROBLEM CLASS_____
 *  n1 : int private
 *  getRand1 setter method
 *  getN1 getter method
 *  
 *  n1 : int private
 *  getRand2 setter method
 *  getN2 getter method
 *  
 *  a : int private
 *  Addition setter method
 *  sysAnsA getter method
 *  
 *  s : int private
 *  Subtraction setter method
 *  sysAnsS getter method
 *  
 *  m : int private
 *  Multiplication setter method
 *  sysAnsM getter method
 *  
 *  d : int private
 *  Division setter method
 *  sysAnsD getter method
 *  
 *  ***********************************************
 *  _____SESSION CLASS_____
 *  uS : int private
 *  getResult method : void
 *  
 *  getUserScore : int
 *  sessionSummary : void
 *
 *  ***********************************************
 * 
 * -----TESTING------
 * For testing, I used various maximum and minimum ranges, along with differing number of problems and different operations. During testing, I made sure all the answers came out correct and the values were saved properly in the arrays,
 * and made sure the summary was correct. Any issues that arose during tests were debugged right away. Multiple forms of issues occurred during testing, but they were solved with little tweaking to the codes.
 */

import java.util.*;  // Importing Keyboard input.
// import java.util.concurrent.TimeUnit; // Importing TimeUnit conversion system.


/* DRIVER CLASS */
public class ITSS3312_Project2_Abdullah_Al {  

	public static void main(String[] args) {
		// Design Outline
		Scanner scan = new Scanner(System.in); // Initializing keyboard input called "scan" for the main method.
				// Main method

				// Get input values
				System.out.print("Enter your name: "); // Printing out asking user their name
				String name = scan.next(); 		 // Initializing String "name" and taking user input
				System.out.print("Enter 'A' for Addition, 'S' for Subtraction, 'M' for Multiplication, 'D' for Division: "); // Printing out asking user for type of math operation they want to perform
				String ops = scan.next();	 // Initializing String "ops" and taking user input for type of math problem they will be performing
				String caseName = null;			 // Initializing a string as caseName to let user know what operation they undertook.
				
				System.out.print("Please tell me your highest number: "); // Asking user their highest number by printing out
				int maxRange = scan.nextInt();    //	Initializing integer maxRange for the highest digit user wants to use and taking user input
				
				System.out.print("Please tell me your lowest number: "); // Asking user their lower number by printing out
				int minRange = scan.nextInt();    // Initializing integer maxRange for the lowest digit user wants to use and taking user input
				
				System.out.print("Please tell me the number of problems you want to do: "); // Asking user by printing out
				int numProblem = scan.nextInt();	 //	Number of Problems the user wants to do by invoking getProbNum method in the session class.
				
				int sysAns = 0;					 // Initializing integer sysAns, which is the Answer the system will calculate
				int userAns = 0;				 // Initializing integer useAns, which is the Answer the user will input
				
				int[] list1 = new int[numProblem]; // Initializing list1 array to save values of random number 1
				int[] list2 = new int[numProblem]; // Initializing list2 array to save values of random number 2
				int[] listAns = new int[numProblem]; // Initializing listAns array to save value of number of problems
				String[] listResult = new String[numProblem]; // Initializing listResult array and saving the results of "Correct" and/or "Incorrect"
				int[] listSysAns = new int[numProblem]; // Initializing listSysAns array to save the system answers.
				int s = 0; // Initializing s to keep count of user's score in the main method.
				String[] mathOps = new String[numProblem]; // Initializing mathOps array to save the operator used for each questions.
				
				long startTime = System.currentTimeMillis();  // Starting time for the clock when the user starts the application.
				
				// For Loop to keep the application running for whatever number of executions needed that the user inputs for the numProblem.
				for (int i = 0; i < numProblem; i++) { //i is number of instances which will decrease till i becomes 0 and then the loop will not execute anymore.	
					
					int rand1 = Problems.getRand1(maxRange, minRange); // initializing rand1 to get a random number from getRand1 method in Problems class
					int rand2 = Problems.getRand2(maxRange, minRange); // initializing rand2 to get a random number from getRand2 method in Problems class
					
					/* Operation cases (switch) for string ops. In the getOperation method, user will select what Operation they want
					 * to do. 
					 */
					switch (ops.toUpperCase()) 	
					{ 	
					//  Addition: If user presses A for input, it will start case 'A', for Addition.
						case "A":{
							caseName = "Addition"; // Case name Addition activated for the Session Summary. It is a permanent variable.
							mathOps[i] = " + "; // Saving operator in mathOps at i location
						    Problems.Addition(rand1, rand2); // Sending information to the method for Addition
							sysAns = Problems.sysAnsA(); // System calculates the Addition problem, but does not show to user.
							break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
						}
					
					//  Subtraction: If user presses S for input, it will start case 'S', for Subtraction.
						case "S": {	
							caseName = "Subtraction";	// Case name Subtraction activated for the Session Summary. It is a permanent variable.	
							mathOps[i] = " - "; // Saving operator in mathOps at i location
							Problems.Subtraction(rand1, rand2); // Sending information to the method for Subtraction
							sysAns = Problems.sysAnsS();	// System calculates the Subtraction problem, but does not show to user.
							break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
						}
					
					//  Multiplication: If user presses M for input, it will start case 'M', for Multiplication.
						case "M":{
							caseName = "Multiplication"; // Case name Multiplication activated for the Session Summary. It is a permanent variable.
							mathOps[i] = " * "; // Saving operator in mathOps at i location
							Problems.Multiplication(rand1, rand2); // Sending information to the method for Multiplication
							sysAns = Problems.sysAnsM(); // System calculates the multiplication problem, but does not show to user.
							break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
						}
					
					//  Division: If user presses D for input, it will start case 'D', for Division.
						case "D": {
							caseName = "Division"; // Case name Division activated for the Session Summary. It is a permanent variable.
							mathOps[i] = " / "; // Saving operator in mathOps at i location
							Problems.Division(rand1, rand2); // Sending information to the method for Division
							sysAns = Problems.sysAnsD(); // Calculates and sysAns for the user.	
							break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
						}
				   }
				
					listSysAns[i] = sysAns; // Saving value of sysAns to listSysAns in an array location
					list1[i] = rand1; // Saving value of rand1 to list1 array
					list2[i] = rand2; // Saving value of rand2 to list2 array
					userAns = scan.nextInt(); // Answer that the user inputs
					listAns[i] = userAns; // Saving user answer to listAns in one of the location	
					
					session.getResult(userAns, sysAns, listResult, i, s); // Invoking getResult method in the session class to check if user is Correct or Incorrect. s is also sent with the latest value during the current loop
					s = session.getUserScore(); // s returns with the new userScore if the result was correct;
				}
				
				long endTime = System.currentTimeMillis(); // Program ending time counted in millisecond.
				session.sessionSummary(numProblem, s, endTime, startTime, name, caseName, list1, list2, mathOps, listSysAns, listAns, listResult); // Invoking sessionSummary method in session class by sending variable values
				scan.close(); // Closing the keyboard input for the main method.
}
	
	}


/* SAMPLE TEST 1
 * Enter your name: Mohammed
 * Enter 'A' for Addition, 'S' for Subtraction, 'M' for Multiplication, 'D' for Division: d
 * Please tell me your highest number: 20
 * Please tell me your lowest number: 1
 * Please tell me the number of problems you want to do: 3
 * 18 / 18 = 1
 * Correct.
 * 342 / 18 = 15
 * Incorrect
 * 63 / 7 = 9
 * Correct.

 * Session Summary

 * 3 problems, 2 correct
 * Score is 66.0, Time is 7 seconds
 * Session for Mohammed was Division on 2020-09-27 at 01:50:12.309
 * 1 / 18 = 1 A: 1 Correct. 
 * 19 / 18 = 19 A: 15 Incorrect. 
 * 9 / 7 = 9 A: 9 Correct. 
 * 
 * 
 * SAMPLE TEST 2
 * Enter your name: Mohammed
 * Enter 'A' for Addition, 'S' for Subtraction, 'M' for Multiplication, 'D' for Division: a
 * Please tell me your highest number: 15
 * Please tell me your lowest number: 1
 * Please tell me the number of problems you want to do: 5
 * 1 + 9 = 10
 * Correct.
 * 2 + 4 = 6
 * Correct.
 * 3 + 7 = 11
 * Incorrect
 * 14 + 6 = 19
 * Incorrect
 * 8 + 4 = 12
 * Correct.

 * Session Summary

 * 5 problems, 3 correct
 * Score is 60.0, Time is 8 seconds
 * Session for Mohammed was Addition on 2020-09-27 at 21:21:43.494
 * 1 + 9 = 10 A: 10 Correct. 
 * 2 + 4 = 6 A: 6 Correct. 
 * 3 + 7 = 10 A: 11 Incorrect. 
 * 14 + 6 = 20 A: 19 Incorrect. 
 * 8 + 4 = 12 A: 12 Correct. 
 *
 * 
 */

