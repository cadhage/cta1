import java.lang.reflect.Array;
import java.util.Scanner;

public class class_25 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int q=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	for (int i = 0; i <q; i++) {
		int x=sc.nextInt();
		int y=sc.nextInt();
		solver(a,x,y);
	}
}

static void solver(int[] a, int x, int y) {
//	for (int i = x; i <=y; i++) {
//		min(a,x,y);
//	}
	System.out.println(min(a, x, y));
}

static int min(int[] a,int x,int y) {
	int min=Integer.MAX_VALUE;
     for (int i = x; i <=y; i++) {
		min=Math.min(a[i], min);
	}
     return min;
}
}
