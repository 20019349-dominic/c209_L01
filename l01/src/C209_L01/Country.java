/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * dominic, 21/4/2021 1106
 */

package C209_L01;

/**
 * @author 20019349
 *
 */
public class Country {
	
	public String name;
	public double averageYearlyTempC;
	public String thingsToDo;
	
	public Country(String name, double averageYearlyTempC, String thingsToDo) {
		this.name = name;
		this.averageYearlyTempC = averageYearlyTempC;
		this.thingsToDo = thingsToDo;
	
		
	}
	public void display() {
		System.out.print("Country Name -" + name);
		System.out.print("Average Yearly temperature" + averageYearlyTempC);
		System.out.print("Things to do -" + thingsToDo);

}
}