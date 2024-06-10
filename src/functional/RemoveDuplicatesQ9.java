package functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesQ9 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        nums = Arrays.stream(nums).distinct().toArray();
        for(int i=0; i<nums.length; i++) {
            if(i!=0) System.out.print(",");
            System.out.print(nums[i]);
        }
    }
}
