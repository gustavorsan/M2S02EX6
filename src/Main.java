import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> newList = new ArrayList<Integer>();

        for(int num : lista){
            newList.add(num*3);
        }

        System.out.println(newList.toString());
    }
}