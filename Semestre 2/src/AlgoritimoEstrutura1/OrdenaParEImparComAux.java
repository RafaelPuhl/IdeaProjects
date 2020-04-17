package AlgoritimoEstrutura1;


public class OrdenaParEImparComAux {
    public static void main(String[] args) {
        ContagemInstru c = new ContagemInstru();
        new GeraVetor();
        int[] vet1 = GeraVetor.geraVetorParImpar(5,5);
        int[] vet2 = new int[vet1.length];
        int contPar = 0;
        int contImpar = vet1.length-1;
        c.contInstru(9);
        for (int vet: vet1) {
            c.contInte(1);
            if (vet % 2 == 0){
                vet2[contPar] = vet;
                contPar ++;
                c.contInstru(6);
            }else{
                vet2[contImpar] = vet;
                contImpar --;
                c.contInstru(4);
            }
        }
        for (int vet: vet2) {
            c.contInte(1);
            System.out.print(vet+ " ");
            c.contInstru(3);
        }System.out.println();
        System.out.print("Instrucoes: "+c.getInstrucoes()+" Interacoes: "+c.getInteracoes() );
    }
}
