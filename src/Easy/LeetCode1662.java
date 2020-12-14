import java.util.Arrays;
import java.util.List;

public class LeetCode1662 {

	    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	    		
	    		StringBuffer sb1 = new StringBuffer();
	    		StringBuffer sb2 = new StringBuffer();
/*	    		StringBuilder sb1 = new StringBuilder();
	    		StringBuilder sb2 = new StringBuilder();*/
	    		
	    		for(String word : word1)
	    			sb1.append(word);
	    		
	    		for(String word : word2)
	    			sb2.append(word);
	    		
	    		return sb1.toString().equals(sb2.toString());
	    		
	    }
}
