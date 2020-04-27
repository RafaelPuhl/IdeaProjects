package POO;

public class Fah_Cel_Cen_Pes {
    public static double celciosParaFah(double c) {
        return (c * 1.8) + 32;
    }

    public static double fahParaCelcios(double f) {
        return (f - 32) / 1.8;
    }
    public static double cmParaPes(double cm){
        return cm/30.48;
    }
    public static double pesParaCm(double pes){
        return pes*30.48;
    }
}
