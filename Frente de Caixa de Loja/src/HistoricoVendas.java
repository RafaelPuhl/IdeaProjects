import java.util.ArrayList;

public class HistoricoVendas {
    private ArrayList<Venda> listOfHistory = new ArrayList<>();

    public HistoricoVendas() {

    }

    public int getVendas() {
        return listOfHistory.size();
    }

    public ArrayList<Venda> getListaVendas() {
        return listOfHistory;
    }

    public boolean cadastraVenda(Venda venda) {
        listOfHistory.add(venda);
        return true;
    }

    public Venda getVenda(int nro) {
        for (Venda venda : listOfHistory) {
            if (venda.getNumero() == nro) {
                return venda;
            }
        }
        return null;
    }
}
