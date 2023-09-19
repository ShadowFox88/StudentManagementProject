package org.studentmanagement.Student;

public class EmergencyContacts {
    public String EmergencyContactName;
    public String EmergencyContactNumber;
    public String EmergencyContactRelationship;
    public String EmergencyContactAddress;
    public EmergencyContacts(String name, String number, String relationship, String address) {
        EmergencyContactName = name;
        EmergencyContactNumber = number;
        EmergencyContactRelationship = relationship;
        EmergencyContactAddress = address;
    }

}
