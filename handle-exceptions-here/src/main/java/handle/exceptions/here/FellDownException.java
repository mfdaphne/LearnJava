package handle.exceptions.here;

public class FellDownException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public FellDownException() {
		super("I fell down");
	}

	public FellDownException(String message) {
		super(message);
	}

}
