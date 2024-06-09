package functional;

import java.util.*;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        new CalculateByNumbers(nums).EvenSum();
        new CalculateByNumbers(nums).OddSum();
        new CalculateByNumbers(nums).SquareSum();
        new CalculateByNumbers(nums).TotalSumUsingReduce();
        new CalculateByNumbers(nums).FindMax();
        new CalculateByNumbers(nums).FindMin();

        int[] array = {2, 1, 4, 3, 5};
        new CalculateByNumbers(array).SumUpIntNumbers();

        double[] doubleArray = {3.5,1.2,5.4,2.5};
        new CalculateByNumbers(doubleArray).SumUpDoubleNumbers();

        List<String> stringList = new ArrayList<>(Arrays.asList("Charlie","Alice","Bob","Jhon Doe","Ryan"));
        new StringOperations(stringList).CommaSeparatedStringPrint();
        new StringOperations(stringList).Sort();
    }
}