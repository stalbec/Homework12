import java.time.LocalDate;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Country country = new Country();
        country.setNameOfCountry("Kyrgystan");
        country.setPopulationOfCountry(7000000);
        country.setSizeOfCountry(199990);


        City city = new City();
        city.setNameOfCity("Bishkek");
        city.setPopulationOfCity(1200000);

        Address address = new Address();
        address.setAddress("Kainazarova 22");
        address.setPostCode(2376556);

        Person person = new Person();
        person.setFirstName("Nurlan");
        person.setLastName("Malikov");
        person.setAge(35);
        person.setDateOfBirth(LocalDate.of(1987,10,15));

        Country[] countries = {country};
        City[] cities = {city};
        Address[] addresses = {address};
        Person[] people = {person};

        System.out.println("Person's name:  " + person.getFirstName() + "\nPerson's last name:  " + person.getLastName() +
                "\nPerson's age:  " + person.getAge() + "\nPerson's date of birth:  " + person.getDateOfBirth());
        System.out.println("*************************************************************");

        System.out.println("Person's address:  "+ address.getAddress()+ "\nPerson's post code:  "+ address.getPostCode());
        System.out.println("*************************************************************");

        System.out.println("Person's hometown: "+ city.getNameOfCity()+ "\nPopulation of this city:  "+ city.getPopulationOfCity());
        System.out.println("*************************************************************");

        System.out.println("Country of Residence:  "+country.getNameOfCountry()+ "\nPopulation of country: "+ country.getPopulationOfCountry()+
                "Country area:  "+country.getSizeOfCountry());
    }
}

