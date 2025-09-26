import java.util.ArrayList;
import java.util.List;


public class MergeSort {
    public static void main(String[] args) {
        List <Integer> lista = new ArrayList<>(List.of(5, 100, 400, 2, 0));
        System.out.println("Lista antes de ordenar: " + lista);
        System.out.println("Lista depois de ordenar: " + mergeSort(lista));
    }
    public static List<Integer> mergeSort(List <Integer> lista){
        if (lista.size() == 1){
            return lista;
        }
        List<Integer> l1 = new ArrayList<>(lista.subList(0, lista.size() / 2));
        List<Integer> l2 = new ArrayList<>(lista.subList(lista.size() / 2, lista.size()));


        l1 = mergeSort(l1);
        l2 = mergeSort(l2);


        return mesclar(l1, l2);
    }
    public static List<Integer> mesclar(List<Integer> lista1, List<Integer> lista2){
        List<Integer> lista3 = new ArrayList<>();


        while (!lista1.isEmpty() && !lista2.isEmpty()){
            if (lista1.get(0) > lista2.get(0)){
                lista3.add(lista2.get(0));
                lista2.remove(0);
            }
            else{
                lista3.add(lista1.get(0));
                lista1.remove(0);
            }
        }
        while (!lista1.isEmpty()){
            lista3.add(lista1.get(0));
            lista1.remove(0);
        }
        while (!lista2.isEmpty()){
            lista3.add(lista2.get(0));
            lista2.remove(0);
        }
        return lista3;
    }
}
