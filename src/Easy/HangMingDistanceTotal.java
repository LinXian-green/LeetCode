package Easy;

public class HangMingDistanceTotal {
    public static void main(String[] args){
        int[] nums = {4,16,2};
    }


    public static int totalHammingDistance(int[] nums) {
        int totalDistanace = 0;
        String binaryValue="";
        int length = nums.length-1;
        for(int i =0; i<length; i++){
            for(int j=i+1;j<=length;j++){
                binaryValue += Integer.toBinaryString(nums[j]^nums[i]);
            }
        }
        return binaryValue.replaceAll("0","").length();
    }
}
