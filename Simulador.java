import java.io.*;
import java.util.ArrayList;


public class Simulador {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/rodadas.txt"));
        String line = reader.readLine();

        // criar variavel pra armazenar numero de rodadas e a coleção de macacos
        int numRodadas = 0;
        ArrayList<Macaquinho> macacos = new ArrayList<>();

        while (line != null) { // START DO LOOP
            String[] words = line.split(" ");

             if (line.startsWith("Macaco")) {
                 // pega o Id do macaco da linha
                 int id = Integer.parseInt(words[1]);

                 // pega os Id dos macacos que irão receber cocos em caso de par ou impar nas pedrinhas
                 int par = Integer.parseInt(words[4]);
                 int impar = Integer.parseInt(words[7]);

                 // inicializa a lista de cocos de cada macaco
                 ArrayList<Integer> cocos = new ArrayList<>();

                 // pega os valores das pedrinhas em cada coco
                 for (int i = 11; i < words.length; i++) {
                     cocos.add(Integer.parseInt(words[i]));
                 }

                 // inicializa o macaco da linha com as informações obtidas
                 Macaquinho macaco = new Macaquinho(id, par, impar, cocos);
                 macacos.add(macaco);
             } else {
                 // pega o numero de rodadas da primeira linha
                 numRodadas = Integer.parseInt(words[1]);
             }
            line = reader.readLine();
        } // FINAL DO LOOP
        reader.close(); // FINAL LEITURA ARQUIVO
        int numMacacos = macacos.size();

        // INICIO JOGO
        for (int i = 0; i < numRodadas; i++) {
            // loop para iterar sob a lista de macacos
            for (int j = 0; j < numMacacos; j++) {
                Macaquinho auxMacaco = macacos.get(j);
                // loop para iterar sobre cada coco
                for (int k = 0; k < auxMacaco.getNumCocos(); k++) {
                    auxMacaco.enviarCoco(auxMacaco.getCocos().get(k), macacos);
                }
            }
        } // FINAL DO JOGO

        for (Macaquinho macaco:
             macacos) {
            System.out.println(macaco.getCocos());
        }
    }
}
