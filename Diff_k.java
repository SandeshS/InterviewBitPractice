public class Solution {
	public int diffPossible(ArrayList<Integer> a, int b) {
	    if(a == null || a.size() == 0){
	        return 0;
	    }
	    for(int i = a.size() - 1; i >= 0; i--){
	        for(int j = 0; j < i; j++){
	            if(a.get(i) - a.get(j) == b){
	                return 1;
	            } else if (a.get(i) - a.get(j) < b){
	                break;
	            }
	        }
	    }
	    return 0;
	}
}