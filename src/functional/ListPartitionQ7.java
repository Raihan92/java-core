package functional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListPartitionQ7 {
    public static void main(String[] args) {
        /*
        Question: Given a list of integers, partition the list into two sub-lists:
        one containing even numbers and the other containing odd numbers.
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> partitionedNums = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> evens = partitionedNums.get(true);
        List<Integer> odds = partitionedNums.get(false);

        System.out.println("Even numbers = " + evens);
        System.out.println("Odd numbers = " + odds);
    }
}
