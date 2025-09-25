import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(5, 100, 400, 2, 0));
        System.out.println(selectionSort(lista));
    }

    public static List<Integer> selectionSort (List<Integer> l){

        for (int i = 0; i < l.size() - 1; i++){
            int minimo = i;
            for (int j = i + 1; j < l.size(); j++){
                if (l.get(j) < l.get(minimo)){
                    minimo = j;
                }
            }
            int guada = l.get(i);
            l.set(i, l.get(minimo));
            l.set(minimo, guada);
        } return l;
    }
}
