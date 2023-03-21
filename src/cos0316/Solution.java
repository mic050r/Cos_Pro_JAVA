package cos0316;

import java.util.Arrays;

class Solution {
	public int solution2(int price, String grade) { // 변수 선언 타입 return과 타입이 같아야함
		// Write code here
		int answer = 0;
		if (grade.equals("S")) {
			answer = (int) (price * 0.95); // 0.95가 double이라서 형변환을 해줘야함
		} else if (grade.equals("G")) {
			answer = (int) (price * 0.9);
		} else if (grade.equals("V")) {
			answer = (int) (price * 0.85);
		}
		return answer;
	}

	public static void main(String args[]) {
		Solution sol = new Solution();
		// 변수 선언 타입 잘 보기
		int price1 = 2500; 
		String grade1 = new String("V");
		int ret1 = sol.solution2(price1, grade1);
		// Press RUn button to receive output.
		System.out.println("Solution: return value of the method is " + (ret1) + ".");

		int price2 = 96900;
		String grade2 = new String("S");
		int ret2 = sol.solution2(price2, grade2);
		// Press RUn button to receive output.
		System.out.println("Solution: return value of the method is " + (ret2) + ".");
	}

}
