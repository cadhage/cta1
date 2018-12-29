import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class class_37 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	for (int i = 0; i < n; i++) {
		String s=sc.nextLine();
		solver(s);
	}
}

static void solver(String s) {
	int tempf[]=new int[26];
	int tempb[]=new int[26];
	int sum=0;
	int frount=0;
	int back=0;
	if(s.length()%2!=0) System.out.println(-1);
	else {
	for (int i = 0; i < s.length()/2; i++) {
			++tempf[(int)(s.charAt(i)-'a')];
		}
		
		for (int i =s.length()/2; i < s.length(); i++) {
			--tempf[(int)(s.charAt(i)-'a')];
		}
		//System.out.println(Arrays.toString(tempf));
//	for (int i =s.length()/2; i < s.length()-1; i++) 
//	    {
//			++tempb[(int)(s.charAt(i)-'a')];
//		}
//		
//		for (int i =0; i < s.length()/2; i++) {
//			--tempb[(int)(s.charAt(i)-'a')];
//		}
//		System.out.println(Arrays.toString(tempb));
//	}
	for (int i = 0; i <26; i++) {
		if(tempf[i]>0) sum=sum+tempf[i];
	}
	System.out.println(sum);}
}}
