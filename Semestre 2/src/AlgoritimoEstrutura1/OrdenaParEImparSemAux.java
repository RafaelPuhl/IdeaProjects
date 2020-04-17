package AlgoritimoEstrutura1;

import java.util.Random;

public class OrdenaParEImparSemAux {
    public static void main(String[] args) {
        ContagemInstru c = new ContagemInstru();
        new GeraVetor();
        int[] vet = GeraVetor.geraVetorParImpar(5,5);
        int posicao = 0;
        c.contInstru(6);
        for (int i = 0; i < vet.length ; i++){
            c.contInte(1);
            c.contInstru(3);
            if (vet[i] % 2 == 0){
                int guarda = vet[posicao];
                vet[posicao] = vet[i];
                vet[i] = guarda;
                posicao ++;
                c.contInstru(10);
            }
        }
        for (int n: vet ) {
            c.contInte(1);
            System.out.print(n + " ");
            c.contInstru(3);
        }
        System.out.println();
        System.out.println("Total Instrucoes: "+c.getInstrucoes()+" Total Interacoes: "+c.getInteracoes());
    }
}
