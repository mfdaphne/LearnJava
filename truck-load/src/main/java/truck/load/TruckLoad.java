package truck.load;

import truck.load.algorithm.LoadOptimizationAlgorithm;

public class TruckLoad {

	public static void main(String[] args) {

		FetchInputFromUser fetchInputFromUser = new FetchInputFromUser();
		UserInput userInput = fetchInputFromUser.getUserInput();

		LoadOptimizationAlgorithm algorithm = new LoadOptimizationAlgorithm();
		int maxWeight = algorithm.calculateLoadOptimization(userInput);

		System.out.println("Max weight diff is " + maxWeight);
	}

}
