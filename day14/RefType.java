import java.util.*;
public class RefType{
	public static void main(String[] args){
		int a =10;
		int b =a;
		b++;
		System.out.println(a);
		System.out.println(b);

		int[] arrA = new int[]{3,5};
		int[] arrB = arrA;
		arrB[0]=100;
		System.out.println(arrA[0]);
		System.out.println(arrB[0]);

		int x = 0;

		int[] arrC= null;
		System.out.println(arrC);

		int[] arrD = {1,2,3};//これを指した後にすぐ下のを指している。誰も指している人がいなくなるとそれはゴミになる。→ガーベージコレクションへ。
		arrD=new int[]{3,5,7};
		arrD=null;

		int[] arrE = {2,3,4};
		int[] arrF = arrE;
		arrE = null;
		//Fがまだ指しているから、{2,3,4}の配列はゴミではない。
	}
}
