package POO;

public class App_Sobrecarga {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0,-2);
        Ponto p2 = new Ponto(-6,-10);
        System.out.println(Ponto.distanciaEntrePontos(p1,p2));

        Geometria g = new Geometria(10, 20);
        g.superficieEsfera();
        g.volumeCilindro();
        g.volumeCone();
        g.volumeEsfera();
        System.out.println(Fah_Cel_Cen_Pes.fahParaCelcios(122));
    }
}
