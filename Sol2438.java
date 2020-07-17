// 별 찍기 - 1

import java.util.Scanner;
public class Sol2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String st = "";
		for (int i = 1; i <= a; i++) {
			st += '*';
			System.out.println(st);
		}
		sc.close();
	}
}