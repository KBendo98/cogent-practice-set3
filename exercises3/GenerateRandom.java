package exercises3;

import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		System.out.println("Random number: " + getRandomNumber());
	}
	
	public static int getRandomNumber() {
		// Generates a different random number each time you run the program
		Random random = new Random(System.currentTimeMillis());
		
		// The random number will be between 0-100 (inclusive)
		int randNumber = random.nextInt(101);
		
		return randNumber;
	}
}
