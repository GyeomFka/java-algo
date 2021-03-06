package _02;

import java.util.Scanner;

/**
 * 11. 임시반장
 * - 본질인 학생 수 찾기 이므로 2학년 같은반 -> 3학년 같은반 -> 중복처리 카운트 1
 * - 2이상 중첩의 반복문에서 어느 고정값을 잡을지에 대한 충분한 고려도 필요하다.
 */
public class _11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int studentCnt = scan.nextInt();

		int[][] tempClassLeader = new int[studentCnt][5];

		for (int i = 0; i < studentCnt; i++) {
			for (int j = 0; j < 5; j++) {
				tempClassLeader[i][j] = scan.nextInt();
			}
		}


		int[] score = new int[studentCnt];

		for (int a = 0; a < 5; a++) {

			for (int w = 0; w < studentCnt; w++) {
				for (int h = w+1; h < studentCnt; h++) {
					if(tempClassLeader[w][a] == tempClassLeader[h][a]) {
						score[w]++;
						score[h]++;
					}
				}
			}
		}

		// 0,1,2,3,4
		int answer = 0;
		for (int i = 0; i < studentCnt; i++) {
			if (score[i] > answer) {
				answer = i;
			}
		}

		System.out.println(answer+1);

	}
}
