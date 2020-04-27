package POO;

public class Geometria {
    public double raio, altura;

    public Geometria(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public void volumeEsfera(){
        System.out.println("Volume da esfera: " +  (4/3 * Math.PI * Math.pow(raio,3)) + " cm3");
    }
    public void superficieEsfera(){
        System.out.println("Superficie da esfera: " + (4 * Math.PI * Math.pow(raio,2)) + " cm2");
    }
    public void volumeCilindro(){
        System.out.println("Volume do cilindro: " + (Math.PI * Math.pow(raio,2) * altura) + " cm3");
    }
    public void volumeCone(){
        System.out.println("Voluem do cone: " + (Math.PI * Math.pow(raio,2) * altura /3) + " cm3");
    }
}
