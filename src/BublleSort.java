import java.util.ArrayList;
import java.util.List;

public class BublleSort {
    public static void main(String[] args) {
        List <Integer> lista = new ArrayList<>(List.of(5, 100, 400, 2, 0));
        System.out.println(bubbleSort(lista));
    }

    public static List <Integer> bubbleSort(List <Integer> l){

        for(int i = 0; i < l.size(); i++){
            for(int j = l.size() - 1; j > i; j--){
                if(l.get(j) < l.get(j-1)){
                    int guarda = l.get(j-1);
                    l.set(j-1, l.get(j));
                    l.set(j, guarda);
                }
            }
        } return l;
    }
}