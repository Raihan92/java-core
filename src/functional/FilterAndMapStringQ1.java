package functional;

import java.util.*;
import java.util.stream.*;

public class FilterAndMapStringQ1 {
    public static void main(String[] args) {
        /*
        Question: Given a list of strings, filter out the strings that are greater than 4 characters,
        convert the remaining strings to uppercase, and collect them into a new list.
         */
        List<String> stringList = new ArrayList<>(Arrays.asList("Charlie","Alice","Bob","Jhon Doe","Ryan"));
        List<String> result = stringList.stream()
                .filter(str -> str.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        CommaSeparatedStringPrint(result);
    }

    public static void CommaSeparatedStringPrint(List<String> stringList) {
        System.out.println(stringList.stream().collect(Collectors.joining(",")));
    }
}
