package cos0405;

import java.util.*;

public class Solution {
	public int solution(int N, int M) {
		int total = 0;
		for (int i = N; i <= M; i++) {
			if (i % 2 == 0) {
				// 함수: Math.power(double, double)
				// 첫번째인자는 밑수이고, 두번째 인자는 지수입니다.
				total += Math.pow(i, 2);
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int N = 4;
		int M = 7;
		int ret = sol.solution(N, M);
		System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
	}

}
