package baseline;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Solution46 {
    public static void main(String[] args) throws FileNotFoundException {
        // create an object of ReadFile
        ReadFile read = new ReadFile();
        read.readFile();

        // read the file
        // get the hashmap
        Map<String, Integer> words = read.getWords();

        // create an object of PrintFrequency
        PrintFrequency print = new PrintFrequency(words);

        // display the results
        print.display();
    }
}
