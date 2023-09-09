package org.studentmanagement;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FileHandlingTest {

    @Test
    public void CreateDeleteFileTest() {
        FileHandling.CreateFile("test.txt");
        File f = new File("test.txt");

        assertTrue(f.isFile());
        try {
            FileHandling.DeleteFile("test.txt");
            assertFalse(f.isFile());
        } catch (SecurityException ignored) {
            fail();
        }

    }

    @Test
    public void WriteReadTest() {
        FileHandling.CreateFile("test.txt");
        FileHandling.WriteToFile("test.txt", "Hello\nTest");
        ArrayList<String> Message = new ArrayList<>();
        Message.add("Hello");
        Message.add("Test");
        assertEquals(FileHandling.ReadFile("test.txt"), Message);
        assertNotEquals(FileHandling.ReadFile("test.txt").get(0), "File Not Found");
        FileHandling.DeleteFile("test.txt");
    }
}
