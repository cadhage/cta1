import java.util.Scanner;

public class class_19 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[26];
	for (int i = 0; i <26; i++) {
		a[i]=sc.nextInt();
	}
	sc.nextLine();
	String s=sc.nextLine();
	solver(a,s);
}

static void solver(int[] a, String s) {
	int n=s.length(),cal=1;
    int mul=1,max=0;
	for (int i = 0; i <s.length(); i++) {
		cal=(int)(s.charAt(i)-'a');
		//System.out.println(a[cal]);
		if(a[cal]>max) max=a[cal];
		//System.out.println(mul);
	}
	System.out.println(max*n);
}
}
