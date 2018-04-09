package pe.com.dl;

import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private Vehicle vehicle;
    private Date createdDate = new Date();
    private Date updatedDate;

    public Person(String firstName, String lastName, Vehicle vehicle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.vehicle = vehicle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "createdDate='" + createdDate + '\'' +
                ", updatedDate='" + updatedDate + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", vehicle='" + vehicle + '\'' +
                '}';
    }
}
