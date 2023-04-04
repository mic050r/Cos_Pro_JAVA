package cos0404;

import java.util.Iterator;

class Solution2 {
	// 5의 배수의 개수를 구하는 함수 func_a
	public int func_a(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				count += 1;
			}
		}
		return count;
	}

	// 5의 배수의 개수와 3의 배수의 개수 중 누가 더 많은지 구하는 함수 func_b
	public String func_b(int three, int five) {
		if (three > five)
			return "three";
		else if (three < five)
			return "five";
		else
			return "same";
	}

	// 3의 배수의 개수를 구하는 함수 func_c
	public int func_c(int arr[]) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				count += 1;
			}
		}
		return count;
	}

	public String solution2(int[] arr) {
		int countThree = func_c(arr);
		int countFive = func_a(arr);
		String answer = func_b(countThree, countFive);
		return answer;
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr = { 2, 3, 6, 9, 12, 15, 10, 20, 22, 25 };
		String ret = sol.solution2(arr);

		System.out.println(ret);
	}

}
