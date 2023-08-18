package org.studentmanagement.Student;

public class Student {
    String studentName;
    EmergencyContacts studentEmergencyContacts;
    SpecialAccommodations studentSpecialAccommodations;
    MedicalDetails studentMedicalDetails;
    Praises studentPraises;

    public Student(String name, EmergencyContacts emergencyContacts, SpecialAccommodations specialAccommodations, MedicalDetails medicalDetails, Praises praises) {
        studentName = name;
        studentEmergencyContacts = emergencyContacts;
        studentSpecialAccommodations = specialAccommodations;
        studentMedicalDetails = medicalDetails;
        studentPraises = praises;
    }

}