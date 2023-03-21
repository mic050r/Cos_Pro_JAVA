package cos0314;

import java.util.Arrays;

class Solution {
	public int[] solution(String[] shirtSize) { // 매개변수 타입 잘보기(빈칸), 리턴값 타입 보기
		// write code here
		int[] answer = new int[6];
		// 비교해서 해당하는 것을 증가
		for (int i = 0; i < shirtSize.length; ++i) {
			if (shirtSize[i].equals("XS")) {
				answer[0]++;
			} else if (shirtSize[i].equals("S")) {
				answer[1]++;
			} else if (shirtSize[i].equals("M")) {
				answer[2]++;
			} else if (shirtSize[i].equals("L")) {
				answer[3]++;
			} else if (shirtSize[i].equals("XL")) {
				answer[4]++;
			} else if (shirtSize[i].equals("XXL")) {
				answer[5]++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] shirtSize = { "XS", "S", "L", "L", "XL", "S" };
		int[] ret = sol.solution(shirtSize); // 함수호출
		// Press RUn button to receive output.
		System.out.println("Solution: return value of the method is" + Arrays.toString(ret) + ".");

	}


}
