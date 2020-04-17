package AlgoritimoEstrutura1;

public class PesquisaDiretaEmTabela {
    private static long tempoIni = 0;
    private static long tempoFim = 0;

    public static void main(String[] args) {

        new GeraVetor();
        ContagemInstru c = new ContagemInstru();
        int procurado = 77;
        int count = 0;
        initClock();
        int[] vet = GeraVetor.geraVetorAleatorio(1000);
        for (int i = 0; (i < vet.length && vet[i] != procurado); i++) {
            c.contInte(1);
            if (vet[count] != procurado) {
                count++;
            }
        }
        if ((count == 1000) && (vet[count - 1] != procurado)) {
            System.out.println("-1 " + " Interacoes: " + c.getInteracoes() + " Tempo: " + getClockSec());
        } else {
            System.out.println("Posicao: "+ count + " Interacoes: " + c.getInteracoes() + " Tempo: " + getClockSec());
            System.out.println();
        }
    }

    public static void initClock() {
        tempoIni = tempoFim = System.nanoTime();
    }

    public static double getClockSec() {
        double res;
        tempoFim = System.nanoTime();
        res = ((double) tempoFim - (double) tempoIni) / (double) 1_000_000_000.0;
        return res;
    }
}