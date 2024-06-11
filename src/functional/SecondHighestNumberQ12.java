package functional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SecondHighestNumberQ12 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,0,6,10,7,8,5,9,11};
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        System.out.println("Second highest number = " + sortedNums[nums.length-2]);
    }
}
