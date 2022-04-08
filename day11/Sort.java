import java.util.*;
public class Sort{
	public static void main(String[] args){/*
																						int[] data={3,1,5,2,7};
																						System.out.println(Arrays.toString(data));
		//単純ソート（昇順）
		for(int i=0; i<data.length-1; i++){
		for(int j=i+1; j<data.length; j++){
		if(daya[i]>data[j]){//降順にするときは個々の不等号を逆にする。
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;
		}
		}
		}
		*/
		System.out.print("何人ですか>？");
			int member = new Scanner(System.in).nextInt();
		int[] members = new int[member];


		for(int i=0; i<member; i++ ){
			members[i]=new Random().nextInt(101);

		}

		for(int i=0; i<members.length-1; i++){
			for(int j=i+1; j<members.length; j++){
				if(members[i]<members[j]){
					int temp = members[i];
					members[i] = members[j];
					members[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(members));


	}
}
