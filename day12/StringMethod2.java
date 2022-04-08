import java.util.*;
public class StringMethod2{
	public static void main(String[] args){
		//文字列の置換

		//:を,に置換
		String str="apple:orange:banana";
		str=str.replace(":",",");
		System.out.println(str);
		//,で区切られた文字列を配列に格納
		String[] data=str.split(",");
		System.out.println(Arrays.toString(data));
		//配列に格納された文字列をスペースで区切ってString型resultに代入
		String result=String.join(" ", data);
		System.out.println(result);


	}
}
