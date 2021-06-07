package handle.exceptions.here;

public class Zoo {

	public void continueWatching() throws FellDownException {
		System.out.println("Im happy");
	}

	public void watchingAnimals() {

		try {

			fellDown(12);

			System.out.println("Im still watching Tiger");

		} catch (WoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
//			e.printStackTrace();
		} catch (FellDownException e) {
			System.out.println(e.getMessage());
			try {
				continueWatching();

			} catch (Exception be) {

			}

		}

		finally {
			System.out.println("Eating icecream");
		}

	}

	public void fellDown(int i) throws WoundException, BandageException, FellDownException {

		if (i > 10) {
			if (i < 15) {
				throw new WoundException();
			}

			if (i < 20) {
				throw new BandageException();
			}

			throw new FellDownException();
		}

	}

}
