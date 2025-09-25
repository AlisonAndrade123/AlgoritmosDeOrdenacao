import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(5, 100, 400, 2, 0));
        System.out.println(insertionSort(lista));
    }
    public static List <Integer> insertionSort(List <Integer> lista){
        for (int j = 1; j < lista.size(); j++) {
            int guarda = lista.get(j);
            int i = j - 1;
            while (i >= 0 && lista.get(i) > guarda) {
                lista.set(i + 1, lista.get(i));
                i = i - 1;
                }
            lista.set(i + 1, guarda);
            }
        return lista;
        }
    }

