package cos0420;

import java.util.Arrays;

class Solution {
	public int solution(int[] scores) {
		int answer = 0;

		int min = 100;
		int max = 0;
		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i])
				max = scores[i];
			else if (min > scores[i])
				min = scores[i];
			sum = sum + scores[i];
		} // for

		sum = sum - (max + min);
		answer = sum / (scores.length - 2);

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] scores1 = { 35, 28, 98, 34, 20, 50, 85, 74, 71, 7 };
		int ret1 = sol.solution(scores1);

		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[] scores2 = { 1, 1, 1, 1, 1 };
		int ret2 = sol.solution(scores2);

		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

	}

}
