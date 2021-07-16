/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * dominic, 21/4/2021 1106
 */

package C209_L01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 20019349
 *
 */
public class DateTimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalDate aDate = LocalDate.of(2021, 8, 24);
				System.out.println(aDate);
		System.out.println("day: "+aDate.getDayOfMonth());
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("time : "+currentTime);
		
		LocalTime atime = LocalTime.of(21, 24, 18);
		System.out.println(atime);
		
		System.out.println("second: " + atime.getSecond());
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);   
		
		LocalDateTime aDateTime = LocalDateTime.of(2021, 8, 21, 18, 24);
		System.out.println(aDateTime);
		
		DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String d = "18/08/2021";
		LocalDate dateD = LocalDate.parse(d, ft);
		System.out.println(dateD);
		
		DateTimeFormatter ft2 = DateTimeFormatter.ofPattern("G yy MM, d");
		String result = dateD.format(ft2);
		System.out.println(result);
		
		


	}

}
