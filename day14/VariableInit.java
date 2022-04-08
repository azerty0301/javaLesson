import java.util.*;
public class VariableInit{
	public static void main(String[] args){
		/* ng
		int n;
		System.out.println(n);
		*/
		/* ng
		 * javaは条件式に入っている変数を調査しない
		int n;
		int x=5;
		if(x>0){
			n=10;
		}
		System.out.println(n);
		*/
		/* OK
		int n;
		if(5>0){
			n=10;
		}
		System.out.println(n);
		*/
		/*
		 * OK
		 * if~else文はどちらか一方がとおることが保障されている文なので
		int n;
		itn x=5;
		if(x>0){
			n=10;
		}else{
			n=20
		}
		System.out.println(n);
		*/
		/*NG
		int n;
		int X=5;
		if(x>0){
			n=10;
		}else if(x<=0){
			n=20
		}
		System.out.println(n);
		*/
		/*
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else{
			n=30;
		}
		System.out.println(n);
		*/
	int n =new Random().nextInt(3);
	String fortune;
	switch(n){
		case 0:
			fortune="大吉";
break;
case 1
	}

		

	int n;
	do{
		n=10;
	}while(false);
	System.out.println
		}


	int n;
	for(;;){
		n=3;
		break;
	}
	System.out.println(n);
	*/
/*
		int n;
	for(int i=0; i<10;i++){
		n=3;
	}
		}
	}
}
