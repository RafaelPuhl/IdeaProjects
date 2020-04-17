package AlgoritimoEstrutura1;

import java.util.Random;

class GeraVetor{

    public static int[] geraVetorOrdenado(int nroEspacos){
        int [] res = new int[nroEspacos];
        int ordem = 1;
        Random rnd = new Random();
        for (int i = 0; i < res.length ; i++) {
            res[i] = ordem;
            ordem ++;
        }
        return res;
    }

    public static int[] geraVetorAleatorio(int nroEspacos){
        int [] res = new int[nroEspacos];
        Random rnd = new Random();
        for (int i = 0; i < res.length ; i++) {
            res[i] = rnd.nextInt(99) + 1;
        }
        return res;
    }

    public static int[] geraVetorParImpar(int nroPares, int nroImpares){
        int [] res = null;
        int contPar = 0, contImpar = 0, novoNum;
        Random rnd = new Random();
        if ((nroPares >= 0) ||
                (nroImpares >= 0) &&
                        (nroPares + nroImpares > 0)) {
            res = new int[nroPares + nroImpares];
            while ((contPar < nroPares) || (contImpar < nroImpares)) {
                novoNum = rnd.nextInt(98)+1;
                if ((novoNum % 2 == 0) && (contPar < nroPares)) {
                    res[contPar+contImpar] = novoNum;
                    contPar++;
                }
                else if ((novoNum % 2 == 1) && (contImpar < nroImpares)) {
                    res[contPar+contImpar] = novoNum;
                    contImpar++;
                }
            }
        }
        return res;
    }
}
