package baseline;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {


    static ArrayList<String> testArr = new ArrayList<>();
    File expected = new File("data/exercise45_input.txt");

    ReadFile test = new ReadFile();


    @BeforeAll
    public static void init(){
       testArr.add("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");
       testArr.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
       testArr.add("utilizes an IDE to write her Java programs\".");
    }

    @Test
    void read() throws IOException {

        assertEquals(expected, test.read());
    }

    @Test
    void content() throws IOException {
        test.read();
        assertEquals(testArr, test.content());
    }
}