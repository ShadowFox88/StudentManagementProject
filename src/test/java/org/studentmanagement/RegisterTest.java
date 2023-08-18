package org.studentmanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.studentmanagement.Student.EmergencyContacts;
import org.studentmanagement.Student.MedicalDetails;
import org.studentmanagement.Student.SpecialAccommodations;
import org.studentmanagement.Student.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class RegisterTest {

    public Student GenerateRandomStudent(String name) {
        // name, number, relationship, address
        EmergencyContacts StudentEmergency = new EmergencyContacts(name + " Sr", "07866723098", "Father", "1, The Street, The Town, The City, The County, The Country, The Postcode");

        ArrayList<String> StudentAccommodationsList = new ArrayList<>();
        StudentAccommodationsList.add("Extra time");
        // list of accommodations
        SpecialAccommodations StudentAccommodations = new SpecialAccommodations(StudentAccommodationsList);

        // list of medical details
        ArrayList<String> StudentMedicalList = new ArrayList<>();
        StudentMedicalList.add("Nut Allergy");
        StudentMedicalList.add("About to die");
        MedicalDetails JohnDoeMedical = new MedicalDetails(StudentMedicalList);

        // name, emergency contacts, special accommodations, medical details

        return new Student(name, StudentEmergency, StudentAccommodations, JohnDoeMedical);
    }

    @Test
    public void RegisterAddTest() {
        Register register = new Register(new HashMap<>());
        Student john = GenerateRandomStudent("John Doe");
        register.addStudent(john);
        assertEquals(1, register.getRegister().size());
        assertEquals(0, register.getRegister().get(john));
        assertEquals(john, register.getRegister().keySet().toArray()[0]);
    }

    @Test
    public void RegisterRemoveTest() {
        Register register = new Register(new HashMap<>());
        Student john = GenerateRandomStudent("John Doe");
        register.addStudent(john);
        assertEquals(1, register.getRegister().size());
        register.removeStudent(john);
        assertEquals(0, register.getRegister().size());
    }

    @Test
    public void RegisterGetTest() {
        Register register = new Register(new HashMap<>());
        Student john = GenerateRandomStudent("John Doe");
        register.addStudent(john);
        HashMap<Student, Integer> test = new HashMap<>();
        test.put(john, 0);
        assertEquals(test, register.getRegister());
    }

    @Test
    public void RegisterSignInTest() {
        Register register = new Register(new HashMap<>());
        Student john = GenerateRandomStudent("John Doe");
        register.addStudent(john);
        assertEquals(0, register.getRegister().get(john));
        register.SignInStudent(john);
        assertEquals(1, register.getRegister().get(john));

    }

    @Test
    public void RegisterSignOutTest() {
        Register register = new Register(new HashMap<>());
        Student john = GenerateRandomStudent("John Doe");
        register.addStudent(john);
        assertEquals(0, register.getRegister().get(john));
        register.SignInStudent(john);
        assertEquals(1, register.getRegister().get(john));
        register.SignOutStudent(john);
        assertEquals(0, register.getRegister().get(john));

    }
}
