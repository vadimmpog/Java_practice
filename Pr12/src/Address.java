import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String housing;
    private String apartment;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public void setAddress1(String s){
        String[] ad = s.split(",");
        country = ad[0];
        region = ad[1];
        city = ad[2];
        street = ad[3];
        house = ad[4];
        housing = ad[5];
        apartment = ad[6];
    }

    public void setAddress2(String s){
        StringTokenizer stringTokenizer = new StringTokenizer(s,",.;-");
        country = stringTokenizer.nextToken();
        region = stringTokenizer.nextToken();
        city = stringTokenizer.nextToken();
        street = stringTokenizer.nextToken();
        house = stringTokenizer.nextToken();
        housing = stringTokenizer.nextToken();
        apartment = stringTokenizer.nextToken();
    }

    public static void main(String[] args) {
        Address address = new Address();
        address.setAddress1("1,2,3,4,5,6,7");
        System.out.println(address);
        address.setAddress2("1.2.3.4.5.6.7");
        System.out.println(address);
    }
}
