package cos0524;

/*=======================================================
 * 4차시 5번 : 4차 2급 5_initial_code.java
 =========================================================*/
import java.util.*;

class Solution2 {
    public int solution(int[] calorie) {
        int minCal = 9999;
        int answer = 0;
        for(int i=0; i<calorie.length; i++) {
            if(calorie[i] > minCal)
                answer += calorie[i] - minCal;
            else
                minCal = calorie[i];
        }
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] calorie = {713, 665, 873, 500, 751};
        int ret = sol.solution(calorie);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
