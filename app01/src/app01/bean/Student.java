package app01.bean;

public class Student {
    private String name;
    private Address address;
    
    public Student() {
    }
    
    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " + "\n" + address;
    }

}
