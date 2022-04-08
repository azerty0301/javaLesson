import java.util.*;
public class Kuku{
	public static void main(String[] args){
		System.out.print("START>>");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("END>>" );
		int num2 = new Scanner(System.in).nextInt();
		for(int i = num1; i<= num2; i++){
			for(int j = 1; j<=9; j++){
			System.out.printf("%d*%d=%2d ", i, j, i*j);
			}
			System.out.println();
		}
	}
}
