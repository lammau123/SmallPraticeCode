package small.code.pratice.array;

/**
 * Valid Parenthesis String
 * 
 *  Given a string containing only three types of characters: '(', ')' 
 *  and '*', write a function to check whether this string is valid. 
 *  We define the validity of a string by these rules:
 *  
 *  Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 *  Any right parenthesis ')' must have a corresponding left parenthesis '('
 *  Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 *  '*' could be treated as a single right parenthesis ')' or a single left
 *   parenthesis '(' or an empty string.
 *  An empty string is also valid.
 *  
 *  Example 1:
 *  
 *  Input: "()"
 *  Output: True
 *  
 *  Example 2:
 *  
 *  Input: "(*)"
 *  Output: True
 *  
 *  Example 3:
 *  
 *  Input: "(*))"
 *  Output: True
 *  
 *  Note:
 *  The string size will be in the range [1, 100].
 *
 */
public class CheckValidString {
	private int checkValidString(String s, int start, int count) {
		if(count < 0) {
			return -1;
		}
		
		if(start >= s.length()) {
			return count;
		}
		
		if(s.charAt(start) == '(') {
			return checkValidString(s, start+1, count+1);
		}
		
		if(s.charAt(start) == ')') {
			return checkValidString(s, start+1, count-1);
		}
		
		return checkValidString(s, start + 1, count) == 0 ? 0 : 
					checkValidString(s, start + 1, count + 1) == 0 ? 0 :
						checkValidString(s, start + 1, count - 1);
	}
	
	public boolean checkValidString(String s) {
        return checkValidString(s, 0, 0) == 0;
    }
}
