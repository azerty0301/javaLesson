import java.util.Arrays;
public class ArrLesson4{
	public static void main(String[] args){
		/*
		int [] ArrA = {4, 8, 10};
		int [] ArrB = new int[] {7,1,3};
		for(int i=0; i<arrA.length; i++){
			System.out.println(arrA[i]);
		}
		for(int n:arrB){
			System.out.println(n);
		}
		int[] arrC = new int[3];
		for(int i=0; i<arrC.length; i++){
			arrC[i] = arrA[i]*2;
		}
		System.out.println(Arrays.toString(arrC));
		for(int i=0;i<arrC.length;i++){
			arrC[i]=arrC[i]+arrB[i];
		}
		System.out.println(Arrays.toString(arrC));
		int sum = 0;
		for(int n:arrC){
			sum+=n;
		}
		System.out.println("合計は" + sum + "です。");
		*/

		int[] data = new int[10];
		for(int i =0; i<data.length; i++ ){
			int dice = new Random().nextInt(6)+1;
			data[i]=dice;
		}
		System.out.println(Array.toString(data);

	}
}
