package cos0510;

class Solution {
	public int solution(int[] memberAge, String transportation) {
		int adultExpense = 0;
		int childExpense = 0;

		// 교통편 3가지로 나누어, 경우에 따라 요금을 받음
		if (transportation.equals("Bus")) {
			adultExpense = 40000;
			childExpense = 15000;
		} else if (transportation.equals("Ship")) {
			adultExpense = 30000;
			childExpense = 13000;
		} else if (transportation.equals("Airplane")) {
			adultExpense = 70000;
			childExpense = 45000;
		}

		// 여행객이 10명 이상인 경우 연령에 따라 할인 받음
		if (memberAge.length >= 10) {
			adultExpense = adultExpense / 10 * 9;
			childExpense = childExpense / 10 * 8;
		}

		int totalExpenses = 0;
		for (int i = 0; i < memberAge.length; i++) {
			if (memberAge[i] > 19)
				totalExpenses += adultExpense;
			else
				totalExpenses += childExpense;
		}

		return totalExpenses;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] memberAge1 = { 13, 33, 45, 11, 20 };
		String transportation1 = "Bus";
		int ret1 = sol.solution(memberAge1, transportation1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[] memberAge2 = { 25, 11, 27, 56, 7, 19, 52, 31, 77, 8 };
		String transportation2 = "Ship";
		int ret2 = sol.solution(memberAge2, transportation2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}