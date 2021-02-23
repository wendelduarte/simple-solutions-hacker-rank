package algorithms;

public class CountChars {

	public static void main(String[] args) {
		countSequenceChars("abccbaac");
	}
	
	public static void countSequenceChars(String chars) {
		String countedChars = "";
		char [] characteres = chars.toCharArray();
		int count = 0;
		for(int i = 0; i < characteres.length;) {
			char currentChar = characteres[i];
			for(int j =i; j < characteres.length; j++) {
				if(currentChar == characteres[j]) {
					count++;
					i++;
				} else {
					break;
				}
			}
			countedChars += "" + currentChar + count;
			count =0;
		}
		System.out.println(countedChars);
	}

}
