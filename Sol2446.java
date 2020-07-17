// 별 찍기 - 9

import java.util.Scanner;
public class Sol2446 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = "";
		String b = "";
		if (a == 1) {
			System.out.println('*');
		}
		int x = (a*2) - 1;
		for (int i = 0; i < x; i++) {
			s += "*";
		}
		for (int i = 1; i < a; i++) {
			System.out.println(b+s);
			b += " ";
			s = s.substring(1);
			s = s.substring(1);
		}
		for (int i = 1; i < a; i++) {
			System.out.println(b+s);
			if (b.length() == 1) {
				s += "**";
				System.out.println(s);
				break;
			}
			b = b.substring(1);
			s += "**";
		}
		sc.close();
	}
}