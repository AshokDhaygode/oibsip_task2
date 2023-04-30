// Java program for the above approach
import java.util.Scanner;

public class GuessThe_Number
 {
	// Function that implements the
	// number guessing game
	public static void
	guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in); // Scanner Class
		int number = 1 + (int)(100 * Math.random());  // Generate the numbers
		int K = 5; // Given K trials
		int i, guess;
		System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials."); // Iterate over K Trials
		
        for (i = 0; i < K; i++) {
			System.out.println( "Guess the number:");

			guess = sc.nextInt(); // Take input for guessing

			// If the number is guessed
			if (number == guess) 
            {
				System.out.println( "Congratulations!" + " You guessed the number.");
				break;
			}
			else if (number > guess && i != K - 1)
            {
				System.out.println("The number is " + "greater than " + guess);
			}
			else if (number < guess && i != K - 1)
            {
	             System.out.println("The number is" + " less than " + guess);
			}
		}

		if (i == K)
        {
			System.out.println("You have exhausted" + " K trials.");
			System.out.println( "The number was " + number);
		}
	}

	public static void   // Driver Code
	main(String arg[])
	{
		guessingNumberGame(); // Function Call
	}
}
