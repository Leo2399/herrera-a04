package baseline;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class ReadJSONFile {
    // use this class to read through the json file
    // imported the json parser
    String fileName;
    JsonElement name;
    float price;
    int quantity;

    public ReadJSONFile(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
    }
    private JsonObject sub = new JsonObject();
    private Scanner in;
    private File inputFile;
    private JsonArray products = (JsonArray) sub.get("product");
    private BufferedReader br = new BufferedReader(new FileReader(fileName));

    public File readJson() throws FileNotFoundException {
        // create a json object
        inputFile = new File(fileName);
        in = new Scanner(inputFile);
        // open the file to read from

        System.out.println(products);

        return inputFile;
    }

    public void displayProducts() throws IOException {
        // displays the product
        Iterator itr = products.iterator();

        while(itr.hasNext()){
            JsonObject find = (JsonObject) itr.next();
            name = find.get("name");
        }

        // name
        // price
        // quantity

    }

}
