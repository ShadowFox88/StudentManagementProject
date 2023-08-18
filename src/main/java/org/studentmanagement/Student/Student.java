package org.studentmanagement.Student;

public class Student {
    String studentName;
    EmergencyContacts studentEmergencyContacts;
    SpecialAccommodations studentSpecialAccommodations;
    MedicalDetails studentMedicalDetails;

    public Student(String name, EmergencyContacts emergencyContacts, SpecialAccommodations specialAccommodations, MedicalDetails medicalDetails) {
        studentName = name;
        studentEmergencyContacts = emergencyContacts;
        studentSpecialAccommodations = specialAccommodations;
        studentMedicalDetails = medicalDetails;
    }

}