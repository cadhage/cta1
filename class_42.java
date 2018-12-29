import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*; 
public class class_42 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		solver(a);
	}
static void solver(int[] a) {
int c=0;
	for (int i = 1; i < a.length; i++) {
//		int x=a[i];
//		int k=0;
//		for (k =i-1; k>=0 && x <a[k];) {
//			a[k+1]=a[k];
//			k--;
//			printa(a);
//		}
//		a[k+1]=x;
		int j=0;
		int key=a[i];
		for (j = i-1;j>=0 && a[j]>key; j--) {
			a[j+1]=a[j];
			c++;
			
		}
		a[j+1]=key;
		//printa(a);
	}
	System.out.println(c);	
	//printa(a);
	}
static void printa(int[] a) {
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
}

}
