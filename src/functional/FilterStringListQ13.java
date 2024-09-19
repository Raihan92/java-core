package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringListQ13 {
    public static void main(String[] args) {
        List<String> sourceList = Arrays.asList("12345", "12346", "12347", "21345", "23156");
        List<String> targetList = Arrays.asList("12347", "12367", "23156");

        List<String> output = targetList.stream()
                .filter(sourceList::contains)
                .collect(Collectors.toList());

        System.out.println(output);
    }
}
