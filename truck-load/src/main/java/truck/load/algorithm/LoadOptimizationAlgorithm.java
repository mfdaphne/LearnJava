package truck.load.algorithm;

import java.util.Arrays;

import truck.load.UserInput;

public class LoadOptimizationAlgorithm {

	public int calculateLoadOptimization(UserInput userInput) {

		int[] boxWeights = userInput.getWeights();

		int noOfTrucks = userInput.getNoOfTrucks();
		int[] weightInTrucks = new int[noOfTrucks];

		for (int i = 0; i < boxWeights.length; i++) {

			Arrays.sort(weightInTrucks);
			weightInTrucks[0] = weightInTrucks[0] + boxWeights[i];
		}

		Arrays.sort(weightInTrucks);

		int maxDiff = weightInTrucks[noOfTrucks - 1] - weightInTrucks[0];

		return maxDiff;
	}

}
