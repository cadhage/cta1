import java.util.Scanner;

public class class_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextInt();
		}
		solver(a,b);
	}

	static void solver(int[] a, int[] b) {
		System.out.println(lcm(a));
		System.out.println(gcd(b));
		int s=lcm(a);
		int e=gcd(b),c=0;
		for (int i =s; i <=e; i=i+s) {
			if(e%i==0) c++;
		}
		System.out.println(c);
	}

	 static int gcd(int[] a) {
		int result=a[0];
		for (int i = 1; i < a.length; i++) {
			result=gcd_(a[i],result);
		}
		return result;
	}

	 static int gcd_(int aa, int bb) {
		if(bb==0) return aa;
		return gcd_(bb, aa%bb);
		
	}
	 static int lcm(int[] a) {
		     int ans = a[0]; 
		     for (int i = 1; i < a.length; i++) 
		         ans = (((a[i] * ans)) / 
		                 (gcd_(a[i], ans))); 
		   
		     return ans; 
	}

	 static int lcm_(int aa, int bb) {
		return aa*bb/gcd_(aa, bb);
		
	}

}
