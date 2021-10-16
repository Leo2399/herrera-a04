package baseline;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {
    NameSorter test = new NameSorter();
    static ArrayList<String> names = new ArrayList<>();
    static File expected = new File("data/exercise41_input.txt");

    @BeforeAll
     static void init(){
        names.add("Ling, Mai\n" +
                "Johnson, Jim\n" +
                "Zarnecki, Sabrina\n" +
                "Jones, Chris\n" +
                "Jones, Aaron\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong");

    }

    @Test
    void readNames() throws FileNotFoundException {

       assertEquals(expected, test.readNames());
    }

    @Test
    void getNames() throws FileNotFoundException {
        test.readNames();
        assertEquals(7, test.getNames().size());

    }
}