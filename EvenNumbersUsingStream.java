import java.util.ArrayList;

public class EvenNumbersUsingStream {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(22);
        arr.add(12);
        arr.add(23);
        arr.add(69);
        arr.add(87);
        arr.add(44);

        arr.stream().filter(n->n%2==0).forEach(System.out::println);
    }
    
}
