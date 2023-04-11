package cos0411;

public class Solution {
	public int solution(int number) {
		int count = 0;
		// 0으로 하면 무한루프가 돌음
		while (number > 0) {
			int n = number % 10; // 맨끝 "일의자리" 취함
			if (n == 2 || n == 3 || n == 5 || n == 7) {
				count += 1;
			}
			number /= 10; // 10의 단위로 올라감
		}
		return count;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int number = 29022531;
		int ret = sol.solution(number);

		System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
	}

}
