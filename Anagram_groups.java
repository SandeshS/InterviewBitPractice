public class Solution {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
	    if(a == null){
	        return null;
	    }
	    Map<String, ArrayList<Integer>> anMap = new HashMap<String, ArrayList<Integer>>();
	    String newCurr = new String();
	    for(int i = 0; i<a.size(); i++){
	        String current = a.get(i);
	        if(current.length() > 1){
	            char[] s2arr = current.toCharArray();
	            Arrays.sort(s2arr);
	            newCurr = new String(s2arr);
	        } else {
	            newCurr = current;
	        }
	        if(anMap.containsKey(newCurr)){
	            // need to append the index;
	            ArrayList<Integer> curAnagrams = anMap.get(newCurr);
	            curAnagrams.add(i+1);
	            anMap.put(newCurr, curAnagrams);
	        } else {
	            ArrayList<Integer> firstAgram = new ArrayList<Integer>();
	            firstAgram.add(i+1);
	            anMap.put(newCurr, firstAgram);
	        }
	    }
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    for(String k : anMap.keySet()){
	        result.add(anMap.get(k));
	    }
	    return result;
	}
}
