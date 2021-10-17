package baseline;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PrintFrequencyTest {

    static Map<String, Integer> testMap = new HashMap();
    @BeforeAll
    public static void init(){
        testMap.put("badger", 7);
        testMap.put("mushroom", 2);
        testMap.put("snake", 1);
    }

    @Test
    void display() {
        PrintFrequency test = new PrintFrequency(testMap);
        String expected = "badger:   *******\n" +
                "mushroom: **\n" +
                "snake:    *";
    }
}