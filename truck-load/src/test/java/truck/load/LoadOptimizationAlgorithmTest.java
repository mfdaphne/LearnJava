package truck.load;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import truck.load.algorithm.LoadOptimizationAlgorithm;

public class LoadOptimizationAlgorithmTest {

	private LoadOptimizationAlgorithm algorithm = new LoadOptimizationAlgorithm();

	@Test
	public void calculateLoadOptimizationTestCase0() {
		int noOfBoxes = 4;
		int[] weights = { 1, 2, 3, 4 };
		int noOfTrucks = 3;

		UserInput userInput = new UserInput();
		userInput.setNoOfBoxes(noOfBoxes);
		userInput.setWeights(weights);
		userInput.setNoOfTrucks(noOfTrucks);

		int result = algorithm.calculateLoadOptimization(userInput);

		assertEquals(3, result);
	}

	@Test
	public void calculateLoadOptimizationTestCase1() {
		int noOfBoxes = 1;
		int[] weights = { 3 };
		int noOfTrucks = 1;

		UserInput userInput = new UserInput();
		userInput.setNoOfBoxes(noOfBoxes);
		userInput.setWeights(weights);
		userInput.setNoOfTrucks(noOfTrucks);

		int result = algorithm.calculateLoadOptimization(userInput);

		assertEquals(0, result);
	}

	@Test
	public void calculateLoadOptimizationTestCase2() {
		int noOfBoxes = 5;
		int[] weights = { 1, 2, 3, 4, 5 };
		int noOfTrucks = 1;

		UserInput userInput = new UserInput();
		userInput.setNoOfBoxes(noOfBoxes);
		userInput.setWeights(weights);
		userInput.setNoOfTrucks(noOfTrucks);

		int result = algorithm.calculateLoadOptimization(userInput);

		assertEquals(0, result);
	}

}
