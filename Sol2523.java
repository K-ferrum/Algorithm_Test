// 별 찍기 - 13

import java.util.Scanner;
public class Sol2523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = "";
		for(int i = 0; i < a; i++) {
			s += '*';
			System.out.println(s);
		}
		for(int i = 1; i < a; i++) {
			s = s.substring(1);
			System.out.println(s);
		}
		sc.close();
	}
}