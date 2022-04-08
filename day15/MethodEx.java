import java.util.*;
public class MethodEx{
	public static void main(String[] args){
		int[][] nums = new int [3][3];
		int count = 0;
		for(int i=0;i<nums.length;i++){
			for(int j=0; j<nums[i].length; j++){
				nums[i][j] = new Random().nextInt(3)+1;
				System.out.print(nums[i][j]);
			}
			boolean isSame = isSame(nums[i]);//returnからここのisSameに代入される。引数の種類と数は一致していなければならない。
			if(isSame){
				count++;
			}
			System.out.println();
		}
		System.out.println(count == 0 ? "Lose..." : count + "line win");
	}
	public static boolean isSame(int[] arr){//isSame:メソッド名（クラス名）int[]:引数の種類arr:引数の値(2つ合わせて引数)　引数の種類と数は一致していないといけない。
		int first = arr[0];
		for(int i=1; i<arr.length;i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}

}
