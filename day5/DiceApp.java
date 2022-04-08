import java.util.*;
public class DiceApp{
	public static void main(String[] args){
		/*
		 * サイコロを振ってそれが偶数か奇数かを判定する
		 *(実行結果)
		 4は偶数です
		 1は奇数です
		 */
		System.out.println("サイコロを振ってね");
		new Scanner(System.in).nextLine();
		int n = new Random().nextInt(6)+1;
		n = n % 2;
		if (n == 0){
			System.out.println("偶数");
		}else{
				System.out.println("奇数");
		
		}
	}
}
