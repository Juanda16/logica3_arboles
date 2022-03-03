package models;

public class Contac implements Comparable<Contac> {

    private Long phoneNumber;
    private String name;

    public Contac(long phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public Contac() {
    }

    

    public Contac(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getUserId() {
        return phoneNumber;
    }

    public void setPhoneNumber(long userId) {
        this.phoneNumber = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contac [name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

    @Override
    public int compareTo(Contac o) {

        return this.phoneNumber.compareTo(o.phoneNumber);
    }

}
