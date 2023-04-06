package cos0406;

public class Solution2 {
	public int solution2(int[] floors) {
		int dist = 0;
		int length = floors.length;
		for (int i = 1; i < length; ++i) {
			if (floors[i - 1] > floors[i])
				dist += floors[i - 1] - floors[i];
			else
				dist += floors[i] - floors[i - 1];
			// dist += Math.abs(floors[i] - floors[i - 1]);
		}
		return dist;
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int floors[] = { 1, 2, 5, 4, 2 };
		int ret = sol.solution2(floors);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

}
