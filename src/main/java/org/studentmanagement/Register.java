package org.studentmanagement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import org.studentmanagement.Student.Student;
import java.io.*;

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

    public void saveHashToFile(HashMap<String, Object> hash) throws IOException {
        String filePath = "register.txt";
        File file = new File(filePath);
        FileOutputStream f = new FileOutputStream(file);
        ObjectOutputStream s = new ObjectOutputStream(f);
        s.writeObject(hash);
        s.close();
    }

}
