import java.util.*;
public class For2{
	public static void main(String[] args){
		System.out.println("いくつ?>>");
		int n = new Scanner(System.in).nextInt();
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.println("*");
			}
		}
		System.out.println();
	}
}
