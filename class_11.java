import java.util.Arrays;
import java.util.Scanner;

public class class_11 {
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
	int c=0;
	for (int i = 0; i < a.length-1;) {
		if(a[i]-a[i+1]==0) { c++;i=i+2;}
		else i++;
	}
	System.out.println(c);
}
}
