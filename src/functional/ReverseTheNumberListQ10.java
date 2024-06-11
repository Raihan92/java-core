package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheNumberListQ10 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,1,3,4,0,6,10,7,8,5,9));
        List<Integer> newNums = new ArrayList<>();
        nums.stream().collect(Collectors.collectingAndThen(Collectors.toList(),list-> {
                            Collections.reverse(list);return list.stream();
                        })).forEach(num -> newNums.add(num));
        System.out.println(newNums);
    }
}
