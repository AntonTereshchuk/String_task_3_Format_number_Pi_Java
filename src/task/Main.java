package task;

public class Main {

	public static void main(String[] args) {

		int counter = 0;
		
		while (counter < 10) {
			System.out.println("Number Pi: " + String.format("%." + (counter + 2) + "f", Math.PI));
			counter += 1;
		}

	}

}
