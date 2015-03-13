 
 public class CountryBSortByIdComparator implements Comparator<CountryB>{

    @Override
    public int compare(CountryB country1, CountryB country2) {

        return (country1.getCountryBId() < country2.getCountryBId() ) ? -1: (country1.getCountryBId() > country2.getCountryBId() ) ? 1:0 ;
    }

}