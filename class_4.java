import java.util.Arrays;
import java.util.Scanner;

public class class_4 {
public static void main(String[] args) {
	System.out.println("Hello_mom");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	divisionSum(a,n,x);
}

static void divisionSum(int[] a, int n, int x) {
	int c=0;
	Arrays.sort(a);
	for (int i = 0; i < a.length-1; i++) {
		for (int k = i+1; k < a.length; k++) {
			if((a[i]+a[k])%x==0) c++;
		}
	}
	System.out.println(c);
	// TODO Auto-generated method stub
	
}
}
