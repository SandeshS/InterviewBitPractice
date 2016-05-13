public class Solution {
	// DO NOT MODIFY THE LISTS
	public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    int aLen = a.size();
	    int bLen = b.size();
	    if(aLen == 0 || bLen == 0){
	        return null;
	    }
	    int i = 0, j = 0;
	    while(i < aLen && j < bLen){
	        if(a.get(i).equals(b.get(j))){
	            result.add(a.get(i));
	            i += 1;
	            j += 1;
	        } else if(a.get(i) < b.get(j)){
	            i += 1;
	        } else {
	            j += 1;
	        }
	    }
	    return result;
	}
}
