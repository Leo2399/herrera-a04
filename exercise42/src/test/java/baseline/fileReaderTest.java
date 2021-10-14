package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class fileReaderTest {

    @Test
    void parseData() throws FileNotFoundException {
        fileReader test = new fileReader();
        File input = new File("data/exercise42_input.txt");
        File actual = test.parseData();

        assertEquals(input, actual);
    }
}