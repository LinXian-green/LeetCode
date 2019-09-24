package Easy;

public class MoveZero {
    public void moveZero1(int[] nums){
        if(nums.length==1) return ;
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0&&i!=j){
                nums[j]=nums[i];
                nums[i]=0;
                j++;
            }else if(nums[i]!=0)
            {j++;}
        }


    }

    public void moveZeroes(int[] nums) {
        int noZero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[noZero] = nums[i];
                noZero++;
            }
        }

        for(int i=noZero; i<nums.length; i++){
            nums[i] =0;
        }

    }

}
