package cos0406;

import java.util.*;

public class Solution {
	public int solution(int attack, int recovery, int hp) {
		int count = 0;
		while (true) {
			count += 1;
			hp -= attack;
			if (hp <= 0)
				break;
			hp += recovery;
		}
		return count;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int attack = 30;
		int recovery = 10;
		int hp = 60;
		int ret = sol.solution(attack, recovery, hp);

		System.out.println("soultion 메소드의 반환 값은 " + ret + "입니다.");
	}

}
