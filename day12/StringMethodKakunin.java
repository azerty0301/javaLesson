import java.util.*;
public class StringMethodKakunin{
	public static void main(String[] args){
		System.out.println("数字をカンマ区切りで入力>>");
		String num = new Scanner(System.in).nextLine();
		int sum = 0;

		String[] numbers=num.split(",");
		for(int i=0; i<numbers.length; i++ ){
			sum = Integer.parseInt(numbers[i])+sum;//sum += Integer.parseInt(numbers[i]);と同じ意味

		}
		System.out.println(sum);

	}
}
