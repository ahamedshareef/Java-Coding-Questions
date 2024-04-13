package ServiceNowOA;

public class CharCount {
//input is abaacaa op is aba2ca2 give java program for the same
	
	public static void main(String[] args) {
        String input = "abaacaa";
        System.out.println(getCharacterCount(input));
    }
	
	 public static String getCharacterCount(String input) {
	        StringBuilder output = new StringBuilder();
	        int count = 1;

	        for (int i = 0; i < input.length(); i++) {
	            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
	                count++;
	            } else {
	                output.append(input.charAt(i));
	                if (count > 1) {
	                    output.append(count);
	                }
	                count = 1;
	            }
	        }

	        return output.toString();
	    }

}
