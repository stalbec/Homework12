public class Country {
    private String nameOfCountry;
    private double populationOfCountry;
    private double sizeOfCountry;

 /*   Country[] country;
    City[] city;
    Address[] address;
    Person[] person;*/


    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public double getPopulationOfCountry() {
        return populationOfCountry;
    }

    public double getSizeOfCountry() {
        return sizeOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public void setPopulationOfCountry(double populationOfCountry) {
        this.populationOfCountry = populationOfCountry;
    }

    public void setSizeOfCountry(double sizeOfCountry) {
        this.sizeOfCountry = sizeOfCountry;
    }
}
