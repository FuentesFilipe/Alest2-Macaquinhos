import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src/rodadas.txt"));
        String line = reader.readLine();
        String[] vals = line.split(" ");
        System.out.println(vals[1]);

        while (line != null) {
            if (line.startsWith("Macaco")) {
                String[] token = line.split("  ");
                System.out.println(token[1]);
            }
            line = reader.readLine();
        }
        reader.close();
    }

}
