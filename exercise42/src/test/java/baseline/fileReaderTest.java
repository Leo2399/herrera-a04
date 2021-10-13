package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class fileReaderTest {

    @Test
    void parseData(){
        File input = new File("data/exercise42_input.txt");
        Assertions.assertTrue(input.exists());
    }
}