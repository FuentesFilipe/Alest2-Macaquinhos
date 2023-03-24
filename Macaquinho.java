import java.util.List;

public class Macaquinho {
    private int id;
    private int par;
    private int impar;
    private List<Integer> cocos;

    public Macaquinho(int id, int par, int impar, List<Integer> cocos) {
        this.id = id;
        this.par = par;
        this.impar = impar;
        this.cocos = cocos;
    }

    public void enviarCoco(int coco, List<Macaquinho> macaquinhos) {

        this.cocos.remove(cocos.indexOf(coco));

        int destino;
        if (coco % 2 == 0) {
            destino = par;
        } else {
            destino = impar;
        }
        macaquinhos.get(destino).receberCoco(coco);
    }

    public void receberCoco(int coco) {
        cocos.add(coco);
    }

    public int getId() {
        return id;
    }

    public List<Integer> getCocos() {
        return cocos;
    }

    public Integer getNumCocos() {
        return this.getCocos().size();
    }
}
