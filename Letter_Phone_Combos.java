public class Solution {
    public static void getCombinations(String[] options, String soFar, int numKeys, 
                                        int index, ArrayList<String> result){
        if(soFar.length() == numKeys){
            result.add(soFar);
        } else {
            for(int i = index; i<options.length; i++){
                for(int j = 0; j<options[i].length(); j++){
                    getCombinations(options, soFar + options[i].charAt(j), numKeys, i+1, result);
                }
            }
        }
    }
    
	public ArrayList<String> letterCombinations(String a) {
	    if(a.length() == 0){
	        return null;
	    }
	    Map<Character, String> mapping = new HashMap<Character, String>();
	    mapping.put('2', "abc");
	    mapping.put('3', "def");
	    mapping.put('4', "ghi");
	    mapping.put('5', "jkl");
	    mapping.put('6', "mno");
	    mapping.put('7', "pqrs");
	    mapping.put('8', "tuv");
	    mapping.put('9', "wxyz");
	    // 0 and 1 map to 0 and 1
	    mapping.put('0', "0");
	    mapping.put('1', "1");
	    int numDigits = a.length();
	    String[] keyAlphas = new String[numDigits];
	    for(int i = 0; i<a.length(); i++){
	        keyAlphas[i] = mapping.get(a.charAt(i));
	    }
	    ArrayList<String> result = new ArrayList<String>();
	    getCombinations(keyAlphas, "", numDigits, 0, result);
	    return result;
	}
}