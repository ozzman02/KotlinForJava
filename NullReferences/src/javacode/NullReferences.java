package javacode;

public class NullReferences {

    static class BankBranch {
        Address address;
        public Address getAddress() {
            return address;
        }
    }

    static class Address {
        Country country;
        public Country getCountry() {
            return country;
        }
    }

    static class Country {
        String countryCode;
        public String getCountryCode() {
            return countryCode;
        }
    }

    public static void main(String[] args) {
        BankBranch bankBranch = new BankBranch();

        if (bankBranch != null) {
            Address address = bankBranch.getAddress();
            if (address != null) {
                Country country = address.getCountry();
                if (country != null) {
                    String countryCode = country.getCountryCode();
                }
            }
        }
    }

}
