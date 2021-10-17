package baseline;

/*
    Use this class to write the output file
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
    // make a constructor with the file name and the array list as the parameters
    // create instance variables for the File Writer and array list

    String fileName;
    FileWriter output;
    ArrayList<String> content;

    public WriteFile(String fileName, ArrayList<String> content) throws IOException {
        // create the output file with the name given by the user
        output = new FileWriter("data/"+fileName);
        this.fileName = fileName;
        this.content = content;
    }

    public void writeToFile() throws IOException {
        // for every instance of the word "utilize" and replace it with "use"
        for(int i=0; i<content.size(); i++){
            String replace = content.get(i);

            replace = replace.replaceAll("utilize", "use");

            // write the new file
            output.write(replace+"\n");
        }

        // close the file
        output.close();
    }
}
