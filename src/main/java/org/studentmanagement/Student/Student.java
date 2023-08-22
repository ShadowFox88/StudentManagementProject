package org.studentmanagement.Student;

public class Student {
    String studentName;
    EmergencyContacts studentEmergencyContacts;
    SpecialAccommodations studentSpecialAccommodations;
    MedicalDetails studentMedicalDetails;
    Behaviour studentBehaviour;

    public Student(String name, EmergencyContacts emergencyContacts, SpecialAccommodations specialAccommodations, MedicalDetails medicalDetails, Behaviour behaviour) {
        studentName = name;
        studentEmergencyContacts = emergencyContacts;
        studentSpecialAccommodations = specialAccommodations;
        studentMedicalDetails = medicalDetails;
        studentBehaviour = behaviour;
    }

}