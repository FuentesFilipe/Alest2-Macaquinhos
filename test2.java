import java.io.*;
import java.util.ArrayList;


public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/rodadas.txt"));
        String line = reader.readLine();

//      criar a coleção de macacos
        ArrayList<Macaquinho> macacos = new ArrayList<>();

        while (line != null) {
             if (line.startsWith("Macaco")) {
                 // split the line into an array of words using space as delimiter
                 String[] words = line.split(" ");

                 // get the id from the second word
                 int id = Integer.parseInt(words[1]);

                 // get the number of even and odd integers from the fifth word
                 int par = Integer.parseInt(words[4]);
                 int impar = Integer.parseInt(words[7]);

                 // create an ArrayList to hold the integer values
                 ArrayList<Integer> cocos = new ArrayList<>();

                 // iterate through the rest of the words in the line, starting from the 10th word
                 for (int i = 12; i < words.length; i++) {
                     // convert each word to an integer and add it to the ArrayList
                     cocos.add(Integer.parseInt(words[i]));
                 }

                 Macaquinho macaco = new Macaquinho(id, par, impar, cocos);
                 macacos.add(macaco);
             }

            line = reader.readLine();
            // do something with the Macaquinho object, like add it to a List or print its values
        }
        reader.close();
        System.out.println(macacos);
    }
}
