package functional;

import java.util.*;

public class CalculateByNumbers<T> {

    private List<Integer> nums;
    private int[] intArray;
    private double[] doubleArray;

    public CalculateByNumbers(List<Integer> nums) {
        this.nums = nums;
    }

    public CalculateByNumbers(int[] intArray) {
        this.intArray = intArray;
    }

    public CalculateByNumbers(double[] doubleArray) {
        this.doubleArray = doubleArray;
    }

    public void EvenSum() {
        int sum = nums.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        System.out.println("Even Sum: " + sum);
    }

    public void OddSum() {
        int sum = nums.stream().filter(n -> n % 2 != 0).mapToInt(n -> n).sum();
        System.out.println("Odd Sum: " + sum);
    }

    public void SquareSum() {
        int sum = nums.stream().mapToInt(n -> n * n).sum();
        System.out.println("Square Sum: " + sum);
    }

    public void TotalSumUsingReduce() {
        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Reduce Sum: " + sum);
    }

    public void SumUpIntNumbers() {
        int sum = Arrays.stream(intArray).sum();
        System.out.println("Array of integer sum: " + sum);
    }

    public void SumUpDoubleNumbers() {
        double sum = Arrays.stream(doubleArray).sum();
        System.out.println("Array of double sum: " + sum);
    }

    public void FindMax() {
        Integer max = nums.stream().max(Integer::compareTo).get();
        System.out.println("Max number: " + max);
    }

    public void FindMin() {
        Integer min = nums.stream().min(Integer::compareTo).get();
        System.out.println("Min number: " + min);
    }
}
