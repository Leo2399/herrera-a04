/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Leonardo Herrera
 */

package baseline;

import java.io.IOException;

public class Solution42 {
    public static void main(String[] args) throws IOException {

        fileReader read = new fileReader();
        // Use the fileReader class to read form the input file

        // Set the headers for the output
        System.out.printf("%-10s%-10s%-10s%n", "Last", "First", "Salary");
        System.out.println("--------------------------");

        // Get the data from the txt file though the fileReader class
        read.parseData();
    }
}
