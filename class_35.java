import java.util.Scanner;

public class class_35 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	for (int i = 0; i <n; i++) {
		String a=sc.nextLine();
		String b=sc.nextLine();
		solver(a,b);
	}
}

static void solver(String a, String b) {
	String aa=uninque1(a);
	String bb=uninque1(b);
	boolean flag=false;
	int temp[]=new int[256];
	for (int i = 0; i <aa.length(); i++) {
		++temp[(int)aa.charAt(i)-'a'];
	}
	for (int i = 0; i <bb.length(); i++) {
		if(temp[(int)bb.charAt(i)-'a']==1) flag=true;
	}
	if(flag) System.out.println("YES");
	else System.out.println("NO");
	
}

static String uninque1(String s) {
	
	 boolean unique[]=new boolean[256];
		for (int i = 0; i < s.length(); i++) {
			unique[(int)s.charAt(i)-'a']=true;
		}
		String temp="";
		for (int i = 0; i < 256; i++) {
			if(unique[i]==true) temp=temp+(char)(i+(int)'a');
		}
		return temp;
}
}
