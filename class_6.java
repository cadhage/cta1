import java.util.Scanner;

public class class_6 {
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
	System.out.print(best(a)+" ");
	System.out.print(worst(a));
	
}

static int worst(int[] a) {
	int s=a[0],c=0;
	for (int i = 0; i < a.length; i++) {
		if (a[i]<s) {
			c++;
			s=a[i];
		}
	}
	return c;
}

static int best(int[] a) {
	int s=a[0],c=0;
	for (int i = 1; i < a.length; i++) {
		if(s<a[i]) {c++;
		s=a[i];
		}
			
	}
	return c;
	// TODO Auto-generated method stub
//	return 0;
}
}
