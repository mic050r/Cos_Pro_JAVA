package cos0323;

class Solution2 {
	public int solution2(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			// 현재의 숫자
			int current = i;
			int temp = count;
			while (current != 0) {
				/*
				 * 논리곱 (&&, &) - 피연산자가 모두 true일 경우에만 연산 결과가 true 이다. 
				 * 논리합 (||,|) - 피연산자 중 하나만 true이면 연산 결과는 true 이다.
				 */
				if ((current % 10 == 3) || (current % 10 == 6) || (current % 10 == 9)) {
					count++;
					System.out.println("pair");
				}
				// 다시 10으로 나눈 몫 다시 올려주기
				current /= 10;
			}
			// 개수를 나타냄
			if (temp == count) {
				System.out.println(i);
			}
			System.out.println(" ");
		}
		System.out.println();

		return count;
	}

	public static void main(String args[]) {
		Solution2 sol2 = new Solution2();
		int number = 40;
		int ret = sol2.solution2(number);

		System.out.println("Solution : return value of the method is " + ret + ".");

	}
}
