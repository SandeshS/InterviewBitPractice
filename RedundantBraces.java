public class Solution {
	public int braces(String a) {
	    Stack<Character> opStack = new Stack<Character>();
	    char[] expChar = a.toCharArray();
	    for(char ch : expChar){
	        if(ch == '+' || ch == '-' || ch =='*' || ch == '/' || ch == '('){
	            opStack.push(ch);
	        } else if(ch == ')'){
	            if(opStack.isEmpty() || opStack.peek() == '('){
	                return 1;
	            }
	            while(opStack.peek()!='('){
	                opStack.pop();
	            }
	            opStack.pop();
	        }
	    }
	    return 0;
	}
}