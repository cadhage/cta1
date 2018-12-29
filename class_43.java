import java.util.Scanner;

public class class_43 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i <n; i++) {
			a[i]=sc.nextInt();
		}
		solver(a,0,a.length-1);
	}

 static void solver(int[] a,int low,int high) {
	   int piot=a[0];
	   int i=high;
		for (int j = high; j>0; j--) {
			if(piot<=a[j]) {
				//System.out.println(a[i]+" "+a[j]);
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i--;
			}
		}
		int temp=a[i];
		a[i]=a[low];
		a[low]=temp;
		printa(a);
	}
 static void printa(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
