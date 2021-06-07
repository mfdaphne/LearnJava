package handle.exceptions.here;

public class WoundException extends FellDownException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public WoundException() {
		super("Im wounded !!! ");
	}

	public WoundException(String message) {
		super(message);
	}

}
