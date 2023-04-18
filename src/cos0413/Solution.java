package cos0413;

import java.util.*;

class Solution {

	public int[] solution(int[] scores) {
		int rank[] = new int[scores.length];
		int cnt = scores.length;
		// rank[]에 scores[]값 넣기
		for (int i = 0; i < scores.length; i++) {
			rank[i] = scores[i];
		}
		// rank 오름차순
		Arrays.sort(rank);
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (rank[i] != scores[j]) {
					cnt--;
				}

			}
			rank[i] = cnt;
			cnt = 0;
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