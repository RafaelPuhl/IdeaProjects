package AlgoritimoEstrutura1;

public class AppSort {
    public static void main(String[] args) {
        new GeraVetor();
        Sorts sort = new Sorts();
        int[] vetor = GeraVetor.geraVetorAleatorio(5);
        int[] vetorAux;
        ContagemInstru c;
        System.out.println("Vetor Aleatorio: ");
        for (int v : vetor) {
            System.out.print(v + " | ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        ///////////////////////////////////////////////////////////////////////////////////
        vetorAux = vetor.clone();
        vetorAux = sort.bubbleNormalVersion(vetorAux);
        System.out.println("BubbleSort Normal:");
        for (int v1 : vetorAux) {
            System.out.print(v1 + " | ");
        }
        c = sort.retornaContagem();
        System.out.println();
        System.out.println("Interacoes: " + c.getInteracoes() + " Instrucoes: " + c.getInstrucoes());
        System.out.println("--------------------------------------------------------");
        sort.zeraContagem();
        ///////////////////////////////////////////////////////////////////////////////////
        vetorAux = vetor.clone();
        vetorAux = sort.bubbleOptimizeVersion(vetorAux);
        System.out.println("BubbleSort Otimizado:");
        for (int v2 : vetorAux) {
            System.out.print(v2 + " | ");
        }
        c = sort.retornaContagem();
        System.out.println();
        System.out.println("Interacoes: " + c.getInteracoes() + " Instrucoes: " + c.getInstrucoes());
        System.out.println("--------------------------------------------------------");
        sort.zeraContagem();
        ///////////////////////////////////////////////////////////////////////////////////
        vetorAux = vetor.clone();
        vetorAux = sort.insertNormalVersion(vetorAux);
        System.out.println("InsertSort Otimizado:");
        for (int v3 : vetorAux) {
            System.out.print(v3 + " | ");
        }
        c = sort.retornaContagem();
        System.out.println();
        System.out.println("Interacoes: " + c.getInteracoes() + " Instrucoes: " + c.getInstrucoes());
        System.out.println("--------------------------------------------------------");
        sort.zeraContagem();
        ///////////////////////////////////////////////////////////////////////////////////
        vetorAux = vetor.clone();
        vetorAux = sort.mergeSort(vetorAux);
        System.out.println("MergeSort Normal:");
        for (int v4: vetorAux) {
            System.out.print(v4 + " | ");
        }
        c = sort.retornaContagem();
        System.out.println();
        System.out.println("Interacoes: " + c.getInteracoes() + " Instrucoes: " + c.getInstrucoes());
        System.out.println("--------------------------------------------------------");
        sort.zeraContagem();
        ///////////////////////////////////////////////////////////////////////////////////
        vetorAux = vetor.clone();
        vetorAux = sort.

        ///////////////////////////////////////////////////////////////////////////////////
    }
}
