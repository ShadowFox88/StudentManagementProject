package org.studentmanagement;

import java.util.HashMap;
import org.studentmanagement.Student.Student;

public class Register {
    HashMap<Student, Integer> RegisterList;
    public Register(HashMap<Student, Integer> RegisterInput) {
        RegisterList = RegisterInput;
    }

    public boolean addStudent(Student student) {
        if (!RegisterList.containsKey(student)) {
            RegisterList.put(student, 0);
            return true;
        } else {
            return false;
        }

    }

    public boolean removeStudent(Student student) {
        if (RegisterList.containsKey(student)) {
            RegisterList.remove(student);
            return true;
        } else {
            return false;
        }
    }

    public boolean SignInStudent(Student student) {
        if (RegisterList.containsKey(student) && RegisterList.get(student) == 0) {
            RegisterList.put(student, 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean SignOutStudent(Student student) {
        if (RegisterList.containsKey(student) && RegisterList.get(student) == 1) {
            RegisterList.put(student, 0);
            return true;
        } else {
            return false;
        }
    }

    public HashMap<Student, Integer> getRegister() {
        return RegisterList;
    }
}
