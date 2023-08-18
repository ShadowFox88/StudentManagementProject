package org.studentmanagement.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class StudentTest {

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
        ArrayList JohnDoeMedicalList = new ArrayList<>();
        JohnDoeMedicalList.add("Nut Allergy");
        JohnDoeMedicalList.add("About to die");
        MedicalDetails JohnDoeMedical = new MedicalDetails(JohnDoeMedicalList);
        assertEquals(JohnDoeMedicalList, JohnDoeMedical.StudentMedicalConditions);
        assertEquals("Nut Allergy", JohnDoeMedical.StudentMedicalConditions.get(0));
        assertEquals("About to die", JohnDoeMedical.StudentMedicalConditions.get(1));
    }

    @Test
    public void SpecialAccommodationsSetterGetterTest() {
        ArrayList JohnDoeAccommodationsList = new ArrayList<>();
        JohnDoeAccommodationsList.add("Extra time");
        // list of accommodations
        SpecialAccommodations JohnDoeAccommodations = new SpecialAccommodations(JohnDoeAccommodationsList);
        assertEquals(JohnDoeAccommodationsList, JohnDoeAccommodations.AccommodationsList);
        assertEquals("Extra time", JohnDoeAccommodations.AccommodationsList.get(0));

    }

    @Test
    public void StudentTest() {
        // name, number, relationship, address
        EmergencyContacts JohnDoeEmergency = new EmergencyContacts("John Doe Sr", "07866723098", "Father", "1, The Street, The Town, The City, The County, The Country, The Postcode");

        ArrayList JohnDoeAccommodationsList = new ArrayList<>();
        JohnDoeAccommodationsList.add("Extra time");
        // list of accommodations
        SpecialAccommodations JohnDoeAccommodations = new SpecialAccommodations(JohnDoeAccommodationsList);

        // list of medical details
        ArrayList JohnDoeMedicalList = new ArrayList<>();
        JohnDoeMedicalList.add("Nut Allergy");
        JohnDoeMedicalList.add("About to die");
        MedicalDetails JohnDoeMedical = new MedicalDetails(JohnDoeMedicalList);

        // name, emergency contacts, special accommodations, medical details
        Student su = new Student("John Doe", JohnDoeEmergency, JohnDoeAccommodations, JohnDoeMedical);

        assertEquals("John Doe", su.studentName);
        assertEquals(JohnDoeEmergency, su.studentEmergencyContacts);
        assertEquals(JohnDoeAccommodations, su.studentSpecialAccommodations);
        assertEquals(JohnDoeMedical, su.studentMedicalDetails);
    }
}
