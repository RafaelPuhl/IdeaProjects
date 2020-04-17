package AlgoritimoEstrutura1;

public class PesquisaBinaria {
    public static void main(String[] args) {
        new GeraVetor();
        int value = 501;
        int[] vet = GeraVetor.geraVetorOrdenado(1000);
        int metade = vet.length / 2;
        if (value < metade){
            for (int i = 0; i < metade ; i++) {
                if (vet[i] == value){
                    System.out.println("Achou metade menor!!");
                    break;
                }
            }
        }else{
            for (int i = metade; i < vet.length - 1; i++) {
                if (vet[i] == value){
                    System.out.println("Achou na metade maior!!");
                    break;
                }
            }
        }
    }
}
