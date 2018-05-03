package console;

public class UnsupportedConsoleException extends Exception {

	@Override
	public String getMessage() {
		System.out.println("Unsupported Console");
		return super.getMessage();
	}

	@Override
	public void printStackTrace() {
		System.out.println("Unsupported Console");
		super.printStackTrace();
	}

}
