package SweetMari;

public class Caixa {
    protected String saldo;
    protected String saldoPendente;
    String[] valores;
    public Caixa(){
        valores = ArquivoCaixa.leia();
        this.saldo = valores[0];
        this.saldoPendente = valores[1];
    }

    public void setSaldo(double saldo){
        ArquivoCaixa.escrevaSaldo(saldo, this.saldoPendente);
        valores = ArquivoCaixa.leia();
        this.saldo = valores[0];
    }

    public void setSaldoPendente(double saldo){
        ArquivoCaixa.escrevaSaldoPendente(saldo, this.saldo);
        valores = ArquivoCaixa.leia();
        this.saldoPendente = valores[1];
    }

    public String getSaldo() {
        return saldo;
    }

    public String getSaldoPendente() {
        return saldoPendente;
    }

    public String[] getValores() {
        return valores;
    }
}
