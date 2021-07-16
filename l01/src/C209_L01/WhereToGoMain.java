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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * @author 20019349
 *
 */
public class WhereToGoMain {


public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LocalDate currentDate = LocalDate.now();
	System.out.println(currentDate);

	
		ArrayList<Country> countryList = new ArrayList<Country>();
		Country thailand = new Country("Thailand", 26.3, "Food, Massage,Shopping");
		Country japan = new Country("Japan", 11.15,"Food, Mount FUji");
		countryList.add(thailand);
		countryList.add(japan);
		int option = -1;
		while (option !=4) {
			menu();
			
			Helper.line(15, "=");
			System.out.println(currentDate);
			System.out.println("WHERE TO GO? ");
			Helper.line(15, "=");
			System.out.println("1.Warmer Countries");
			System.out.println("2.Colder Countries");
			System.out.println("3. Search for recommendation by activity");
			System.out.println("4. Quit");

			option = Helper.readInt("Enter an option ");
	
		
		if(option == 1) {
			Helper.line(15, "=");
			System.out.println("countries");
			Helper.line(15, "=");
			countriesByTemp(countryList,1);
		}else if(option ==2) {
			Helper.line(15, "=");
			System.out.println("countries ");
			Helper.line(15, "=");
			countriesByTemp(countryList,2);

		}else if(option ==3) {
			Helper.line(15, "=");
			System.out.println("countries");
			Helper.line(15, "=");
			countriesByTemp(countryList,3);

		}else if(option ==4) {
			System.out.println("Good Bye ! ");

		}else {
			System.out.println("Invalid option");
		}
		}
		
	}
	
	public static void countriesByTemp(ArrayList<Country> countryList, int choice) {
	for (int i = 0; i<countryList.size(); i++) {
		Country c = countryList.get(i);
		System.out.println(c.name);

	}
	}
	public static void menu() {
		System.out.println("1.Warmer Countries");
		System.out.println("2.Cooler Countries");
		System.out.println("3.Search for recommendation by activity");
		System.out.println("4.Quit");
		
	}

	
	


		
	}


