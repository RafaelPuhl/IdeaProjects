package POO.ErancaEPolimorfismo;

public class Telefonia extends Produto {
    private boolean importado;

    public Telefonia(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    public void setImportado(boolean i){
        this.importado = i;
    }

    @Override
    public double getImposto() {
        if (importado == false) {
            return super.getImposto();
        }else{
            return super.getImposto()*0.5;
        }
    }
}
