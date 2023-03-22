package cos0321;

class Solution2 {
	int[] func_a(int[] arr) {
		int[] counter = new int[1001];
		for (int i = 0; i < arr.length; i++) {
			counter[arr[i]]++;
		}
		return counter;
	}

	int func_b(int[] arr) {
		int ret = 0;
		for (int i = 0; i < arr.length; i++) {
			// 최댓값
			if (ret < arr[i]) {
				ret = arr[i];
			}
		}
		return ret;
	}

	int func_c(int[] arr) {
		final int INF = 1001;
		int ret = INF;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && ret > arr[i]) {
				ret = arr[i];
			}
		}
		return ret;
	}

	public int solutoin2(int[] arr) {
		int counter[] = func_a(arr);
		int maxCnt = func_b(counter);
		int minCnt = func_c(counter);
		return maxCnt / minCnt;
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr = { 1, 2, 3, 3, 1, 3, 3, 2, 3, 2 };
		int ret = sol.solutoin2(arr);

		System.out.println("Solution : return value of the method is " + ret + ".");
	}

}
