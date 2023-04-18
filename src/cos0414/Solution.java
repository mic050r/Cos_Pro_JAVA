package cos0414;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] scores) {
		int len = scores.length;
		int rank[] = new int[len];
		// 등수배열이 모두 1로 초기화
		for (int i = 0; i < len; i++) {
			rank[i] = 1;
		}
		// scores[i] 점수의 등수를 rank[i]에 정해서 저장
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (scores[i] < scores[j]) {
					rank[i]++;
				}
			}
		}
		return rank;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] scores = { 20, 60, 98, 59 };
		int[] ret = sol.solution(scores);
		System.out.println("점수" + Arrays.toString(scores));
		System.out.println("석차" + Arrays.toString(ret));

	}

}
