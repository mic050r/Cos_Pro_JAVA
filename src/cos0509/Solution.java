package cos0509;

import java.util.Arrays;

public class Solution {
	public int solution(int scores[]) {
		int answer = 0;
		int max = 0; // 최대값을 구할 때는 초기값으로 최소의 값
		int min = 100; // 최소값을 구할 때는 초기값으로 최대의 값(100,999...)
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			// 최댓값 구하기
			if (max < scores[i])
				max = scores[i];
			// 최솟값 구하기
			if (min > scores[i])
				min = scores[i];

			// 누적하기
			sum += scores[i];
		}
		answer = (sum - (min + max)) / (scores.length - 2);
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] scores1 = { 35, 28, 98, 34, 20, 50, 85, 74, 71, 7 };
		int[] scores2 = { 1, 1, 1, 1 };
		int ret = sol.solution(scores1);
		int ret2 = sol.solution(scores2);
		System.out.println(ret);
		System.out.println(ret2);
		System.out.println();
	}

}
