package cos0329;

import java.util.*;

class Solution2 {
	boolean solution2(String sentence) {
		String str = "";
		for (int i = 0; i < sentence.length(); i++) {
			// String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
			char c = sentence.charAt(i); // 방에 있는 문자 하나
			// 먼저 공백과 .과 ,을 제거해야함
			if (c != ' ' && c != '.' && c != ',') {
				str += c;
			}
		}
		int len = str.length();
		// 총 14자리인데 7자리만 비교함...[0]과 [13]비교 [2]와 [12] 비교...
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i))
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		String sentence1 = "never odd or even";
		boolean ret1 = sol.solution2(sentence1);
		System.out.println("Solution : return value of the method is " + ret1 + ".");

		String sentence2 = "palindrome";
		boolean ret2 = sol.solution2(sentence2);
		System.out.println("Solution : return value of the method is " + ret2 + ".");

	}

}
