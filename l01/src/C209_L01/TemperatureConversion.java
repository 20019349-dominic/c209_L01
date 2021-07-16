package C209_L01;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 20019349, 21 Apr 2021 11:11:11 am
 */

public class TemperatureConversion {

	public static void main(String[] args) {
		double celsius = 0.0;
		double fahrenheit = 0.0;
		String msg = null;

		celsius = Helper.readDouble("Enter a temperature in celsius > ");
		fahrenheit = (celsius * 1.8) + 32;
		msg = celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.";

		System.out.println(msg);
	}
}


