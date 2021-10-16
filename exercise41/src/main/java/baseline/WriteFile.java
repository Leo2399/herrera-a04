package baseline;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 This class will write the contents of the input file into
 a new output file
 */

public class WriteFile {

    private FileWriter outputFile;
    private ArrayList<String> names;

    // constructor
    public WriteFile(ArrayList<String>names) throws IOException {
        outputFile = new FileWriter("data/exercise41_output.txt");
        this.names = names;
    }

    public void write() throws IOException {

        // displays the number of names in the file
        outputFile.write("Total of "+ names.size()+" names\n");

        // writes the names into the output file
        for(String i: names){
            outputFile.write(i+"\n");
        }

        // close the output file
        outputFile.close();
    }
}
