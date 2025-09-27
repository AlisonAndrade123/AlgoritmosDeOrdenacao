import java.util.ArrayList;
import java.util.List;

public class MergeSort2 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(5, 100, 400, 2, 0, 38, 92));
        System.out.println("Lista antes de ordenar: " + lista);

        List<Integer> listaOrdenada = mergeSort(lista);

        System.out.println("Lista depois de ordenar: " + listaOrdenada);
    }

    public static List<Integer> mergeSort(List<Integer> lista) {
        if (lista.size() <= 1) {
            return lista;
        }

        int meio = lista.size() / 2;
        List<Integer> l1 = new ArrayList<>(lista.subList(0, meio));
        List<Integer> l2 = new ArrayList<>(lista.subList(meio, lista.size()));

        l1 = mergeSort(l1);
        l2 = mergeSort(l2);

        return mesclar(l1, l2);
    }


    public static List<Integer> mesclar(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaOrdenada = new ArrayList<>();

        int ponteiro1 = 0;
        int ponteiro2 = 0;

        while (ponteiro1 < lista1.size() && ponteiro2 < lista2.size()) {
            if (lista1.get(ponteiro1) < lista2.get(ponteiro2)) {
                listaOrdenada.add(lista1.get(ponteiro1));
                ponteiro1++;
            } else {
                listaOrdenada.add(lista2.get(ponteiro2));
                ponteiro2++;
            }
        }

        while (ponteiro1 < lista1.size()) {
            listaOrdenada.add(lista1.get(ponteiro1));
            ponteiro1++;
        }

        while (ponteiro2 < lista2.size()) {
            listaOrdenada.add(lista2.get(ponteiro2));
            ponteiro2++;
        }

        return listaOrdenada;
    }
}