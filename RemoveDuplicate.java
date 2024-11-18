import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(20);
        arr.add(40);
        arr.add(50);
        arr.add(40);

        // Remove duplicates using Stream API
        List<Integer> uniqueList = arr.stream()
                .distinct() // Removes duplicates
                .collect(Collectors.toList()); // Collects the result back into a list

        // Print the list without duplicates
        System.out.println("ArrayList without duplicates: " + uniqueList);

    }
}
