package cos0411;

public class Solution3 {
	public int solution(int purchase[]) {
		int total = 0;
		for (int i = 0; i < purchase.length; i++) {
			if (purchase[i] == 1000000) // 100만원 이상 구매
				total += 50000;
			else if (purchase[i] >= 600000)// 60만원 이상 구매
				total += 30000;
			else if (purchase[i] >= 400000)// 40만원 이상 구매
				total += 20000;
			else if (purchase[i] >= 200000)// 20만원 이상 구매
				total += 10000;
		}

		return total;
	}

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int purchase[] = { 150000, 210000, 399990, 990000, 1000000 };
		int ret = sol.solution(purchase);

		System.out.println("solutio 메소드의 반환값은 " + ret + " 입니다.");
	}

}
