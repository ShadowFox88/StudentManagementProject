package org.studentmanagement.Student;

import org.studentmanagement.Student.MedicalDetails;
import org.studentmanagement.Student.SpecialAccommodations;
import org.studentmanagement.Student.EmergencyContacts;

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