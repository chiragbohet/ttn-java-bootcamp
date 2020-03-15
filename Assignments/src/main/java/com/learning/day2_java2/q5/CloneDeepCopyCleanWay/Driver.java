package main.java.com.learning.day2_java2.q5.CloneDeepCopyCleanWay;

import java.util.Date;

/***
 * A class which demonstrates Deep Copy using clone() method, in a cleaner way.
 * Approach :
 *  The nested classes also have a clone() method which is used to create new objects
 *  of these nested classes and returns references to these newly created objects
 */

public class Driver {
    public static void main(String[] args) throws  Exception{
        DrivingLicense chiragLicense = new DrivingLicense("DL1234", null, null);
        Person chiragObject = new Person("Chirag", 24, chiragLicense);


        //In Deep Copy, an actual copy of primitive and mutable fields is made.
        //Hence manipulating these fields of one object will have no effect on another
        Person ajayObject = (Person) chiragObject.clone();
        ajayObject.setName("Ajay");
        System.out.println("Chirag's name : " + chiragObject.getName());
        System.out.println("Ajay's name : " + ajayObject.getName());

        // In Deep Copy, nested objects are independently copied
        // i.e. Now both the original, and the object made after cloning the original object refer to different nested Objects
        // and hence both can manipulate their nested objects separately without affecting one another
        ajayObject.getDrivingLicense().setLicenseNumber("RJ1234");
        ajayObject.getDrivingLicense().setValidFrom(new Date());
        ajayObject.getDrivingLicense().setValidTill(new Date());
        System.out.println("Chirag's License details : " + chiragObject.getDrivingLicense().toString()); // this DOES NOT change
        System.out.println("Ajays's License details : " + ajayObject.getDrivingLicense().toString());
    }
}
class Person implements Cloneable{

    private String name;
    private int age;
    DrivingLicense drivingLicense;

    // Creating a deep copy in a cleaner way using clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonedObject = (Person)super.clone();
        clonedObject.setDrivingLicense((DrivingLicense) clonedObject.getDrivingLicense().clone());
        return clonedObject;
    }

    public Person(String name, int age, DrivingLicense drivingLicense) {
        this.name = name;
        this.age = age;
        this.drivingLicense = drivingLicense;
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

    public DrivingLicense getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(DrivingLicense drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}

class DrivingLicense implements Cloneable {
    String licenseNumber;
    Date validFrom;
    Date validTill;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

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