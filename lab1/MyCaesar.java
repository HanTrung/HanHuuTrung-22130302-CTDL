package tuan1;

public class MyCaesar {

	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private int n;

	public MyCaesar(int shiftSteps) {
		this.n = shiftSteps;
	}

	public char encryptChar(char c) {
		if (Character.isLetter(c)) {
			char base = Character.isLowerCase(c) ? 'a' : 'A';
			int num = (c - base + n) % 26;
			if (num < 0) {
				num *= -1;
			}
			return ALPHABET[num];
		} else {
			return c;
		}
	}

	public String encrypt(String input) {
		StringBuilder result = new StringBuilder();
		for (char c : input.toCharArray()) {
			result.append(encryptChar(c));
		}
		return result.toString();
	}

	public char decryptChar(char c) {
		if (Character.isLetter(c)) {
			char base = Character.isLowerCase(c) ? 'a' : 'A';
			int num = (c - base - n) % 26;
			if (num < 0) {
				num *=-1;
			}
			return ALPHABET[num];
		} else {
			return c;
		}
	}

	public String decrypt(String input) {
		StringBuilder result = new StringBuilder();
		for (char c : input.toCharArray()) {
			result.append(decryptChar(c));
		}
		return result.toString();
		
	}

	public static void main(String[] args) {
		String ch = "HAN TRUNG";
		MyCaesar test1 = new MyCaesar(3);
		System.out.println(test1.encrypt(ch));
		
		String ch1 = "GZM SQTMF";
		MyCaesar test2 = new MyCaesar(3);
		System.out.println(test2.decrypt(ch1));
	}

}
