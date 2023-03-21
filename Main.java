//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        if (args.length < 1) {
//            System.out.println("Uso: java Main <arquivo-de-entrada>");
//            System.exit(1);
//        }
//
//        String arquivoEntrada = args[0];
//        Simulador simulador = new Simulador();
//
//        try {
//            simulador.lerArquivo(arquivoEntrada);
//        } catch (IOException e) {
//            System.err.println("Erro ao ler arquivo de entrada: " + e.getMessage());
//            System.exit(1);
//        }
//
//        simulador.jogar();
//
//        System.out.println("Macaquinho vencedor: " + simulador.getVencedor());
//    }
//}