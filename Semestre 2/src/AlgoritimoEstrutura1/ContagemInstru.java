package AlgoritimoEstrutura1;

public class ContagemInstru {
    private int instrucoes = 0;
    private int interacoes = 0;

    public void setInstrucoes(int instrucoes) {
        this.instrucoes = instrucoes;
    }

    public void setInteracoes(int interacoes) {
        this.interacoes = interacoes;
    }

    public void contInstru(int n){
        this.instrucoes = instrucoes + n;
    }

    public void contInte(int n){
        this.interacoes = interacoes + n;
    }

    public int getInstrucoes() {
        return instrucoes;
    }

    public int getInteracoes() {
        return interacoes;
    }
}
