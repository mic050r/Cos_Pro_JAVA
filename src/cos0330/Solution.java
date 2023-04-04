package cos0330;

class Solution {
	public String solution(String characters) {
		String result = "";
		result += characters.charAt(0);
		// 배열이면 .length 스트링이면 .length()
		// 배열은 0부터 시작이라서 characters 길이에 -1 해주기
		for (int i = 0; i < characters.length() - 1; i++) {
			if (characters.charAt(i) != characters.charAt(i + 1)) {
				result += characters.charAt(i + 1);
			}
		}
		return result;
	}

	public static void main(String args[]) {
		Solution sol = new Solution();
		String characters = "senteeeenccccceeee";
		String ret = sol.solution(characters);

		System.out.println("Solution : return value of the method is " + ret + ".");
	}
}
