import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorBMain {

	/**
	 * @author Arpit Mandliya
	 */
	public static void main(String[] args) {
		 CountryB indiaCountry=new CountryB(1, 'India');
		 CountryB chinaCountry=new CountryB(4, 'China');
		 CountryB nepalCountry=new CountryB(3, 'Nepal');
		 CountryB bhutanCountry=new CountryB(2, 'Bhutan');

	        List<CountryB> listOfCountries = new ArrayList<CountryB>();
	        listOfCountries.add(indiaCountry);
	        listOfCountries.add(chinaCountry);
	        listOfCountries.add(nepalCountry);
	        listOfCountries.add(bhutanCountry);

	        System.out.println('Before Sort by id : ');
	        for (int i = 0; i < listOfCountries.size(); i++) {
				CountryB country=(CountryB) listOfCountries.get(i);
				System.out.println('Country Id: '+countryB.getCountryId()+'||'+'Country name: '+countryB.getCountryName());
			}
	        Collections.sort(listOfCountries,new CountrySortByIdComparator());

	        System.out.println('After Sort by id: ');
	        for (int i = 0; i < listOfCountries.size(); i++) {
				CountryB country=(CountryB) listOfCountries.get(i);
				System.out.println('Country Id: '+countryB.getCountryId()+'|| '+'Country name: '+countryB.getCountryName());
			}

	        //Sort by countryName
	        Collections.sort(listOfCountries,new Comparator<CountryB>() {

				@Override
				public int compare(CountryB o1, CountryB o2) {
					return o1.getCountryName().compareTo(o2.getCountryName());
				}
			});

			System.out.println('After Sort by name: ');
	        for (int i = 0; i < listOfCountries.size(); i++) {
				CountryB country=(CountryB) listOfCountries.get(i);
				System.out.println('Country Id: '+countryB.getCountryId()+'|| '+'Country name: '+countryB.getCountryName());
			}
	}

}
