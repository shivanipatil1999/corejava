package exceptionhandling;

public class InvalidAgeException extends Exception {

	public InvalidAgeException() {
	
	}

	public InvalidAgeException(String message) {
		super(message);
		
	}

	public InvalidAgeException(Throwable cause) {
		super(cause);
	}

	
}
