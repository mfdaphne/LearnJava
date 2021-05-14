package truck.load;

import java.util.Scanner;

public class ScannerService {

	private Scanner scanner = new Scanner(System.in);

	public Scanner getScanner() {
		return scanner;
	}

	public void closeScanner() {
		scanner.close();
	}
}
