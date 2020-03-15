package main.java.com.learning.day2_java2.q5.CloneShallowCopy;

import java.util.Date;

/***
 * A class demonstrating default behavior of the clone method
 * It creates a shallow copy of the Object and returns it.
 */
public class Driver {
    public static void main(String[] args) throws  Exception{
        DrivingLicense chiragLicense = new DrivingLicense("DL1234", null, null);
        Person chiragObject = new Person("Chirag", 24, chiragLicense);


        //In shallow copy, an actual copy of primitive and mutable fields is made.
        //Hence manipulating these fields of one object will have no effect on another
        Person ajayObject = (Person) chiragObject.clone();
        ajayObject.setName("Ajay");
        System.out.println("Chirag's name : " + chiragObject.getName());
        System.out.println("Ajay's name : " + ajayObject.getName());

        // In shallow copy, nested objects are not independently copied and only a copy of their reference is made
        // i.e. Now both the original, and the object made after cloning the original object refer to the same nested Objects
        // and hence if one any change is made in this nested object it is visible in both.
        ajayObject.getLicense().setLicenseNumber("RJ1234");
        ajayObject.getLicense().setValidFrom(new Date());
        ajayObject.getLicense().setValidTill(new Date());
        System.out.println("Chirag's License details : " + chiragObject.getLicense().toString()); // this is changed too
        System.out.println("Ajays's License details : " + ajayObject.getLicense().toString());
    }
}
class Person implements Cloneable{

    private String name;
    private int age;
    DrivingLicense license;

    public Person(String name, int age, DrivingLicense license) {
        this.name = name;
        this.age = age;
        this.license = license;
    }

    // by default clone() method performs a shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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