package javaProg_Searching;

public class SearchingInString {

	public static void main(String[] args) {
		String name = "Pawan";
		char target = 'w';
		boolean ans = searchInChar(name, target);
		System.out.print(ans);

	}

	public static boolean searchInChar(String n, char target) {
		if (n.length() == 0) {
			System.out.print("String is empty so returning ");
			return false;
		}

		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == target) {
				System.out.print("Character found in the string so returning ");
				return true;
			}
		}
		System.out.print("Character NOT found in the string so returning ");
		return false;
	}

}
