package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Use this class to read through the file
 */
public class ReadFile {
    ArrayList<String> data = new ArrayList<>();

    public File read() throws IOException {
        // open the file to read from
        // use scanner to read through the file
        File inputFile = new File("data/exercise45_input.txt");
        Scanner in = new Scanner(inputFile);

        // store the contents of the file in an array
        while (in.hasNextLine()){
            data.add(in.nextLine());
        }

        return inputFile;
    }

    public ArrayList<String> content(){
        // return file content
        return data;
    }

}
