package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatteningListOfListsQ5 {
    public static void main(String[] args) {
        /*
        Question: Given a list of lists of integers, flatten it into a single list of integers using streams.
         */
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> list = listOfLists.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
