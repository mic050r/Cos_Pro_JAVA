package cos0601;

public class Solution {
	public int solution(int[] scores, int cutline) {
		int answer = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= cutline) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] scores = { 80, 90, 55, 60, 59 };
		int cutline = 60;
		int ret = sol.solution(scores, cutline);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}