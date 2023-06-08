package cos0531;

/*=======================================================
 * 4차시 9번 : 4차 2급 9_initial_code.java
 =========================================================*/
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
	public int solution(int[][] height) {
		// 여기에 코드를 작성해주세요.
		int count = 0;
		int[] dy = { -1, 1, 0, 0 };
		int[] dx = { 0, 0, -1, 1 };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				boolean isDanger = true;
				for (int k = 0; k < 4; k++) {
					if (i + dy[k] >= 0 && i + dy[k] < 4 && j + dx[k] >= 0 && j + dx[k] < 4) {
						if (height[i][j] >= height[i + dy[k]][j + dx[k]]) {
							isDanger = false;
						}
					}
				}
				if (isDanger)
					count++;
			}
		}

		return count;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] height = { { 3, 6, 2, 8 }, { 7, 3, 4, 2 }, { 8, 6, 7, 3 }, { 5, 3, 2, 9 } };
		int ret = sol.solution(height);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
