import java.util.*;
public class PrintfLesson{
	public static void main(String[] args){
		System.out.println(Math.PI);
		System.out.printf("%.2f%n", Math.PI);
		System.out.printf("Hello");

		int num = 32535325;
		System.out.printf("%.d",num);

		String name = "山田";
		int age = 23;
		System.out.prntf("こんにち%5(%d歳)さん!%n",age,name);
		
		System.out.printf("%,5d%n",34);
		System.out.printf("%,5d%n",2532);
		System.out.printf("%,5d%n",426);
		System.out.printf("%,5d%n",1234);

	}
}
