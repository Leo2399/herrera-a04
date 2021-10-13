/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Leonardo Herrera
 */

package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution41 {

    public static void main(String[] args) throws IOException {

        String input = "data/exercise41_input.txt";
        Scanner inputFile = new Scanner(new File(input));
        // read the input file
        // store names in an array list
        ArrayList<String> names = new ArrayList<>();

        // call readNames() function
        readNames(inputFile,names);

        // sort the names in alphabetical order
        Collections.sort(names);

        // call the writeOutput() function
        writeOutput(names);

        // close the input file
        inputFile.close();

    }

     public static void readNames(Scanner in, ArrayList<String> names){
        // use this function to read the names from the input file
        // go through the file and read each name
        while(in.hasNextLine()){
            names.add(in.nextLine());
        }
    }

     public static void writeOutput(ArrayList<String> names) throws IOException {
        //use this function to write the output txt file
        String output = "data/exercise41_output.txt";
        // create the output file to write into it
        FileWriter outputFile = new FileWriter(output);
        // have the number of names in the files read

        outputFile.write("Total of "+names.size()+" names\n");

        // write the output file
        for(String i : names){
            outputFile.write(i + "\n");
        }
        // close the output file
        outputFile.close();
    }
}
