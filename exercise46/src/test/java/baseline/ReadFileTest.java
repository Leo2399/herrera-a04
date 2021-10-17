package baseline;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {
    ReadFile test = new ReadFile();
    static Map<String, Integer> testMap = new HashMap<>();
    @BeforeAll
    public static void init(){
        testMap.put("badger", 7);
        testMap.put("mushroom", 2);
        testMap.put("snake", 1);

    }

    @Test
    void readFile() throws FileNotFoundException {
       File testFile = new File("data/exercise46_input.txt");
       assertEquals(testFile, test.readFile());
    }

    @Test
    void getWords() throws FileNotFoundException {
        test.readFile();
        assertEquals(testMap, test.getWords());

    }
}