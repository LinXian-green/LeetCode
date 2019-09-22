package Easy;

public class HangMingDistance {
    /*
    * 要点:    1.异或运算
    *          2.int转二进制：Integer.toBinaryString()
    * */
    public  int hammingDistance(int x, int y) {
        return Integer.toBinaryString(x^y).replaceAll("0","").length();
    }
}
