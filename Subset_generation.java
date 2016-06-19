public class Solution {
    public static void createSubsetofSize(ArrayList<Integer> soFar, ArrayList<Integer> a, int curSubSize, int curIndex, ArrayList<ArrayList<Integer>> result){
        if(soFar.size() == curSubSize){
        	ArrayList<Integer> localCopy = new ArrayList<Integer>();
        	for(Integer item: soFar){
        		localCopy.add(item);        		
        	}
        	result.add(localCopy);
        } else {
            for(int i = curIndex; i<a.size(); i++){
                soFar.add(a.get(i));
                createSubsetofSize(soFar, a, curSubSize, i + 1, result);
                soFar.remove(a.get(i));
            }
        }
        return;
    }
    
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    //ArrayList<Integer> subele = new ArrayList<Integer>();
	    //result.add(subele);
	    // Handle edge case
	    if(a.size() == 0){
	        return result; // There is always one subset even for an empty set which is itself
	    }
	    for(int i = 0; i<=a.size(); i++){
	        //create subsets of size i by picking different elements
	        ArrayList<Integer> recur = new ArrayList<Integer>();
	        createSubsetofSize(recur, a, i, 0, result);
	    }
	    Collections.sort(result, new Comparator<ArrayList<Integer>>() {
	        @Override
	        public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
	            int an = a.size();
	            int bn = b.size();
	            for (int i = 0; i < Math.min(an, bn); i++) {
	                int cmp = Integer.compare(a.get(i), b.get(i));
	                if (cmp != 0)
	                    return cmp;
	            }
	            return Integer.compare(a.size(), b.size());
	        }
	    });
	    return result;
	}
}
