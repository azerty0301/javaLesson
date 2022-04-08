import java.util.*;
public class AkitaTest{
	public static void main(String[] args){
		System.out.print("正の整数>>");
		int n= new Scanner(System.in).nextInt();
		String ans1 = "偶数";
		String ans2 = "奇数";
		if(n%2==0){
			System.out.println("あなたが入れた数字は"+ans1+"です");
		}else if(n%2!=0){
			System.out.println("あなたが入れた数字は"+ans2+"です");
		}
	}
}
