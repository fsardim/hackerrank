package unbalancedBrackets;

class Result {

    public static String isBalanced(String s) {
    	
    	if(s.length() % 2 != 0) {
    		return "NO";
    	}

    	int length, newLength;
    	while (s.length() > 0) {
    		
    		length = s.length();
    		
    		s = s.replace("{}", "");
    		s = s.replace("[]", "");
    		s = s.replace("()", "");
    		
    		newLength = s.length();
    		
    		if (newLength == length) {
    			return "NO";
    		}
    		
    	}
    	return "YES";
    }
    
}


