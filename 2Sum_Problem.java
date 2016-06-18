public class Solution {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
	    int size = a.size();
	    if(size == 0){
	        return null;
	    }
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	    for(int i = 0; i < a.size(); i++){
	        int num = a.get(i);
	        int index = i+1;
	        if(hm.containsKey(b - num)){
	            result.add(hm.get(b-num));
	            result.add(index);
	            break;
	        } else {
	            if(!hm.containsKey(num)){
	                hm.put(num, index);
	            }
	        }
	    }
	    return result;
	}
}
