package POO.ErancaEPolimorfismo;

public class Executive extends Passagem {
    private int pesoDesconto;
    public Executive(String nome, String cpf, double custoPassagem) {
        super(nome, cpf, custoPassagem);
    }

    @Override
    public double custoBagagem(int[] pesos) {

        if (pesos.length <= 2){
            return 0;
        }else{
            for (int i = 0; i < 2 ; i++) {
                this.pesoDesconto += pesos[i];
            }
            return super.custoBagagem(pesos) - this.pesoDesconto*0.5;
        }
    }
    public int getMilhas(){
        return (int) (getCustoPassagem() * 0.10);
    }
}
