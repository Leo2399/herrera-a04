package baseline;


import java.util.Arrays;
import java.util.Collections;

import java.util.Map;

public class PrintFrequency {
   private Map<String, Integer> words;

   // create a constructor that uses the hashmap as a parameter
   public PrintFrequency(Map<String, Integer> words){
      this.words = words;
   }

   public void display(){
      // store the string and integer values of the map in arrays
      String[] keys = new String[words.size()];
      Integer[] values = new Integer[words.size()];
      int k=0;

      // go through the map and store the values
      for(Map.Entry<String, Integer> entry : words.entrySet()){
         keys[k] = entry.getKey();
         values[k++] = entry.getValue();
      }

      String[] repeatedKeys = new String[words.size()];
      int[] repeatedValues = new int[words.size()];

      // get the duplicate words
      for(int i=0; i<values.length; i++){
         repeatedValues[i] = values[i];
      }

      for(int i=0; i<words.size(); i++){
         int value = values[i];

         for (int repeatedValue : repeatedValues) {
            if (value == repeatedValue) {
               repeatedKeys[i] = keys[i];
               break;
            }
         }
      }

      // sort the words from most frequent to less frequent
      Arrays.sort(values,Collections.reverseOrder());

      // make sure the names and corresponding frequencies are correct
      // print the output
      for(int i=0; i<words.size(); i++){

         int value = words.get(repeatedKeys[i]);
         System.out.print(repeatedKeys[i]+": ");


         for(int j=0; j<value; j++){
            System.out.print("*");
         }
         System.out.println();
      }

   }
}
