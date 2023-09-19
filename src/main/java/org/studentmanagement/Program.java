package org.studentmanagement;

import org.studentmanagement.Student.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        boolean finished = false;
        final String gui;

        gui = """
                    '''''''''''''''''''''''
                    ' 1. Add Student      '
                    ' 2. Remove Student   '
                    ' 3. Sign In Student  '
                    ' 4. Sign Out Student '
                    ' 5. Praise Student   '
                    ' 6. Punish Student   '
                    ' 7. Exit             '
                    '''''''''''''''''''''''""";

        EmergencyContacts testEmergency = new EmergencyContacts("John Doe Sr", "07866723098", "Father", "1, The Street, The Town, The City, The County, The Country, The Postcode");
        ArrayList<String> testAccommodationsList = new ArrayList<>();
        testAccommodationsList.add("Extra time");
        SpecialAccommodations testAccommodations = new SpecialAccommodations(testAccommodationsList);
        ArrayList<String> testMedicalList = new ArrayList<>();
        testMedicalList.add("About to die");
        MedicalDetails testMedical = new MedicalDetails(testMedicalList);
        Behaviour testBehaviour = new Behaviour();
        testBehaviour.addPraise("Good boy");
        testBehaviour.addBehaviourPoint("Was caught downloading free RAM");
        Student testStudent = new Student("test", testEmergency, testAccommodations, testMedical, testBehaviour);

        HashMap<Student, Integer> test = new HashMap<>();

        test.put(testStudent, 0);

        Register register = new Register(test);

        while (!finished) {
            Scanner input = new Scanner(System.in);
            System.out.println(gui);

            String option = input.nextLine();

            if (Objects.equals(option, "1")) {
                SpecialAccommodations special_accommodations_object = null;
                MedicalDetails medical_details_object = null;
                EmergencyContacts emergency_contacts = null;
                String full_name = null;
                Behaviour behaviour = new Behaviour();
                boolean finished_add_student = false;

                String add_student_gui = """
                        '''''''''''''''''''''''''''''''
                        1. Add Full Name              '
                        2. Add Emergency Contacts     '
                        3. Add Special Accommodations '
                        4. Add Medical Details        '
                        5. Finish Creation            '
                        6. Exit                       '
                        '''''''''''''''''''''''''''''''""";

                while (!finished_add_student) {
                    System.out.println(add_student_gui);
                    String add_student_option = input.nextLine();
                    if (Objects.equals(add_student_option, "1")) {
                        System.out.println("Enter Full Name");
                        full_name = input.nextLine();

                    } else if (Objects.equals(add_student_option, "2")) {
                        String emergency_contact_name;
                        String emergency_contact_number;
                        String emergency_contact_relationship;
                        String emergency_contact_address;
                        System.out.println("Enter Emergency Contact Name");
                        emergency_contact_name = input.nextLine();
                        System.out.println("Enter Emergency Contact Number");
                        emergency_contact_number = input.nextLine();
                        System.out.println("Enter Emergency Contact Relationship");
                        emergency_contact_relationship = input.nextLine();
                        System.out.println("Enter Emergency Contact Address");
                        emergency_contact_address = input.nextLine();

                        emergency_contacts = new EmergencyContacts(emergency_contact_name, emergency_contact_number, emergency_contact_relationship, emergency_contact_address);

                    } else if (Objects.equals(add_student_option, "3")) {
                        String special_accommodations_input;
                        ArrayList<String> special_accommodations = new ArrayList<>();
                        System.out.println("Enter Special Accommodations - type exit to stop!");
                        special_accommodations_input = input.nextLine();
                        while (!Objects.equals(special_accommodations_input, "exit")) {
                            special_accommodations.add(special_accommodations_input);
                            System.out.println("Enter Special Accommodations - type exit to stop!");
                            special_accommodations_input = input.nextLine();
                        }

                        special_accommodations_object = new SpecialAccommodations(special_accommodations);

                    } else if (Objects.equals(add_student_option, "4")) {
                        String medical_details_input;
                        ArrayList<String> medical_details = new ArrayList<>();
                        System.out.println("Enter Medical Details - type exit to stop!");
                        medical_details_input = input.nextLine();
                        while (!Objects.equals(medical_details_input, "exit")) {
                            medical_details.add(medical_details_input);
                            System.out.println("Enter Medical Details - type exit to stop!");
                            medical_details_input = input.nextLine();
                        }

                        medical_details_object = new MedicalDetails(medical_details);

                    } else if (Objects.equals(add_student_option, "5")) {
                        if (Objects.nonNull(full_name) && Objects.nonNull(emergency_contacts) && Objects.nonNull(special_accommodations_object) && Objects.nonNull(medical_details_object)) {
                            Student student = new Student(full_name, emergency_contacts, special_accommodations_object, medical_details_object, behaviour);
                            register.addStudent(student);
                            finished_add_student = true;
                            System.out.println(student.studentName);
                            System.out.println(student.studentEmergencyContacts.EmergencyContactName);
                            System.out.println(student.studentEmergencyContacts.EmergencyContactNumber);
                            System.out.println(student.studentEmergencyContacts.EmergencyContactRelationship);
                            System.out.println(student.studentEmergencyContacts.EmergencyContactAddress);
                            System.out.println(student.studentSpecialAccommodations.AccommodationsList);
                            System.out.println(student.studentMedicalDetails.StudentMedicalConditions);
                            System.out.println(student.studentBehaviour.behaviourPoints);
                            System.out.println(student.studentBehaviour.praises);
                        } else {
                            System.out.println("Please enter all details");
                        }
                    } else if (Objects.equals(add_student_option, "6")) {
                        System.exit(0);

                    } else {
                        System.out.println("Invalid Option");
                    }
                }


            } else if (Objects.equals(option, "2")) {
                String remove_student_gui = """
                        test
                        """;

                ArrayList<Student> student_list = new ArrayList<>();

                for (Student key : register.getRegister().keySet()) {
                    student_list.add(key);
                    System.out.println(key.studentName);
                }

            } else if (Objects.equals(option, "3")) {
                String sign_in_student_gui = """
                        test
                        """;
            } else if (Objects.equals(option, "4")) {
                String sign_out_student_gui = """
                        test
                        """;
            } else if (Objects.equals(option, "5")) {
                String praise_student_gui = """
                        test
                        """;
            } else if (Objects.equals(option, "6")) {
                String punish_student_gui = """
                        test
                        """;
            } else if (Objects.equals(option, "7")) {
                finished = true;
            } else {
                System.out.println("Invalid Option");
            }
        }
    }
}
