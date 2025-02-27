public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray() {
		int[] intArray = new int[5];

		for (int i = 0; i < 5; i++) {
			intArray[i] = i + 1;
		}
		return intArray;
	}

	public static String[] createArray(String word, String word2, String word3, String word4) {
		String[] stringArray = {word, word2, word3, word4};
		return stringArray;
	}

	public static int findValue(int num, int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String word, String[] stringArray) {
		int count = 0;

		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(word)) {
				count++;
				if (count == 3) {
					return i;
				}
			}
		}
		return -1;
	}
}
