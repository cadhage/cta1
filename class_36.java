import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class class_36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		solver(s);
	}

static void solver(String s) {
	boolean flag=false;
	int c=0;
	int temp[]=new int[26];
	for (int i = 0; i <s.length(); i++) {
		++temp[(int)s.charAt(i)-'a'];
	}
	int sum=0;
	for (int i = 0; i <26; i++) {
		sum=sum+temp[i]%2;
	}
	if(sum>=2) System.out.println("NO");
	else System.out.println("YES");
    //System.out.println(al);
}
}
