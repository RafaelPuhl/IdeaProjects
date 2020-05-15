package POO.ClassesAbstratasEInterfaces;

import java.util.ArrayList;

public class Agencia {
    protected int numeroAgencia;
    ArrayList<Conta> contas = new ArrayList();
    public Agencia(int numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }
    public void cadastraConta(Conta conta){
        contas.add(conta);
    }

    public Conta getConta(int numero) {
        for (Conta c : contas) {
            if(c.getNumero() == numero){
                return c;
            }
        }
        System.out.println("Conta nao encontrada!");
        return null;
    }
}
