package coursescheduler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maste
 */
public class Instructor {
    private String firstName;
    private String lastName;
    private String officeBuilding;
    private int roomNumber;
    
    public Instructor() {
        firstName = "Albert";
        lastName ="Einstein";
        officeBuilding = "McNair";
        roomNumber = 420;
    }
    public Instructor(String firstName, String lastName, String officeBuilding, int roomNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeBuilding = officeBuilding;
        this.roomNumber = roomNumber;
    }
    public String toString() {
        String format;
        format = String.format("%s*%s*%s*%s",firstName,lastName,officeBuilding,roomNumber);
        return format;
    }
}
