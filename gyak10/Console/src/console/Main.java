package console;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		try {
			readConsole(a);
		} catch (NumberFormatException | UnsupportedConsoleException e) {
			e.printStackTrace();
		}
	}

	public static void readConsole(int[] a) throws NumberFormatException, UnsupportedConsoleException {
		if (System.console() == null) {
			throw new UnsupportedConsoleException();
		}
		for (int i = 0; i < 5; i++) {

			a[i] = Integer.parseInt(System.console().readLine());
			if (a[i] < 1) {
				throw new NumberFormatException();
			}
		}
	}
}
