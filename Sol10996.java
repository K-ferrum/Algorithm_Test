// 별 찍기 -21

import java.util.Scanner;
public class Sol10996 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = "";
		String ss = "";
		for (int i = 0; i < a; i++) {
			if(i % 2 != 0) {
				s += "*";
				ss += " ";
			}
			else {
				s += " ";
				ss += "*";
			}
		}
		for (int i = 0; i < a; i++) {
			System.out.println(ss);
			System.out.println(s);
		}
		sc.close();
	}
}