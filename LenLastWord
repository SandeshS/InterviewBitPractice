public class Solution {
	public int lengthOfLastWord(final String a) {
	    int len = a.length();
	    if(a.length() == 0){
	        return 0;
	    }
	    while(len -1 >= 0 && a.charAt(len-1) == ' '){
	        len -= 1;
	    }
	    int currCount = 0;
	    for(int i = 0; i<len; i++){
	        currCount = 0;
	        while(i < len && a.charAt(i) != ' '){
	            currCount += 1;
	            i++;
	        }
	    }
	    return currCount;
	}
}