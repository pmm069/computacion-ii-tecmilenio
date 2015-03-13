
//If country1.getCountryId()<country2.getCountryId():then compare method will return -1
//If country1.getCountryId()>country2.getCountryId():then compare method will return 1
//If country1.getCountryId()==country2.getCountryId():then compare method will return 0
 
 public class CountryBSortByIdComparator implements Comparator<CountryB>{

    @Override
    public int compare(CountryB country1, CountryB country2) {

        return (country1.getCountryId() < country2.getCountryId() ) ? -1: (country1.getCountryId() > country2.getCountryId() ) ? 1:0 ;
    }

}