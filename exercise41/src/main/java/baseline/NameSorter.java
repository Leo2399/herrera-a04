package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
This class will read and sort the names from the file
 */

public class NameSorter {
    private final ArrayList<String> names = new ArrayList<>();

    public File readNames() throws FileNotFoundException {

        //open the file and use a scanner to read through the file
        File inputFile = new File("data/exercise41_input.txt");
        Scanner in = new Scanner(inputFile);

        // use this function to read the names from the input file
        // go through the file and read each name
        while(in.hasNextLine()){
            names.add(in.nextLine());
        }

        // Sort the name in alphabetical order
        Collections.sort(names);

        return inputFile;

    }

    // return the names in an array list to use later on
    public ArrayList<String> getNames(){
        return names;
    }
}
