package primenumbers;

public class PrimeNumberException extends Exception {

	@Override
	public String getMessage() {
		System.out.println("Entered number not a prime!");
		return super.getMessage();
	}

	@Override
	public void printStackTrace() {
		System.out.println("Entered number not a prime!");
		super.printStackTrace();
	}

}
