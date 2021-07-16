/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * dominic, 21/4/2021 1106
 */

package C209_L01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author 20019349
 *
 */
public class MyBirthday {
public static void main(String[] args) {
		
		LocalDate birthDate = LocalDate.of(2003, 6, 11);
		
		// TODO Auto-generated method stub
		
		int year = birthDate.getYear();
		System.out.println("Year is " + year);
		
		Month month = birthDate.getMonth();
		System.out.println("The month that i was born in was  " + month);
		
		DayOfWeek day = birthDate.getDayOfWeek();
		System.out.println("The day i was born in was - " + day);
		

	}

}

