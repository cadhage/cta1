import java.util.Arrays;
import java.util.Scanner;

public class class_23 {
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
	int temp[]=new int[1000];
	for (int i = 0; i <a.length; i++) {
		++temp[a[i]];
	}
	int c=0;
	for (int i = 0; i < 1000; i++) {
		c=Math.max(temp[i], c);
	}	
	System.out.println(a.length-c);
}
}
