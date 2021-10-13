package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void TestReadNames() {
        Scanner in = new Scanner();
        ArrayList names = new ArrayList<String>("Ling, Mai\n" +
                "Johnson, Jim\n" +
                "Zarnecki, Sabrina\n" +
                "Jones, Chris\n" +
                "Jones, Aaron\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong");
        Assertions.assertEquals(7, Solution41.readNames(in,names));

        //Not sure how to test these methods will come back to these later
    }

    @Test
    void TestWriteOutput() {
    }
}