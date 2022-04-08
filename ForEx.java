import java.util.*;
public class ForEx{
	public static void main(String[] args){
		System.out.print("幅>>");
		int width = new Scanner(System.in).nextInt();
		for(int i= 0; i<3; i++){
			for(int j= 0; j<width; j++){
				int r = new Random().nextInt(9)+1;
				System.out.print(r);
			}
			System.out.println();
		}
	}
}
