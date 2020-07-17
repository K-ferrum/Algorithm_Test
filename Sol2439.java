// 별 찍기 - 2

import java.util.Scanner;
public class Sol2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String st = "";
		for (int j = 1; j < a; j++) {
			st += " ";
		}
		for (int i = 1; i <= a; i++) {
			st += "*";
			System.out.println(st);
			st = st.substring(1);
		}
		sc.close();
	}
}