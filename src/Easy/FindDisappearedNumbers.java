package Easy;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args){
        int[] nums = {4,5, 2, 7, 8, 2, 3, 1,1};
        List<Integer> list = findDisappearedNumbers(nums);
        for(int i:list){
            System.out.println(i);
        }

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int lastNum = 1;
        List<Integer> result = new ArrayList();
        for(int i=0;i<nums.length; i++){

            if(lastNum != nums[i]) {
                if (!result.contains(lastNum)) {
                    result.add(lastNum);
                }
                while(lastNum!=nums[i]+1){
                    if (!result.contains(lastNum)) {
                        result.add(lastNum);
                    }
                    lastNum++;
                }

            }else{

            if(i+1<nums.length) {
                if (nums[i + 1] != lastNum)
                    lastNum++;
            }

            }
        }

        return result;
        }

}
