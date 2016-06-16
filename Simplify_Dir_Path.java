public class Solution {
    public String createPath(Stack<String> s){
        if(s.isEmpty()){
            return "";
        } else {
            String temp = s.pop();
            return createPath(s) + "/" + temp;
        }
    }
	public String simplifyPath(String a) {
	    // Base case when the string is empty
	    if(a.length() == 0){
	        return "";
	    }
	    Stack<String> st = new Stack<String>();
	    for(int i = 0; i < a.length(); i++){
	        StringBuffer sb = new StringBuffer();
	        //Read the input till the character is not a change of directory
	        while(i<a.length() && a.charAt(i) !='/'){
	            sb.append(a.charAt(i));
	            i++;
	        }
	        // if the current length of dirname is 0 or if sb is ".", we don't need to do anything
	        if(sb.length() == 0 || sb.toString().equals(".")) {
	            continue;
	        } else if(sb.toString().equals("..")){ // pop the top of stack if ".." is encountered
	            if(!st.isEmpty()){
	                st.pop();
	            }
	        } else {
	            st.push(sb.toString()); // pushes the path in sb
	        }
	    }
	    if(st.isEmpty()){
	        return "/";
	    }
	    StringBuffer res = new StringBuffer();
	    while(!st.isEmpty()){
	        res.insert(0, "/" + st.pop()); // unique way to  concatenate strings. New for me!
	    }
	    return res.toString();
	}
}
