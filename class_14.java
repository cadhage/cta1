import java.util.Arrays;
import java.util.Scanner;
//Solve it again
public class class_14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	solver(a);
}

 static void solver(int[] a) {
	 Arrays.sort(a);
	 int c=0,max=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i; j < a.length; j++) {
		if(Math.abs(a[i]-a[j])<=1) { c++;
		//max=Math.max(max,c);
		}}
		if(c>max) max=c;
		c=0;
	}
	System.out.println(max);
}
}
