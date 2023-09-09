package org.studentmanagement;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;


public class FileHandling {

    public static boolean CreateFile(String name) {
        try {
            File file = new File(name);
            return file.createNewFile();
        } catch (IOException ignored) {
            return false;
        }

    }

    public static boolean DeleteFile(String name) {
        File file = new File(name);
        return file.delete();

    }

    public static boolean WriteToFile(String name, String data) {
        try {
            FileWriter write = new FileWriter(name);
            write.write(data);
            write.close();
            return true;
        } catch (IOException ignored) {
            return false;
        }
    }

    public static ArrayList<String> ReadFile(String name) {
        ArrayList<String> return_value = new ArrayList<>();
        try {
            File file = new File(name);
            Scanner file_reader = new Scanner(file);
            while (file_reader.hasNextLine()) {
                String data = file_reader.nextLine();
                return_value.add(data);
            }
            file_reader.close();
            return return_value;
        } catch (FileNotFoundException ignored) {
            return_value.add("File Not Found");
            return return_value;
        }
    }
}