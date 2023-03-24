import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Simulador {
    public static void main(String[] args) throws IOException {
        // Reading the file with readAllLines()
        List<String> lines = Files.readAllLines(Paths.get("src/rodadas.txt"));


        int numRodadas = 0;
        ArrayList<Macaquinho> macacos = new ArrayList<>();
        for (String line : lines) { // INICIO DO ARQUIVO
            String[] words = line.split(" ");
            if (line.startsWith("Macaco")) {
                // pega os Id dos macacos que irão receber cocos em caso de par ou impar nas pedrinhas
                int par = Integer.parseInt(words[4]);
                int impar = Integer.parseInt(words[7]);

                int pares = 0;
                int impares = 0;

                // soma quantos cocos o macaco da linha atual tem que
                // mandar para cada remetente, tanto par quanto impar
                for (int i = 11; i < words.length; i++) {
                    int aux = Integer.parseInt(words[i]);
                    if ((aux^1) == aux+1)
                        pares++;
                    else impares++;
                }

                // inicializa o macaco da linha com as informações obtidas
                Macaquinho macaco = new Macaquinho(par, impar, pares, impares);
                macacos.add(macaco);
            } else {
                // pega o numero de rodadas da primeira linha
                numRodadas = Integer.parseInt(words[1]);
            }
        }// FINAL DO ARQUIVO
        
        // INICIO JOGO
        for (int i = 0; i < numRodadas; i++) {
            for (Macaquinho macaco:
                 macacos) {
                // guarda em variaveis auxiliares quantos cocos o macaco precisa mandar,
                // tanto para o seu remetente par e impar
                int auxPares = macaco.getPares();
                int auxImpares = macaco.getImpares();

                // reseta os cocos do macaco para ele receber os sesu depois certinho
                macaco.resetCocos();

                // pegar o index dos remetentes deste macaco
                int auxIndexPar = macaco.getPar();
                int auxIndexImpar = macaco.getImpar();

                // manda todos os cocos necessários de uma vez para o remetente par e o remetente impar
                macacos.get(auxIndexPar).incrementPares(auxPares);
                macacos.get(auxIndexImpar).incrementImpares(auxImpares);
            }
        } // FINAL DO JOGO

        System.out.printf("Resultado dos Macacos após %d rodadas: \n", numRodadas);
        for (Macaquinho macaco:
             macacos) {
            System.out.println(macaco.getPares() + macaco.getImpares());
        }
    }
}
