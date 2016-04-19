public class Solution {
    
    public int distance(int a, int b, int c, int d){
        return Math.max(Math.abs(c-a), Math.abs(d-b));
    }
    
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int length = X.size();
        // starting and ending points need to be noted.
        int minSteps = 0;
        for(int i = 0; i<length-1; i++){
            minSteps += distance(X.get(i), Y.get(i), X.get(i+1), Y.get(i+1));
        }
        return minSteps;
    }
}