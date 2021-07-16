package C209_L01;
import java.util.ArrayList;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * bobo_chan, 6 Apr 2017 9:26:54 pm
 */

public class WhereToGo {
	public static void main(String[] args) {
		
		ArrayList<Country> countryList = new ArrayList<Country>();
		countryList.add(new Country("Thailand", 26.30, "Food, Massage, Shopping "));
		countryList.add(new Country("Singapore", 26.45, "Food, Shopping"));
		countryList.add(new Country("France", 10.70, "Skiing, Sight Seeing"));
		countryList.add(new Country("Iceland", 1.75, "Hot Spring, Aurora"));
		countryList.add(new Country("Japan", 11.15, "Food, Mount Fuji"));

		//Refer to the sample flow and write code to match the requirements.
		//Hint: Refer to section F of your worksheet.
		


		
		
	}

	public static void menu() {
		//Write code to display current date and menu here
	}

	public static void countriesByTemp(ArrayList<Country> countryList, int choice) {
		//Write code here to display warm or cold countries depending on the choice by the user.
	}

	public static void searchString(ArrayList<Country> countryList) {
		//Write code here to prompt user to enter an activity
		//and display countries that have that activity.
		
	}
}
