package org.studentmanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.studentmanagement.Student.EmergencyContacts;
import org.studentmanagement.Student.MedicalDetails;
import org.studentmanagement.Student.SpecialAccommodations;
import org.studentmanagement.Student.Student;
import org.studentmanagement.Register;

import java.util.ArrayList;
import java.util.HashMap;

public class RegisterTest {

    public Student GenerateRandomStudent(String name) {
        // name, number, relationship, address
        EmergencyContacts StudentEmergency = new EmergencyContacts(name + " Sr", "07866723098", "Father", "1, The Street, The Town, The City, The County, The Country, The Postcode");

        ArrayList StudentAccommodationsList = new ArrayList<>();
        StudentAccommodationsList.add("Extra time");
        // list of accommodations
        SpecialAccommodations StudentAccommodations = new SpecialAccommodations(StudentAccommodationsList);

        // list of medical details
        ArrayList StudentMedicalList = new ArrayList<>();
        StudentMedicalList.add("Nut Allergy");
        StudentMedicalList.add("About to die");
        MedicalDetails JohnDoeMedical = new MedicalDetails(StudentMedicalList);

        // name, emergency contacts, special accommodations, medical details
        Student su = new Student(name, StudentEmergency, StudentAccommodations, JohnDoeMedical);

        return su;
    }

    /*

    @Test
    public void RegisterGetterSetterTest() {
        HashMap<Student, Integer> Register = new HashMap<Student, Integer>();
        Student su1 = GenerateRandomStudent("John Doe");
        Student su2 = GenerateRandomStudent("Jane Doe");
        Register.put(su1, 1);
        Register.put(su2, 0);
        assertEquals(1, Register.get(su1));
        assertEquals(0, Register.get(su2));
        Register.put(su1, 0);
        Register.put(su2, 1);
        assertEquals(0, Register.get(su1));
        assertEquals(1, Register.get(su2));
        assertEquals(2, Register.size());
    }

    */

    @Test
    public void RegisterAddTest() {
        Register register = new Register(new HashMap<Student, Integer>());
        Student john = GenerateRandomStudent("John Doe");
        register.addStudent(john);
        assertEquals(1, register.getRegister().size());
        assertEquals(0, register.getRegister().get(john));
        assertEquals(john, register.getRegister().keySet().toArray()[0]);
    }

    @Test
    public void RegisterRemoveTest() {
        Register register = new Register(new HashMap<Student, Integer>());
        Student john = GenerateRandomStudent("John Doe");
        register.removeStudent(john);
        assertEquals(0, register.getRegister().size());
    }

    @Test
    public void RegisterGetTest() {
        Register register = new Register(new HashMap<Student, Integer>());
        Student john = GenerateRandomStudent("John Doe");
        register.addStudent(john);
        HashMap<Student, Integer> test = new HashMap<Student, Integer>();
        test.put(john, 0);
        assertEquals(test, register.getRegister());
    }

    @Test
    public void RegisterSignInTest() {
        Register register = new Register(new HashMap<Student, Integer>());
        Student john = GenerateRandomStudent("John Doe");
        register.addStudent(john);
        assertEquals(0, register.getRegister().get(john));
        register.SignInStudent(john);
        assertEquals(1, register.getRegister().get(john));

    }
}
