package org.studentmanagement.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class StudentTest {

    @Test
    public void BehaviourTest() {
        Behaviour JohnDoeBehaviour = new Behaviour();
        String praise_1_uuid = JohnDoeBehaviour.addPraise("Good boy");
        assertEquals(1, JohnDoeBehaviour.praises.size());
        assertEquals("Good boy", JohnDoeBehaviour.praises.get(praise_1_uuid));
        assertTrue(JohnDoeBehaviour.praises.containsKey(praise_1_uuid));
        JohnDoeBehaviour.removePraise(praise_1_uuid);
        assertEquals(0, JohnDoeBehaviour.praises.size());

        String behaviourPoint_1_uuid = JohnDoeBehaviour.addBehaviourPoint("Was caught downloading free RAM");
        assertEquals(1, JohnDoeBehaviour.behaviourPoints.size());
        assertEquals("Was caught downloading free RAM", JohnDoeBehaviour.behaviourPoints.get(behaviourPoint_1_uuid));
        assertTrue(JohnDoeBehaviour.behaviourPoints.containsKey(behaviourPoint_1_uuid));
        JohnDoeBehaviour.removeBehaviourPoint(behaviourPoint_1_uuid);
        assertEquals(0, JohnDoeBehaviour.behaviourPoints.size());
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
        Behaviour JohnDoeBehaviour = new Behaviour();
        String praise_1_uuid = JohnDoeBehaviour.addPraise("Good boy");
        String behaviourPoint_1_uuid = JohnDoeBehaviour.addBehaviourPoint("Was caught downloading free RAM");

        // name, emergency contacts, special accommodations, medical details, praises
        Student su = new Student("John Doe", JohnDoeEmergency, JohnDoeAccommodations, JohnDoeMedical, JohnDoeBehaviour);

        assertEquals("John Doe", su.studentName);
        assertEquals(JohnDoeEmergency, su.studentEmergencyContacts);
        assertEquals(JohnDoeAccommodations, su.studentSpecialAccommodations);
        assertEquals(JohnDoeMedical, su.studentMedicalDetails);
        assertEquals(JohnDoeBehaviour.praises, su.studentBehaviour.praises);
        assertEquals(JohnDoeBehaviour.behaviourPoints, su.studentBehaviour.behaviourPoints);
        assertTrue(su.studentBehaviour.praises.containsKey(praise_1_uuid));
        assertTrue(su.studentBehaviour.behaviourPoints.containsKey(behaviourPoint_1_uuid));
    }
}
