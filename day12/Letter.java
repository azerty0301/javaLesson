import java.util.*;
public class Letter{
	public static void main(String[] args){
		System.out.print("英文>>");
		String letter = new Scanner(System.in).nextLine();
		for(int i=0; letter.length(); i++){
			System.out.print(letter.charAt(i));
			if((i+1)%5==0){
				System.out.println();
			}
		}
		System.out.println();

		int offset=5;
		for(int i=0;letter.length();i+=offset){
			String str = letter.substring(i,Math.min(i+offset,letter.length()));
		}
	}
}
