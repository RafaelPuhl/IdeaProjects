package POO.FuncoesLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

public class AppRevision {

    public static List<String> alteraLista(List<Integer> list, intToString op){
        List<String> newList = new ArrayList<String>(list.size());
        for (Integer number:list) {
            newList.add(op.convert(number));
        }
        return newList;
    }

    public static List<Integer> createList(List<Integer> list, BiFunction<Integer, Integer, Integer> op){
        List<Integer> newList = new ArrayList<Integer>(list.size());
        Iterator<Integer> iter = list.iterator();
        int v1 = iter.next();
        while (iter.hasNext()){
            int v2 = iter.next();
            newList.add(op.apply(v1, v2));
            v1 = v2;
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, -7);
        List<String> newList = alteraLista(list, valor -> "R$" + valor);
        System.out.println(newList);
        newList = alteraLista(list, x -> x < 0 ? x + "D" : x + "C");
        System.out.println(newList);

        List<Integer> newNewList = createList(list, (v1, v2) -> v1+v2);
        System.out.println(newNewList);
    }
}
