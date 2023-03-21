//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Simulador {
//    public static Macaquinho simular(int numRodadas, List<Macaquinho> macaquinhos) {
//        for (int i = 0; i < numRodadas; i++) {
//            for (Macaquinho macaquinho : macaquinhos) {
//                for (Coco coco : new ArrayList<>(macaquinho.getCocos())) {
//                    macaquinho.enviarCoco(coco, macaquinhos);
//                    macaquinho.getCocos().remove(coco);
//                }
//            }
//        }
//        Macaquinho vencedor = macaquinhos.get(0);
//        for (Macaquinho macaquinho : macaquinhos) {
//            if (macaquinho.getNumCocos() > vencedor.getNumCocos()) {
//                vencedor = macaquinho;
//            }
//        }
//        return vencedor;
//    }
//
//	public void lerArquivo(String nomeArquivo) {
//		BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
//		String linha = reader.readLine();
//		String[] valores = linha.split(" ");
//		int numRodadas = Integer.parseInt(valores[1]);
//		this.inicializarJogo(numRodadas);
//
//		while ((linha = reader.readLine()) != null) {
//			valores = linha.split(" ");
//
//			int idMacaquinho = Integer.parseInt(valores[1]);
//			int macaquinhoPar = Integer.parseInt(valores[4]);
//			int macaquinhoImpar = Integer.parseInt(valores[6]);
//
//			Macaquinho macaquinho = this.jogo.getMacaquinho(idMacaquinho);
//			macaquinho.setMacaquinhoPar(this.jogo.getMacaquinho(macaquinhoPar));
//			macaquinho.setMacaquinhoImpar(this.jogo.getMacaquinho(macaquinhoImpar));
//
//			int numCocos = Integer.parseInt(valores[8]);
//			for (int i = 0; i < numCocos; i++) {
//				int numPedrinhas = Integer.parseInt(valores[9 + i]);
//				macaquinho.adicionarCoco(new Coco(numPedrinhas));
//			}
//		}
//		reader.close();
//	}
//}