package C209_L01;


public class WorldCitiesArray {

	public static void main(String[] args) {
	
				String [] cityArr = new String[4];
				cityArr[0] = "Singapore";
				cityArr[1] = "Kuala lumpur";
				cityArr[2] = "Seoul";
				cityArr[3] = "Bandung";
				
				cityArr[2] = "taipei";
				cityArr[0] = null;
				int size = cityArr.length;
				
				for (int i = 0; i<size; i++) {
					System.out.println(cityArr[i]);
				}
				System.out.println("Number  of cities: " + size);



	
	}

}
