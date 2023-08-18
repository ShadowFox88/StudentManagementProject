package org.studentmanagement.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class StudentTest {

    @Test
    public void PraisesTest() {
        Praises JohnDoePraises = new Praises();
        String praise_1_uuid = JohnDoePraises.addPraise("Good boy");
        assertEquals(1, JohnDoePraises.praises.size());
        assertEquals("Good boy", JohnDoePraises.praises.get(praise_1_uuid));
        assertTrue(JohnDoePraises.praises.containsKey(praise_1_uuid));
        JohnDoePraises.removePraise(praise_1_uuid);
        assertEquals(0, JohnDoePraises.praises.size());
    }

    @Test
    public void EmergencyContactsSetterGetterTest() {
        EmergencyContacts JohnDoeEmergency = new EmergencyContacts("John Doe Sr", "07866723098", "Father", "1, The Street, The Town, The City, The County, The Country, The Postcode");
        assertEquals("John Doe Sr", JohnDoeEmergency.EmergencyContactName);
        assertEquals("07866723098", JohnDoeEmergency.EmergencyContactNumber);
        assertEquals("Father", JohnDoeEmergency.EmergencyContactRelationship);
        assertEquals("1, The Street, The Town, The City, The County, The Country, The Postcode", JohnDoeEmergency.EmergencyContactAddress);
    }

    @Test
    public void MedicalDetailsSetterGetterTest() {
        ArrayList<String> JohnDoeMedicalList = new ArrayList<>();
        JohnDoeMedicalList.add("Nut Allergy");
        JohnDoeMedicalList.add("About to die");
        MedicalDetails JohnDoeMedical = new MedicalDetails(JohnDoeMedicalList);
        assertEquals(JohnDoeMedicalList, JohnDoeMedical.StudentMedicalConditions);
        assertEquals("Nut Allergy", JohnDoeMedical.StudentMedicalConditions.get(0));
        assertEquals("About to die", JohnDoeMedical.StudentMedicalConditions.get(1));
    }

    @Test
    public void SpecialAccommodationsSetterGetterTest() {
        ArrayList<String> JohnDoeAccommodationsList = new ArrayList<>();
        JohnDoeAccommodationsList.add("Extra time");
        // list of accommodations
        SpecialAccommodations JohnDoeAccommodations = new SpecialAccommodations(JohnDoeAccommodationsList);
        assertEquals(JohnDoeAccommodationsList, JohnDoeAccommodations.AccommodationsList);
        assertEquals("Extra time", JohnDoeAccommodations.AccommodationsList.get(0));

    }

    @Test
    public void CompleteStudentTest() {
        // name, number, relationship, address
        EmergencyContacts JohnDoeEmergency = new EmergencyContacts("John Doe Sr", "07866723098", "Father", "1, The Street, The Town, The City, The County, The Country, The Postcode");

        ArrayList<String> JohnDoeAccommodationsList = new ArrayList<>();
        JohnDoeAccommodationsList.add("Extra time");
        // list of accommodations
        SpecialAccommodations JohnDoeAccommodations = new SpecialAccommodations(JohnDoeAccommodationsList);

        // list of medical details
        ArrayList<String> JohnDoeMedicalList = new ArrayList<>();
        JohnDoeMedicalList.add("Nut Allergy");
        JohnDoeMedicalList.add("About to die");
        MedicalDetails JohnDoeMedical = new MedicalDetails(JohnDoeMedicalList);

        // list of praises
        Praises JohnDoePraises = new Praises();
        String praise_1_uuid = JohnDoePraises.addPraise("Good boy");

        // name, emergency contacts, special accommodations, medical details, praises
        Student su = new Student("John Doe", JohnDoeEmergency, JohnDoeAccommodations, JohnDoeMedical, JohnDoePraises);

        assertEquals("John Doe", su.studentName);
        assertEquals(JohnDoeEmergency, su.studentEmergencyContacts);
        assertEquals(JohnDoeAccommodations, su.studentSpecialAccommodations);
        assertEquals(JohnDoeMedical, su.studentMedicalDetails);
        assertEquals(JohnDoePraises, su.studentPraises);
        assertTrue(su.studentPraises.praises.containsKey(praise_1_uuid));
    }
}
