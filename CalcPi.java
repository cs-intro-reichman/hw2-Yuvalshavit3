// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numOfTimes = Integer.parseInt(args[0]);
		int i = 0;
		int m = 1;
		double estimatedPI = 0;

		while (i < numOfTimes) {
			if (i % 2 == 0) {
				estimatedPI = estimatedPI + (1.0 / m);
			} else {
				estimatedPI = estimatedPI - (1.0 / m);
			}
			m = m + 2;
			i ++;

		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + estimatedPI*4);
		
	}
}
