package AlgoritimoEstrutura1;

class Sorts {
    ContagemInstru c = new ContagemInstru();

    public int[] bubbleNormalVersion(int[] vetor) {
        int[] vet1 = vetor;

        for (int i = 0; i < vet1.length; i++) {

            for (int j = 0; j < vet1.length - 1; j++) {
                if (vet1[j] > vet1[j + 1]) {
                    int aux;
                    aux = vet1[j];
                    vet1[j] = vet1[j + 1];
                    vet1[j + 1] = aux;
                }
            }
        }
        return vet1;
    }

    public int[] bubbleOptimizeVersion(int[] vetor) {
        int[] vet2 = vetor;
        boolean valida = true;

        while (valida) {
            valida = false;
            for (int i = 0; i < vet2.length - 1; i++) {
                if (vet2[i] > vet2[i + 1]) {
                    int aux;
                    aux = vet2[i];
                    vet2[i] = vet2[i + 1];
                    vet2[i + 1] = aux;
                    valida = true;
                }
            }
        }
        return vet2;
    }

    public int[] insertNormalVersion(int[] vetor) {
        int i, j, chave;
        for (j = 1; j < vetor.length; j++) {
            chave = vetor[j];
            i = j - 1;

            while ((i >= 0) && (vetor[i] > chave)) {
                c.contInte(1);
                vetor[i + 1] = vetor[i];
                i = i - 1;
            }
            vetor[i + 1] = chave;
        }
        return vetor;
    }

    public int[] mergeSort(int[] v) {
        mergeSort(v, 0, v.length - 1);
        return v;
    }

    public void mergeSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio + 1, fim);
            merge(v, inicio, meio, fim);
        }
    }

    private void merge(int[] v, int inicio, int meio, int fim) {
        int nL = meio - inicio + 1;
        int nR = fim - meio;
        int[] L = new int[nL];
        int[] R = new int[nR];
        System.arraycopy(v, inicio, L, 0, nL);
        System.arraycopy(v, meio + 1, R, 0, nR);
        int iL = 0;
        int iR = 0;

        for (int k = inicio; k <= fim; k++) {
            c.contInte(1);
            if (iR < nR) {
                c.contInstru(1);
                if (iL < nL) {
                    if (L[iL] < R[iR]) v[k] = L[iL++];
                    else v[k] = R[iR++];
                } else v[k] = R[iR++];
            } else v[k] = L[iL++];
        }
    }

    public int[] quicksort(int[] v){
        int low, high;
        low = 0;
        high = v.length - 1;
        return quicksort(v,low,high);
    }

    private int[] quicksort(int[] v, int low, int high) {
        int pivot;
        if ((high - low) > 0) {
            pivot = partition(v, low, high);
            quicksort(v, low, pivot - 1);
            quicksort(v, pivot + 1, high);
        }
        return v;
    }

    private int partition(int[] v, int low, int high) {
        int i, p, firsthigh;
        firsthigh = low;
        p = high;

        for (i = low; i < high; i++)
            if (v[i] < v[p]) {
                swap(v, i, firsthigh);
                firsthigh = firsthigh + 1;
            }
        swap(v, p, firsthigh);
        return firsthigh;
    }

    public void swap(int[] v, int p, int f){
        int aux;
        aux = v[p];
        v[p] = v[f];
        v[f] = aux;
    }

    public ContagemInstru retornaContagem() {
        return c;
    }

    public void zeraContagem() {
        c.setInteracoes(0);
        c.setInstrucoes(0);
    }
}