public class Macaquinho {
    private int par;
    private int impar;
    private int pares;
    private int impares;

    public Macaquinho(int par, int impar, int pares, int impares) {
        this.par = par;
        this.impar = impar;
        this.pares = pares;
        this.impares = impares;
    }

    public int getNumCocos() {
        return pares + impares;
    }

    public int getPar() {
        return par;
    }

    public int getImpar() {
        return impar;
    }

    public int getPares() {
        return pares;
    }

    public int getImpares() {
        return impares;
    }

    public void incrementPares(int pares) {
        this.pares += pares;
    }

    public void incrementImpares(int impares) {
        this.impares += impares;
    }

    public void resetCocos() {
        this.pares = 0;
        this.impares = 0;
    }
}
