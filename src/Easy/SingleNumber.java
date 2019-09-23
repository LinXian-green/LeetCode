package Easy;

import java.util.Arrays;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args){

        int nums[] = {2,2,1,1,5,3,5};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;



    }
}
