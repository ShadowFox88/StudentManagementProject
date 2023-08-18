package org.studentmanagement;

import java.util.HashMap;
import org.studentmanagement.Student.Student;

public class Register {
    static HashMap<Student, Integer> RegisterList = new HashMap<Student, Integer>();
    public Register(HashMap<Student, Integer> RegisterInput) {
        RegisterList = RegisterInput;
    }

    public static boolean addStudent(Student student) {
        if (!RegisterList.containsKey(student)) {
            RegisterList.put(student, 0);
            return true;
        } else {
            return false;
        }

    }

    public static boolean removeStudent(Student student) {
        if (RegisterList.containsKey(student)) {
            RegisterList.remove(student);
            return true;
        } else {
            return false;
        }
    }

    public static boolean SignInStudent(Student student) {
        if (RegisterList.containsKey(student) && RegisterList.get(student) == 0) {
            RegisterList.put(student, 1);
            return true;
        } else {
            return false;
        }
    }

    public static HashMap getRegister() {
        return RegisterList;
    }
}
