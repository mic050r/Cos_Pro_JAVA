package cos0517;

class Solution {
	public int solution(int[] arr) {
		int answer = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length; j++)
				if (arr[i] % 2 == 0 && arr[i] / 2 == arr[j]) {
					answer++;
					break;
				}
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만
	// 수정하세요.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = { 4, 8, 3, 6, 7 };
		int ret = sol.solution(arr);

		System.out.println(ret);

	}
}