package main.java.com.learning.day2_java2.q5.CopyConstructorDeepCopy;


import java.util.Date;

/***
 * A class demonstrating use of copy constructors to create a Object from another.
 * In this illustration I have manually made a independent copy of nested objects in the copy constructor
 */
public class Driver {
    public static void main(String[] args) throws  Exception{

        DrivingLicense chiragLicense = new DrivingLicense("DL1234", null, null);
        Person chiragObject = new Person("Chirag", 24, chiragLicense);

        //Creating a new Object using copy constructor of an existing Object
        Person ajayObject = new Person(chiragObject);

        // Mutables and primitives are copied independently hence no affect on one another
        ajayObject.setName("Ajay");
        System.out.println("Chirag's name : " + chiragObject.getName());
        System.out.println("Ajay's name : " + ajayObject.getName());

        // Since nested objects are copied independently
        // Now both the original, and the object made using the copy constructor of the original object refer to the different nested Objects
        // and hence both can manipulate their nested objects separately without affecting one another
        ajayObject.getLicense().setLicenseNumber("RJ1234");
        ajayObject.getLicense().setValidFrom(new Date());
        ajayObject.getLicense().setValidTill(new Date());
        System.out.println("Chirag's License details : " + chiragObject.getLicense().toString()); // this is changed too
        System.out.println("Ajays's License details : " + ajayObject.getLicense().toString());
    }
}
class Person {

    private String name;
    private int age;
    DrivingLicense license;

    // Copy constructor which creates a deep copy of nested object (Manually)
    public Person(Person person)
    {
        this.name = person.getName();
        this.age = person.getAge();
        this.license = new DrivingLicense(person.getLicense().getLicenseNumber(),
                person.getLicense().getValidFrom(),
                person.getLicense().getValidTill());

    }

    public Person(String name, int age, DrivingLicense license) {
        this.name = name;
        this.age = age;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DrivingLicense getLicense() {
        return license;
    }

    public void setLicense(DrivingLicense license) {
        this.license = license;
    }
}

class DrivingLicense {
    String licenseNumber;
    Date validFrom;
    Date validTill;

    public DrivingLicense(String licenseNumber, Date validFrom, Date validTill) {
        this.licenseNumber = licenseNumber;
        this.validFrom = validFrom;
        this.validTill = validTill;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }

    @Override
    public String toString() {
        return "DrivingLicense{" +
                "licenseNumber=" + licenseNumber +
                ", validFrom=" + validFrom +
                ", validTill=" + validTill +
                '}';
    }
}

