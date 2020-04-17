package POO;

public class Cofrinho {

    private int capacidadeCofrinho = 500;
    private int quantidade;
    private Moeda moedas[];

    public Cofrinho(){
        moedas = new Moeda[capacidadeCofrinho];
        quantidade = 0;
    }

    public void inserir(Moeda moeda){
        moedas[quantidade] = moeda;
        quantidade ++;
    }

    public void retira(){
        if(quantidade > 0) {
            quantidade--;
            moedas[quantidade] = null;
            System.out.println("Ultima moeda iseriada foi retirada");
        }else{
            System.out.println("Cofrinho vazio");
        }
    }

    public int getQtdTotal(){
        return quantidade;
    }

    public int getMoeda(NomeMoeda moeda){
        int count = 0;
        for (int i = 0; i < quantidade ; i++) {
            if (moedas[i].getNomeMoeda() == moeda ){
                count ++;
            }
        }
        return count;
    }

    public int getDinheiroCent(){
        int dinheiro = 0;
        for (int i = 0; i < quantidade; i++) {
            dinheiro = dinheiro + moedas[i].getValorCentavos();
        }
        return dinheiro;
    }

    public double getDinheiroReal(){
        double dinheiro = 0;
        for (int i = 0; i < quantidade; i++) {
            dinheiro = dinheiro + moedas[i].getValorReais();
        }
        return dinheiro;
    }
}