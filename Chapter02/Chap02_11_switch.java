import java.util.Scanner;

public class Chap02_11_switch {

		public static void main(String args[]) {
			
			Scanner scan=new Scanner(System.in);
			
			System.out.print("달을 입력하세요(1~12)>>");
			int month=scan.nextInt();
			
			if ((month>=1)&&(month<=12)) {
				switch (month) {
				case 3: case 4: case 5:
					System.out.println("봄");
					break;
				case 6: case 7: case 8:
					System.out.println("여름");
					break;
				case 9: case 10: case 11:
					System.out.println("가을");
					break;
				case 12: case 1: case 2:
					System.out.println("겨울");
					break;
				}
			}
			else
				System.out.println("잘못입력");
		}
				
}