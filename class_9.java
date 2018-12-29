import java.util.Scanner;

public class class_9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int x=sc.nextInt();
	int c=sc.nextInt();
	solver(a,x,c);
}

static void solver(int[] a, int x, int c) {
	int cc=0;
	for (int i = 0; i < a.length-c+1; i++) {
		int sum=0;
		for (int j = i; j <i+c; j++) {
			sum=a[j]+sum;
		}
		if(sum==x) cc++;
	}
	System.out.println(cc);
}
}
