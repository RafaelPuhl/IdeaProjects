package POO;

public class Ponto {
    private int x, y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public Ponto(Ponto p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static double distanciaEntrePontos(Ponto p1, Ponto p2) {
        double auxX, auxY, result;
        auxX = p2.getX() - p1.getX();
        auxY = p2.getY() - p1.getY();
        result = (Math.pow(auxX,2)) + (Math.pow(auxY,2));
        result = Math.sqrt(result);
        return result;
    }

}
