public class Solution {
	public String convert(String a, int b) {
		// Handle the edge case when string is empty
	    if(a.length() == 0){
	        return "";
	    }
	    // edge case when no processing needed 
	    if(b == 1){
	        return a;
	    }
	    Map<Integer, StringBuffer> hm = new HashMap<Integer, StringBuffer>();
	    boolean neg = false; // decide whether to increment num or decrement
	    int num = 0; // the variable which decides which map entry maps where
	    for(int i = 0; i<a.length(); i++){
	        if(neg){
	            num -=1;
	        } else {
	            num += 1;
	        }
	        if(num > b){
	            num = b-1; // decrementing
	            neg = true;
	        } else if(num == 0){
	            num = 2;// need to increment again
	            neg = false;
	        }
	        if(hm.containsKey(num)){ // if key entry already present
	            StringBuffer cur = hm.get(num);
	            cur.append(a.charAt(i));
	            hm.put(num, cur);
	        } else { // if creating new key entry for it
	            StringBuffer nEntry = new StringBuffer();
	            nEntry.append(a.charAt(i));
	            hm.put(num, nEntry);
	        }
	    }
	    StringBuffer res = new StringBuffer(); // final result
	    for(Integer i: hm.keySet()){
	        res.append(hm.get(i));
	    }
	    return res.toString();
	}
}
