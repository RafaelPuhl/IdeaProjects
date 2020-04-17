package AlgoritimoEstrutura1;

class Sorts {
    ContagemInstru c = new ContagemInstru();
    public int[] bubbleNormalVersion(int[] vetor) {
        int [] vet1 = vetor;
        for (int i = 0; i < vet1.length ; i++) {
            for (int j = 0; j < vet1.length-1; j++) {
                c.contInte(1);
                if(vet1[j] > vet1[j+1]){
                    int aux;
                    aux = vet1[j];
                    vet1[j] = vet1[j+1];
                    vet1[j+1] = aux;
                    c.contInstru(13);
                }
            }
            c.contInstru(2);
        }
        return vet1;
    }

    public int[] bubbleOptimizeVersion(int[] vetor){
        int [] vet2 = vetor;
        boolean valida = true;
        while (valida){
            c.contInte(1);
            valida = false;
            c.contInstru(2);
            for (int i = 0; i < vet2.length-1; i++) {
                if(vet2[i] > vet2[i+1]){
                    int aux;
                    aux = vet2[i];
                    vet2[i] = vet2[i+1];
                    vet2[i+1] = aux;
                    valida = true;
                }
                c.contInstru(12);
            }
        }
        return vet2;
    }

    public int[] insertNormalVersion(int [] vetor) {
        int i, j, chave;
        for (j=1; j<vetor.length; j++) {
            chave = vetor[j];
            i = j - 1;
            while ((i >= 0) && (vetor[i] > chave)) {
                vetor[i+1] = vetor[i];
                i = i - 1;
            }
            vetor[i+1] = chave;
        }
        return vetor;
    }


    public ContagemInstru retornaContagem(){
        return c;

    }

    public void zeraContagem(){
        c.setInteracoes(0);
        c.setInstrucoes(0);
    }
}
