package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReader {

   public File parseData() throws FileNotFoundException {

        // Open file and read the data
       File inputFile = new File("data/exercise42_input.txt");
        try (Scanner input = new Scanner(inputFile)) {

            while (input.hasNextLine()) {
                // Remove the commas from the text file
                // by splitting after each comma and storing that
                // string in an array
                String s = input.nextLine();
                String[] data = s.split(",");

                // Print the data form the text file
                System.out.printf("%-10s%-10s%-10s%n", data[0], data[1], data[2]);
            }
        }
       return inputFile;
   }
}
