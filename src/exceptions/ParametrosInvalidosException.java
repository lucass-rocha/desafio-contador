package exceptions;

public class ParametrosInvalidosException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	String message;

	public ParametrosInvalidosException(String message) {
		super(message);
	}
	
	
}
