package own_collections;

import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<Integer> numbers = new MyList<>();
        numbers.add(5);
        numbers.add(-1);
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);

        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
