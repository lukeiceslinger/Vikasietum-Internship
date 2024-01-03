import java.util.*;

public class SubInterface {

    public static void main(String[] args) {

        Set<Integer> intSet = new LinkedHashSet<>();
        intSet.add(10);
        intSet.add(20);
        intSet.add(50);
        intSet.add(40);

        List<Integer> intList = new ArrayList<>(intSet);

        for(int i = 0; i < intList.size(); i++){
            System.out.println("Position " + i + " Has value : " + intList.get(i));
        }
    }
}
