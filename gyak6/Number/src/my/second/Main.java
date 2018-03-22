package my.second;

import my.first.Number;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random r = new Random();
		final Number n = new Number(r.nextDouble());

		System.out.println(n.getNumber());

		int counter = 0;
		double rNum;
		do {
			rNum = r.nextDouble();
			counter++;
			System.out.println(rNum);
		} while (n.inTolerance(rNum));
		System.out.println(counter);
	}

}
