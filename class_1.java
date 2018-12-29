import java.util.Scanner;

public class class_1 {
public static void main(String[] args) {
	System.out.println("Hello");
	System.out.println("do it");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	result(a,a.length);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}

static void result(int[] a, int length) {
	for (int i = 0; i < a.length; i++) {
		if(a[i]>35) {
			if(a[i]%5>=3) a[i]=a[i]+(5-a[i]%5);
		}
	}
	// TODO Auto-generated method stub
	
}
}
