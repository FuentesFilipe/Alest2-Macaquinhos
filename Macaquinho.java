//import java.util.List;
//
//public class Macaquinho {
//    private int id;
//    private int par;
//    private int impar;
//    private List<Coco> cocos;
//
//    public Macaquinho(int id, int par, int impar, List<Coco> cocos) {
//        this.id = id;
//        this.par = par;
//        this.impar = impar;
//        this.cocos = cocos;
//    }
//
//    public void enviarCoco(Coco coco, List<Macaquinho> macaquinhos) {
//        int destino;
//        if (coco.getNumPedrinhas() % 2 == 0) {
//            destino = par;
//        } else {
//            destino = impar;
//        }
//        macaquinhos.get(destino).receberCoco(coco);
//    }
//
//    public void receberCoco(Coco coco) {
//        cocos.add(coco);
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public List<Coco> getCocos() {
//        return cocos;
//    }
//
//    public int getNumCocos() {
//        return cocos.size();
//    }
//}
