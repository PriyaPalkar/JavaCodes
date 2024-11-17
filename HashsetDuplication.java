import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class HashsetDuplication {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(20);
        arr.add(40);

        // Remove duplicates using Stream API
        List<Integer> uniqueList = new ArrayList<>(new HashSet<>(arr));

        // Print the list without duplicates
        System.out.println("ArrayList without duplicates: " + uniqueList);

    }
}