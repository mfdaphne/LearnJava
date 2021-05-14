package truck.load;

import java.util.Scanner;

public class FetchInputFromUser {

	private ScannerService scannerService = new ScannerService();
	private Scanner scanner = scannerService.getScanner();

	public UserInput getUserInput() {

		UserInput userInput = new UserInput();

		System.out.print("Enter no. of Boxes :");
		int boxes = scanner.nextInt();
		userInput.setNoOfBoxes(boxes);

		System.out.println("Enter box weights :");
		int[] boxWeights = new int[boxes];
		for (int i = 0; i < boxes; i++) {
			boxWeights[i] = scanner.nextInt();
		}
		userInput.setWeights(boxWeights);

		System.out.println("Enter no. of Trucks :");
		int trucks = scanner.nextInt();
		userInput.setNoOfTrucks(trucks);

		return userInput;

	}

}
