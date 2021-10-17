package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadFile {
    // read file and store the words in the file in a hashmap
    // set instance variables
    private Scanner in;
    private File inputFile;
    private Map<String,Integer> words = new HashMap<>();

    public File readFile() throws FileNotFoundException {
        // open the file and use the scanner to read through it
        inputFile = new File("data/exercise46_input.txt");
        in = new Scanner(inputFile);

        // store the words in the file into the hashmap
        while(in.hasNext()){
            String input = in.nextLine();
            String[] arr = input.split(" ");

            for (String key : arr) {
                if (words.containsKey(key)) {
                    int value = words.get(key);
                    value++;
                    words.put(key, value);
                } else {
                    words.put(key, 1);
                }
            }
        }
        return inputFile;
        // use an array to store the names
        // count the repeated words and add its value to the hashmap
        // close the file
    }

    public Map<String,Integer> getWords(){
        // return the hashmap
        return words;
    }
}
