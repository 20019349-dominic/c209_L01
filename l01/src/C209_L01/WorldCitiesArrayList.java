package C209_L01;


public class WorldCitiesArrayList {

	public static void main(String[] args) {
				
				cityList.add("Singapore");
				cityList.add("Kuala lumpur");
				cityList.add("Seoul");
				cityList.add("Bandung");
				
				int size = cityList.size();
				
				cityList.set(2, "Taipei");
				cityList.set(0, null);
				
				for (int i = 0; i <cityList.size(); i++);{
					System.out.print(cityList.get(i));
					size = cityList.size();
					
					System.out.println("Number of cities : " + size);
				}




	
	}
	}
}



