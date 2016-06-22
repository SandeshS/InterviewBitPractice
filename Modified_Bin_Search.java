public class Solution {
    public int binSearchHelper(ArrayList<Integer> a, int b, int low, int high){
        //return position of index based on low and high
        if(low > high){
            return low;
        } else if(low == high && a.get(low) < b){
            return low + 1;
        } else if(low == high && a.get(low) > b){
            return low;
        }
        int mid = (low + high)/2;
        if(a.get(mid) == b){
            return mid; // in case element actually is present in the arraylist
        } else if (a.get(mid) < b){
            return binSearchHelper(a, b, mid+1, high);
        }  else {
            return binSearchHelper(a, b, low, mid-1);
        }
        //return -1;
    }
	public int searchInsert(ArrayList<Integer> a, int b) {
	    int high = a.size()-1;
	    int low = 0;
	    if(a.size() == 0){
	        return -1;
	    }
	    return(binSearchHelper(a, b, low, high));
	    
	}
}
