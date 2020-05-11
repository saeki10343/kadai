import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		double total = 0;
		System.out.println("入力値の数");
		double N = scan.nextDouble();
		
		for(int a = 0; a < N;a++) {
			if(total > 100){
				System.out.println("合計が100を超えました");
				break;
			}
			System.out.println("入力値");
			double b = scan.nextDouble();
			if(b < 0){
				System.out.println(total);
				break;
			}
			total = total + b;
			System.out.println(total);


		}
		
	}

}
