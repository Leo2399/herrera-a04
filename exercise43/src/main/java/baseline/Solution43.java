package baseline;

import java.io.IOException;
import java.util.Scanner;

public class Solution43 {

    private static final Scanner in = new Scanner(System.in);

    // Using this public string to
    public static final String Created = "Created ";

    public static void main(String[] args) throws IOException {

        SiteGenerator website = new SiteGenerator();

        // prompt for the name of the website.
        System.out.print("Site name: ");
        String site = in.nextLine();

        // prompt for the author.
        System.out.print("Author: ");
        String name = in.nextLine();

        // ask if they want to add JavaScript.
        System.out.print("Do you want a folder for JavaScript? ");
        String js = in.nextLine();

        // ask if they want to add CSS.
        System.out.print("Do you want a folder for CSS? ");
        String css = in.nextLine();

        website.siteName = site;
        website.author = name;
        website.path = "data/";

        // generate the website with the html file.
        System.out.println(Created+website.createSite());
        System.out.println(Created+website.createHTML());

        // if "y", create the js folder
        if(js.equals("y")||js.equals("Y")){
            System.out.println(Created+website.createJSFolder());
        }

        // if "y", create the css folder
        if(css.equals("y")||css.equals("Y")){
            System.out.println(Created+website.createCSSFolder());
        }
    }
}
