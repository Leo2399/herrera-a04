package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WriteFileTest {
    public static ArrayList<String> names = new ArrayList<>();
    @BeforeAll
    public static void init(){
        names.add("Ling, Mai\n" +
                "Johnson, Jim\n" +
                "Zarnecki, Sabrina\n" +
                "Jones, Chris\n" +
                "Jones, Aaron\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong");
    }

    @Test
    void write() throws IOException {
        NameSorter read = new NameSorter();
        names = read.getNames();
        WriteFile test = new WriteFile(names);

        // Still working on this will come back to this later
    }
}