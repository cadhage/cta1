import java.util.Scanner;

public class class_33 {
public static int a[]=new int[256];
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	for (int i = 0; i <n; i++) {
		String s=sc.nextLine();
		solver(s);
	}
	int max=0;
	for (int i = 0; i < a.length; i++) {
		max=Math.max(a[i], max);
	}
	int c=0;
	//System.out.println(max);
	for (int i = 0; i < a.length; i++) {
		if(max==n && max==a[i]) c++;
	}
	System.out.println(c);
}
static void solver(String s) {
	 boolean unique[]=new boolean[256];
	for (int i = 0; i < s.length(); i++) {
		unique[(int)s.charAt(i)-'a']=true;
	}
	String temp="";
	for (int i = 0; i < 256; i++) {
		if(unique[i]==true) temp=temp+(char)(i+(int)'a');
	}
	//System.out.println(temp);
	for (int i = 0; i <temp.length(); i++) {
		++a[(int)temp.charAt(i)-'a'];
	}
	
}
}
