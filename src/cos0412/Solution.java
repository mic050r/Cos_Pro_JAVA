package cos0412;

import java.util.Arrays;

public class Solution {
	int func_a(int[] scores, int score) { // 등수리턴
		int length = scores.length;
		;
		for (int rank = 0; rank < length; rank++) {
			if (scores[rank] == score)
				return rank + 1;

		}
		return 0;
	}

	void func_b(int arr[]) {
		Arrays.sort(arr);
		int length = arr.length;
		int temp = 0;
		for (int i = 0; i < length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[(length - 1) - i];
			arr[(length - 1) - i] = temp;
		}
	}

	int func_c(int arr[], int n) {
		return arr[n];
	}

	public int solution(int scores[], int n) {
		int score = func_c(scores, n);
		func_b(scores);
		int answer = func_a(scores, score);
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int scores[] = { 20, 60, 98, 59 };
		int n = 3;
		int ret = sol.solution(scores, n);
		System.out.println("solution메소드의 반환 값은 " + ret + " 입니다.");
	}

}
