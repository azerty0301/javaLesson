import java.util.*;
public class MarryApp{
	public static void main(String[] args){
		/*
		 * 女性16,男性18
		 * 32歳で女性のあなたは結婚できます
		 * 17歳で男性のあなたは結婚できません
		 *
		 * */
		/*DRY(Don't Repeat Yourself 同じことを2度しない。)
		 */

	
		System.out.println("性別(男性,女性)>>");
		String gender = new Scanner(System.in).next();
		System.out.print("年齢>>");
		int age = new Scanner(System.in).nextInt();
	/*	if (gender.equals("男")){
			if(age >=18){
	System.out.println(age + "歳で" + gender + "のあなたは結婚できます");
	}else if(age<=17){
	System.out.println(age + "歳で" + gender + "のあなたは結婚できません");
	}

	}

		if (gender.equals("女")){
			if(age >=16){
	System.out.println(age + "歳で" + gender + "のあなたは結婚できます");
	}else if(age<=15){
	System.out.println(age + "歳で" + gender + "のあなたは結婚できません");
	}
		}
	}
}

*/

if((gender.equals("女性") && age >= 16 )|| (gender.equals("男性") && age >= 18)){
	System.out.println(age + "歳で" + gender + "のあなたは結婚できます");
}else{
	System.out.println(age + "歳で" + gender + "のあなたは結婚できません");
}
}
}
