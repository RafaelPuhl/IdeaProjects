package POO.FuncoesLambda;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Um");
        list.add("Dois");
        list.add("Tres");

        for (String str:list) {
            System.out.println(str);
        }

        List<String> newList = processaLista(list, a -> a.toUpperCase());

        for (String str : newList) {
            System.out.println(str);
        }
    }

    public static List<String> processaLista(List<String> lista, OperacaoString op) {
        List<String> nova = new ArrayList<String>(lista.size());
        for (String s : lista) {
            nova.add(op.operacao(s));
        }
        return nova;
    }
}
