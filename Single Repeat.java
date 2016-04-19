public class Solution {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    if(a.size() == 0){
	        return 0;
	    }
	    int result = 0;
	    for(int i = 0; i<a.size(); i++){
	        result ^= a.get(i);
	    }
	    return result;
	}
}