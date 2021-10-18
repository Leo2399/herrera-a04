package baseline;

import com.google.gson.stream.JsonReader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

class ReadJSONFileTest {

    @Test
    void readJson() throws FileNotFoundException {

        ReadJSONFile test = new ReadJSONFile("data/exercise44_input.json");
        File expected = new File("data/exercise44_input.json");

        assertEquals(expected,test.readJson());


    }

}