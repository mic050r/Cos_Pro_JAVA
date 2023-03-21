package cos0321;

class Solution {
	public int func_a(int month, int day) {
		int monthList[] = { 0, 31, 28, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int total = 0;
		for (int i = 0; i < month; i++) {
			total += monthList[i];
		}
		total += day;
		// 경과된 날이 있기 때문에 -1를 해줘야 함
		return total - 1;
	}

	public int solution(int startMonth, int startDay, int endMonth, int endDay) {
		int startTotal = func_a(startMonth, startDay);
		int endTotal = func_a(endMonth, endDay);
		return endTotal - startTotal;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int startMonth = 3;
		int startDay = 21;
		int endMonth = 4;
		int endDay = 27;
		int ret = sol.solution(startMonth, startDay, endMonth, endDay);
		System.out.println("Solution : return value of the method is " + ret + ".");
	}

}
