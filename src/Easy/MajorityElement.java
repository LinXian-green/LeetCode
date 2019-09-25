package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
*
* 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
*  你可以假设数组是非空的，并且给定的数组总是存在众数。
* */
public class MajorityElement {
    public static void main(String[] args){
        int[] nums = {3,2,3,4,3,1,2,4,3,3,1,3,3,3};
        Arrays.sort(nums);
        System.out.println(nums[nums.length/2]);

        majorityElementByHash(nums);

    }
    public static int majorityElement(int[] nums) {
        if(nums.length<2)
            return -1;

        int ans = nums[0];
        int index=0;
        for(int i=1; i<=nums.length;i++){
            if(index>2/nums.length)
                break;
            if((ans^nums[i])==0)
                index++;

        }
        return nums[nums.length-index];

    }
    public static int majorityElementByHash(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxNum = 0, maxCount = 0;
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                maxNum = num;
            }
            if(maxCount>(nums.length/2))
                return maxNum;
        }
        return maxNum;

    }
}
