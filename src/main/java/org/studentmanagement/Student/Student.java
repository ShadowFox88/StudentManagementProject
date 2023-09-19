package org.studentmanagement.Student;

public class Student {
    public String studentName;
    public EmergencyContacts studentEmergencyContacts;
    public SpecialAccommodations studentSpecialAccommodations;
    public MedicalDetails studentMedicalDetails;
    public Behaviour studentBehaviour;

    public Student(String name, EmergencyContacts emergencyContacts, SpecialAccommodations specialAccommodations, MedicalDetails medicalDetails, Behaviour behaviour) {
        studentName = name;
        studentEmergencyContacts = emergencyContacts;
        studentSpecialAccommodations = specialAccommodations;
        studentMedicalDetails = medicalDetails;
        studentBehaviour = behaviour;
    }

}