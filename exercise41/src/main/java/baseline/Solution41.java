/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Leonardo Herrera
 */

package baseline;

import java.io.*;
import java.util.ArrayList;
/*
 Initially I had the whole program in one class, but then decided to split it
 into multiple classes
 */
public class Solution41 {

    public static void main(String[] args) throws IOException {

        // NameSorter object
        NameSorter read = new NameSorter();

        // read the input file
        read.readNames();

        // store names in an array list
        ArrayList<String> names = read.getNames();

        // WriteFile object
        WriteFile w = new WriteFile(names);

        // write the output file
        w.write();
    }
}
