package cos0314;

import java.util.Arrays;

class PopularityVote {
	public int[] PopularityVote(String[] idol) {
		int answer[] = new int[5]; // 10명이 5명에게 투표
		String name[] = { "연준", "수빈", "태현", "범규", "휴닝카이" };
		for (int i = 0; i < idol.length; ++i) {
			if (idol[i].equals(name[0])) {
				answer[0]++;
			} else if (idol[i].equals(name[1])) {
				answer[1]++;
			} else if (idol[i].equals(name[2])) {
				answer[2]++;
			} else if (idol[i].equals(name[3])) {
				answer[3]++;
			} else if (idol[i].equals(name[4])) {
				answer[4]++;
			}
		}

		int max = answer[0];
		for (int i = 1; i < answer.length; i++) {
			if (max < answer[i]) {
				max = answer[i];
			}

		}
		for (int i = 0; i < name.length; i++) {
			if (answer[i] == max) {
				System.out.println("투표 1등 : " + name[i]);
			}
		}
		
		return answer;

	}

	public static void main(String args[]) {
		PopularityVote vo = new PopularityVote();
		String[] idol = { "범규", "연준", "연준", "연준", "연준", "수빈", "태현", "휴닝카이", "수빈", "연준" };
		int ret[] = vo.PopularityVote(idol);
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + ".");
	}
}
