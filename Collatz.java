// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int collatz = 0;
		int numOfRuns = 2;

		if (mode.equals("v")) {
		int number = 1;
		for (; number <= seed; number++ ){
			System.out.print(number + " ");
			collatz = number;
			if (collatz % 2 == 0) {
				collatz = collatz / 2;
				System.out.print(collatz + " ");
			}
			else {
				collatz = collatz * 3 + 1;
				System.out.print(collatz + " ");
			}

			for (numOfRuns = 2; collatz != 1;) {
				
				if (collatz % 2 == 0) {
					collatz = collatz / 2;
				}
				else {
					collatz = collatz * 3 + 1;
				}
				System.out.print(collatz + " ");
				
				numOfRuns ++;
			
			}
			System.out.print("(" + numOfRuns + ")");
			System.out.println();
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}

		if (mode.equals("c")) {

			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
			
			}
	}

