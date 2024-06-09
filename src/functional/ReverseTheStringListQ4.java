package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheStringListQ4 {
    public static void main(String[] args) {
        /*
        Write a program to reverse the array of string
         */
        List<String> stringList = Arrays.asList("Charlie","Alice","Bob","Jhon Doe","Ryan");
        stringList.stream().collect(Collectors.collectingAndThen(Collectors.toList(),list -> {
            Collections.reverse(list); return list.stream();
        })).forEach(string -> System.out.println(string));
    }
}
