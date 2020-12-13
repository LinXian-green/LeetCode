public class LeetCode1672 {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for(int i=0; i<accounts.length; i++){
            int[] temp = accounts[i];
            int sum = 0;
            for(int j=0; j<temp.length;j++){
                sum+=temp[j];
            }
            if(result < sum)
                result = sum;
        }
        return result;
    }
}
