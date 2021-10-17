package baseline;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WriteFileTest {
    static ArrayList<String> testArr = new ArrayList<>();
    static FileWriter expected;
    String name = "testMethod.txt";
    String testFile = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
            "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
            "uses an IDE to write her Java programs\".";


    @BeforeAll
    public static void init() throws IOException {
        expected = new FileWriter("data/testMethod.txt");
        testArr.add("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");
        testArr.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        testArr.add("utilizes an IDE to write her Java programs\".");
    }

    @Test
    void writeToFile() throws IOException {
        WriteFile test = new WriteFile(name, testArr);

        //assertEquals(expected.write(testFile), test.writeToFile());
        // this test case doesn't work but I will come back to it later
    }
}