import java.util.*;
public class MondaiSakusei{
	public static void main(String[] args){
		/*変数a,bに数字を入力すると、aのb乗を求めて下記の実行結果のように表示してください。
			実行結果：
			2の3乗は8です。*/
		System.out.print("値aを入力してください>>");
		int a = new Scanner(System.in).nextInt(); //底は変数a
		System.out.print("値bを入力してください>>");
		int b = new Scanner(System.in).nextInt(); //指数は変数b
		int ans = 1; //変数に底aを掛けていくので、初期値を1とする

		for(int i=0; i<b; i++){
			ans = ans*a;
		}
		System.out.println(a + "の" + b + "乗は" + ans + "です。");

	}
}
