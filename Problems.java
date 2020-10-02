/* ITSS 3312 UTD ABDULLAH AL PROJECT 2
 * ITSS 3312 - 003
 */

public class Problems {
	{
	// Null. No use except to work as a class.
		
	}
	private static int n1; // Initializing Private variable n1. Only accessible via getter method
	
	//Setter method
	public static int getRand1(int maxRange, int minRange) { // getRand1 method to get random number 1 from the range.
		int mRand1 = (int) (Math.random() * (maxRange - minRange + 1) + minRange); // random number 1 generated
		n1 = mRand1;  // Setting mRand1 value to n1 
		return mRand1; // random number 1 returned to the main method
	}
	
	// Getter method
	public static int getN1() {
		return n1; //Returning n1 value to whichever method that calls it. 
	}
	
	
	private static int n2; // Initializing Private variable n2. Only accessible via getter method
	
	//Setter method
	public static int getRand2(int maxRange, int minRange) { // getRand1 method to get random number 2 from the range.
		int mRand2; // Starting variable mRand2.
		mRand2 = (int) (Math.random() * (maxRange - minRange + 1) + minRange); // random number 2 generated	
		do 
		{
			mRand2 = (int) (Math.random() * (maxRange - minRange + 1) + minRange); // random number 2 generated	
		} while (mRand2 == 0); // do-while loop to prevent any 0 value to be made, as it will crash
		n2 = mRand2; // Setting mRand2 value to n2
		return mRand2; // random number 2 returned to the main method		
	}
	
	// Getter method
	public static int getN2() {
		return n2; // Returning n2 value to whichever method that calls it.
	}
	
	
	
	/* ___________________________________________CONSTRUCTORS___________________________________________ */
	// Addition Constructor
	private static int a = 0; // Private variable to return the value of the addition sysAns as a.
	
	//Setter method
	public static int Addition(int rand1, int rand2) {
		 System.out.print(rand1 + " + " + rand2 + " = "); // Math Addition question displayed to the user.
		 int addition = rand1 + rand2; // System calculates the Addition problem, but does not show to user.
		 a = addition; // Setting addition value to a
		 return addition; // Returning addition
	}
	//Getter method
	public static int sysAnsA() {
		return a; // Returning a value to whichever method that calls it. Here Problems.sysAnsA in main method case "A" is calling it.
	}
	
	
	// Subtraction Constructor
	private static int s = 0;
	//Setter method
	public static int Subtraction(int rand1, int rand2) {
		int minuend = rand1 + rand2; // Initializing minuend variable to add the two generated numbers for the user. Not visible to user.
		System.out.print(minuend + " - " + rand2 + " = "); // Math Subtraction question displayed to the user.
		int subtration = minuend - rand2; // Initializing minuend variable to add the two generated numbers for the user. Not visible to user.
		s = subtration; // Setting subtraction value to s
		return subtration; // Returning subtraction
	}
	//Getter method
	public static int sysAnsS() {
		return s; // Returning a value to whichever method that calls it. Here Problems.sysAnsS in main method case "S" is calling it.
	}
	
	
	// Multiplication Constructor
	private static int m = 0;
	//Setter method
	public static int Multiplication(int rand1, int rand2) {
		System.out.print(rand1 + " * " + rand2 + " = "); // Math multiplication question displayed to the user.
		int multiplication = rand1 * rand2; // System calculates the multiplication problem, but does not show to user.
		m = multiplication; //Setting multiplication value to m
		return multiplication; // Returning multiplication
	}
	//Getter method
	public static int sysAnsM() {
		return m; // Returning a value to whichever method that calls it. Here Problems.sysAnsM in main method case "M" is calling it.
	}
	
	
	// Division Constructor
	private static int d = 0;
	//Setter method
	public static int Division(int rand1, int rand2) {
		int product = 0; // Initializing a product variable
		product = rand1 * rand2; // Multiplying the two values and saving it in product, not visible to user.
		System.out.print(product + " / " + rand2 + " = "); // Math Division question displayed to the user.	The math problem will be the product value divided by rand2 value.	
		int division = product / rand2; // Calculates and sysAns for the user.
		d = division; //Setting division value to d
		return division; // Returning division
	}
	//Getter method
	public static int sysAnsD() {
		return d; // Returning a value to whichever method that calls it. Here Problems.sysAnsD in main method case "D" is calling it.
	}
	
	
	
	
	
	
	


}


