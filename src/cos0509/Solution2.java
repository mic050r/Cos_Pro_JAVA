package cos0509;

public class Solution2 {
	public int solution2(String[] words, String word) {
		//
		int count = 0; // 오류 횟수 구하는 변수
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < word.length(); j++) {
				if (words[i].charAt(j) != word.charAt(j))
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		String words[] = { new String("CODE"), new String("COED"), new String("CDEO") };
		String word = new String("CODE");
		int ret = sol.solution2(words, word);
		System.out.println(ret);
	}

}
