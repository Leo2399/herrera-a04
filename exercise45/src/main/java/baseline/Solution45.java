package baseline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution45 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        ReadFile read = new ReadFile();
        // read the file
        read.read();

        ArrayList<String> content = read.content();

        // ask for the name of the output file
        System.out.println("What is the name of the output file? ");
        String name = in.nextLine();

        WriteFile write = new WriteFile(name, content);
        write.writeToFile();
    }
}
